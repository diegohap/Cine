package com.cine;

import com.cine.bootstrap.DataInitializer;
import com.cine.entity.Butaca;
import com.cine.entity.Sala;
import com.cine.service.*;
import com.cine.util.UUID;

import java.util.ArrayList;
import java.util.List;


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

        DataInitializer.initialize(serviceIdioma,
                                   servicePelicula,
                                   serviceButaca,
                                   serviceSala,
                                   serviceFuncion,
                                   serviceCliente,
                                   serviceDetalle,
                                   serviceReserva,
                                   serviceFactura);

//        System.out.println("Salas disponibles" + serviceSala.toString());
//        System.out.println(serviceSala.getAll().toString());

        // Ejemplo de uso: Listar todas las funciones
        System.out.println("Funciones disponibles: " + serviceFuncion.toString());
    }
}