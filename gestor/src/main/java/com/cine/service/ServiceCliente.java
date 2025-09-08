package com.cine.service;

import com.cine.entity.Cliente;

import java.util.List;

public class ServiceCliente extends  Service<Cliente> {
    public ServiceCliente(List<Cliente> clientes) {
        super(clientes);
    }
}
