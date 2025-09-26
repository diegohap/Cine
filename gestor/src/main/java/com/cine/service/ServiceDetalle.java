package com.cine.service;

import com.cine.entity.Detalle;

import java.util.List;


public class ServiceDetalle extends Service<Detalle>{
    private static ServiceDetalle instance;

    private ServiceDetalle(List<Detalle> detalles) {
        super(detalles);
    }

    public static ServiceDetalle getInstance() {
        if (instance == null) {
            instance = new ServiceDetalle(new java.util.ArrayList<>());
        }
        return instance;
    }
}
