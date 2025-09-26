package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class Reserva {
    private String uuid;
    private Cliente cliente;
    private Double precioTotal;
    private Date fechaReserva;
    private Boolean estadoReserva;

    @Override
    public String toString() {
        return "Reserva{" +
                "uuid='" + uuid + '\'' +
                ", cliente=" + cliente +
                ", precioTotal= " + String.format("%.2f",precioTotal) +
                ", fechaReserva: " + fechaReserva +
                ", estadoReserva: " + estadoReserva +
                '}';
    }
}
