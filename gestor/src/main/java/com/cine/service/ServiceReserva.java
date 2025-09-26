package com.cine.service;

import com.cine.entity.Butaca;
import com.cine.entity.Cliente;
import com.cine.entity.Detalle;
import com.cine.entity.Funcion;
import com.cine.entity.Reserva;
import com.cine.exception.NoButacaAvailable;
import com.cine.util.UUID;

import java.util.Date;
import java.util.List;

import static com.cine.service.ServiceButaca.BUTACA_PREMIUM_PRICE_EXTRA;
import static com.cine.service.ServiceSala.SALA_PREMIUM_PRICE_EXTRA;


public class ServiceReserva extends Service<Reserva> {
    private static ServiceReserva instance;

    private ServiceReserva(List<Reserva> reservas) {
        super(reservas);
    }

    public static ServiceReserva getInstance() {
        if (instance == null) {
            instance = new ServiceReserva(new java.util.ArrayList<>());
        }
        return instance;
    }

    public Reserva createReserva(Cliente cliente, Funcion funcion, int cantButacas, ServiceDetalle serviceDetalle) throws NoButacaAvailable {
        if(cantButacas > funcion.getButacas().stream().filter(b -> !b.getEstado()).count())
            throw new NoButacaAvailable("No hay butacas disponibles");

        Reserva r = Reserva.builder()
                .uuid(UUID.generarUUID())
                .cliente(cliente)
                .fechaReserva(new Date())
                .estadoReserva(true)
                .build();

        for(int i = 0; i < cantButacas; i++) {
            Butaca butaca = funcion.getButacas().stream()
                    .filter(b -> !b.getEstado())
                    .findFirst()
                    .get();

            butaca.setEstado(true);
            Double subtotal = funcion.getPrecioUnitario();
            subtotal += butaca.getPremium() ? BUTACA_PREMIUM_PRICE_EXTRA : 0.0;
            subtotal += funcion.getSala().getIs3D() ? SALA_PREMIUM_PRICE_EXTRA : 0.0;

            Detalle d = Detalle.builder()
                    .uuid(UUID.generarUUID())
                    .butaca(butaca)
                    .funcion(funcion)
                    .precioSubtotal(subtotal)
                    .reserva(r)
                    .build();

            serviceDetalle.add(d);
        }

        // CALCULO PRECIO TOTAL
//        Double precioTotal = 0.0;
//        for(Detalle d : serviceDetalle.getAll()) {
//            if(d.getReserva().getUuid().equals(r.getUuid())) {
//                precioTotal += d.getPrecioSubtotal();
//            }
//        }

        // Alternativa con streams
        Double total = serviceDetalle.getAll().stream()
                .filter(detalle -> detalle.getReserva().getUuid().equals(r.getUuid()))
                .mapToDouble(Detalle::getPrecioSubtotal)
                .sum();

        r.setPrecioTotal(total);
        this.add(r);
        return r;
    }
}
