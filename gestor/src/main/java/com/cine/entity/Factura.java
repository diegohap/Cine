package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class Factura {
    private String uuid;
    private Reserva reserva;
    private Date fecha;
}
