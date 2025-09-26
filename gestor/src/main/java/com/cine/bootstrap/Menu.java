package com.cine.bootstrap;

import com.cine.entity.Cliente;
import com.cine.entity.Funcion;
import com.cine.entity.Reserva;
import com.cine.service.Service;
import com.cine.service.ServiceButaca;
import com.cine.service.ServiceCliente;
import com.cine.service.ServiceDetalle;
import com.cine.service.ServiceFactura;
import com.cine.service.ServiceFuncion;
import com.cine.service.ServiceIdioma;
import com.cine.service.ServicePelicula;
import com.cine.service.ServiceReserva;
import com.cine.service.ServiceSala;
import com.cine.util.UUID;

import java.util.Scanner;


public class Menu {

    private Scanner sc = new Scanner(System.in);

    public void showMainMenu(ServiceIdioma serviceIdioma,
                             ServicePelicula servicePelicula,
                             ServiceButaca serviceButaca,
                             ServiceSala serviceSala,
                             ServiceFuncion serviceFuncion,
                             ServiceCliente serviceCliente,
                             ServiceDetalle serviceDetalle,
                             ServiceReserva serviceReserva,
                             ServiceFactura serviceFactura) {

        int op = 1;
        while (op != 0) {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Ver listsa de clientes");
            System.out.println("3. Eliminar cliente por UUID");
            System.out.println("4. Ver cartelera");
            System.out.println("5. Ver detalle de funciones");
            System.out.println("6. Ver reservas");
            System.out.println("7. Crear nueva reservas");
            System.out.println("8. Cancelar reservas");
            System.out.println("0. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    crearCliente(serviceCliente);
                    break;
                case 2:
                    showListPaged(serviceCliente);
                    break;
                case 3:
                    deleteCliente(serviceCliente);
                    break;
                case 4:
                    showListPaged(servicePelicula);
                    break;
                case 5:
                    showFunctionInformation(serviceFuncion);
                    break;
                case 6:
                    showListPaged(serviceReserva);
                    break;
                case 7:
                    createNewReserva(serviceReserva, serviceCliente, serviceFuncion, serviceDetalle);
                    break;
                case 8:
                    cancelReserva(serviceReserva, serviceDetalle);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }

            if(op==0) {
                break;
            }
        }

    }

    private void crearCliente(ServiceCliente serviceCliente) {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        String apellido = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el email del cliente: ");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el teléfono del cliente: ");
        String telefono = new Scanner(System.in).nextLine();

        Cliente c = Cliente.builder()
                .uuid(UUID.generarUUID())
                .nombre(nombre)
                .apellido(apellido)
                .email(email)
                .telefono(telefono)
                .build();
        System.out.println(c.toString());

        serviceCliente.add(c);
    }

    private void deleteCliente(ServiceCliente serviceCliente) {
        System.out.println("Busque el número de cliente a eliminar: ");
        showListPaged(serviceCliente);
        sc.nextLine();
        System.out.println("Ingrese el número de cliente a eliminar: ");
        Integer num = Integer.valueOf(sc.nextLine());
        Cliente c = serviceCliente.getAll().get(num - 1);
        try {
            serviceCliente.remove(c);
            System.out.println("Cliente eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }

    private void createNewReserva(ServiceReserva serviceReserva, ServiceCliente serviceCliente, ServiceFuncion serviceFuncion, ServiceDetalle serviceDetalle) {
        Cliente c = getElementByNumber(serviceCliente, "cliente");
        System.out.println(c.toString());
        Funcion f = getElementByNumber(serviceFuncion, "función");
        System.out.println(f.toString());
        System.out.println("Ingrese la cantidad de butacas a reservar: ");
        Integer cantButacas = Integer.valueOf(sc.nextLine());
        try {
            Reserva r = serviceReserva.createReserva(c, f, cantButacas, serviceDetalle);
            System.out.println("Reserva creada correctamente");
            System.out.println(r.toString());
            System.out.println("Detalles de la reserva: ");
            serviceDetalle.getAll().stream()
                    .filter(d -> d.getReserva().getUuid().equals(r.getUuid()))
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al crear reserva: " + e.getMessage());
        }
    }

    private void cancelReserva(ServiceReserva serviceReserva, ServiceDetalle serviceDetalle) {
        Reserva r = getElementByNumber(serviceReserva, "reserva");
        System.out.println(r.toString());
        try {
            r.setEstadoReserva(false);
            // Liberar las butacas
            serviceDetalle.getAll().stream()
                    .filter(d -> d.getReserva().getUuid().equals(r.getUuid()))
                    .forEach(d -> d.getButaca().setEstado(false));
            System.out.println("Reserva cancelada correctamente");
        } catch (Exception e) {
            System.out.println("Error al cancelar reserva: " + e.getMessage());
        }
    }

    private <T> T getElementByNumber(Service<T> service, String nombreElemento) {
        System.out.println("Busca el número de " + nombreElemento + " para la reserva: ");
        showListPaged(service);
        sc.nextLine();
        int max = service.getAll().size();
        Integer op = -1;
        while(op < 1 || op > max) { // TODO: terminar !
            System.out.println("Ingresa el número de " + nombreElemento + " para la reserva: ");
            op = Integer.valueOf(sc.nextLine());
        }
        return service.getAll().get(op - 1);
    }

    private void showFunctionInformation(ServiceFuncion serviceFuncion) {
        System.out.println("Lista de funciones: ");
        showListPaged(serviceFuncion);
        sc.nextLine();
        System.out.println("Ingrese el número de función para ver detalles: ");
        Integer num = sc.nextInt();
        System.out.println(serviceFuncion.showInformation(serviceFuncion.getAll().get(num - 1)));
    }

    private void showListPaged(Service service) {
        service.showAllPaged();
    }
}
