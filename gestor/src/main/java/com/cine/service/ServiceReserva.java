package com.cine.service;

import com.cine.entity.Reserva;

import java.util.List;

public class ServiceReserva extends Service<Reserva> {
    public ServiceReserva(List<Reserva> reservas) {
        super(reservas);
    }
}
