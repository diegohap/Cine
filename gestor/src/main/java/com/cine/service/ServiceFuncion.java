package com.cine.service;

import com.cine.entity.Funcion;

import java.util.List;

public class ServiceFuncion extends Service<Funcion> {
    public ServiceFuncion(List<Funcion> funciones) {
        super(funciones);
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
