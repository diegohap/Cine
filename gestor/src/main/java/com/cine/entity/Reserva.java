package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Reserva {
    private String uuid;
    private Cliente cliente;
    private Double precioTotal;
    private Date fechaReserva;
    private Boolean estadoReserva;
    private List<Detalle> detalles;
}
