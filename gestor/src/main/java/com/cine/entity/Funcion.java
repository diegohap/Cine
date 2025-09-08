package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class Funcion {
    private String uuid;
    private Sala sala;
    private Pelicula pelicula;
    private Date horario;
    private Double precioUnitario;
}
