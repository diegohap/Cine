package com.cine;

import com.cine.bootstrap.Runner;
import com.cine.service.ServiceButaca;
import com.cine.service.ServiceCliente;
import com.cine.service.ServiceDetalle;
import com.cine.service.ServiceFactura;
import com.cine.service.ServiceFuncion;
import com.cine.service.ServiceIdioma;
import com.cine.service.ServicePelicula;
import com.cine.service.ServiceReserva;
import com.cine.service.ServiceSala;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ServiceIdioma serviceIdioma = ServiceIdioma.getInstance();
        ServiceButaca serviceButaca = ServiceButaca.getInstance();
        ServicePelicula servicePelicula = ServicePelicula.getInstance();
        ServiceSala serviceSala = ServiceSala.getInstance();
        ServiceFuncion serviceFuncion = ServiceFuncion.getInstance();
        ServiceCliente serviceCliente = ServiceCliente.getInstance();
        ServiceDetalle serviceDetalle = ServiceDetalle.getInstance();
        ServiceReserva serviceReserva = ServiceReserva.getInstance();
        ServiceFactura serviceFactura = ServiceFactura.getInstance();

        Runner.initialize(serviceIdioma,
                servicePelicula,
                serviceButaca,
                serviceSala,
                serviceFuncion,
                serviceCliente,
                serviceDetalle,
                serviceReserva,
                serviceFactura);
    }
}