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

        ServiceIdioma serviceIdioma = new ServiceIdioma(new ArrayList<>());
        ServiceButaca serviceButaca = new ServiceButaca(new ArrayList<>());
        ServicePelicula servicePelicula = new ServicePelicula(new ArrayList<>());
        ServiceSala serviceSala = new ServiceSala(new ArrayList<>());
        ServiceFuncion serviceFuncion = new ServiceFuncion(new ArrayList<>());
        ServiceCliente serviceCliente = new ServiceCliente(new ArrayList<>());
        ServiceDetalle serviceDetalle = new ServiceDetalle(new ArrayList<>());
        ServiceReserva serviceReserva = new ServiceReserva(new ArrayList<>());
        ServiceFactura serviceFactura = new ServiceFactura(new ArrayList<>());

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