package com.cine.service;

import com.cine.entity.Cliente;

import java.util.List;


public class ServiceCliente extends  Service<Cliente> {
    private static ServiceCliente instance;

    private ServiceCliente(List<Cliente> clientes) {
        super(clientes);
    }

    public static ServiceCliente getInstance() {
        if (instance == null) {
            instance = new ServiceCliente(new java.util.ArrayList<>());
        }
        return instance;
    }
}
