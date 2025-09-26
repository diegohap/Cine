package com.cine.service;

import com.cine.entity.Sala;

import java.util.List;


public class ServiceSala extends Service<Sala> {
    private static ServiceSala instance;
    public static final Double SALA_PREMIUM_PRICE_EXTRA = 3500.0;

    private ServiceSala(List<Sala> salas) {
        super(salas);
    }

    public static ServiceSala getInstance() {
        if (instance == null) {
            instance = new ServiceSala(new java.util.ArrayList<>());
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
