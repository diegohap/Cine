package com.cine.service;

import com.cine.entity.Factura;

import java.util.List;


public class ServiceFactura extends Service<Factura> {
    private static ServiceFactura instance;

    private ServiceFactura(List<Factura> factura) {
        super(factura);
    }

    public static ServiceFactura getInstance() {
        if (instance == null) {
            instance = new ServiceFactura(new java.util.ArrayList<>());
        }
        return instance;
    }
}
