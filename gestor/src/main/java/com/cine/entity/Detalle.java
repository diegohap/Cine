package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;


@AllArgsConstructor
@Builder
public class Detalle {
    @Setter
    private String uuid;
    @Setter
    private Funcion funcion;
    private Butaca butaca;
    @Setter
    private Reserva reserva;
    private Double precioSubtotal;
    private String descripcion;


    public String getUuid() {
        return uuid;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
        this.butaca.setEstado(true);
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Double getPrecioSubtotal() {
        return precioSubtotal;
    }

    public void setPrecioSubtotal(Double precioSubtotal) {
        this.precioSubtotal = precioSubtotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "uuid='" + uuid + '\'' +
                ", funcion=" + funcion +
                ", butaca=" + butaca +
                ", reserva=" + reserva +
                ", precioSubtotal=" + precioSubtotal +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
