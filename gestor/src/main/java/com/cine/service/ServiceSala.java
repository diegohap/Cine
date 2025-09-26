package com.cine.service;

import com.cine.entity.Sala;

import java.util.List;


public class ServiceSala extends Service<Sala> {
    public static final Double SALA_PREMIUM_PRICE_EXTRA = 3500.0;
    public ServiceSala(List<Sala> salas) {
        super(salas);
    }
    
    @Override
    public String toString() {
        return "";
    }
}
