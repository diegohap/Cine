package com.cine.service;

import com.cine.entity.Factura;

import java.util.List;

public class ServiceFactura extends Service<Factura> {
    public ServiceFactura(List<Factura> facturas) {
        super(facturas);
    }
}
