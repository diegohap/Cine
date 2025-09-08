package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Detalle {
    private String uuid;
    private Funcion funcion;
    private Butaca butaca;
    private Reserva reserva;
    private Double precioSubtotal;
    private String descripcion;
}
