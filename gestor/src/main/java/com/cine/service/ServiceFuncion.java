package com.cine.service;

import com.cine.entity.Butaca;
import com.cine.entity.Funcion;

import java.util.List;


public class ServiceFuncion extends Service<Funcion> {
    private static ServiceFuncion instance;
    private final int FILAS = 20;

    private ServiceFuncion(List<Funcion> funciones) {
        super(funciones);
    }

    public static ServiceFuncion getInstance() {
        if (instance == null) {
            instance = new ServiceFuncion(new java.util.ArrayList<>());
        }
        return instance;
    }

    public String showInformation(Funcion funcion) {
        String s = "";
        s += "butacas totales: " + funcion.getSala().getCantButacas() + "\n";
        s += "butacas vendidas: " + (funcion.getSala().getCantButacas() - funcion.getButacasDisponibles()) + "\n";
        s += "precio $" + String.format("%.2f", funcion.getPrecioUnitario()) + "\n";
        s += " /---------------------------------PANTALLA----------------------------------\\" + "\n";
        s += "/                                                                             \\" + "\n";
        int i = 0;
        for(Butaca b : funcion.getButacas()) {
            s += b.getEstado() ? (b.getPremium() ? "[P] " : "[x] ") : "[ ] ";
            if ((i + 1) % FILAS == 0) {
                s += "F" + ((i/FILAS)+1) + "\n";
            }
            i++;
        }

        return s;
    }

    @Override
    public String toString() {
        String s = "";
        for (Funcion funcion :getAll()) {
            s += funcion.toString() + '\n';
        }
        return s;
    }
}
