package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@Data
@Builder
public class Funcion {
    private String uuid;
    private Sala sala;
    private Pelicula pelicula;
    private Date horario;
    private Double precioUnitario;
    private List<Butaca> butacas;

    public Integer getButacasDisponibles() {
        return sala.getCantButacas() - (int)butacas.stream().filter(Butaca::getEstado).count();
    }

    @Override
    public String toString() {
        return "Funcion{" +
                " uuid='" + uuid + '\n' +
                " sala=" + sala +'\n' +
                " pelicula:" + pelicula +'\n' +
                " horario:" + horario + '\n' +
                " precioUnitario= $" + String.format("%.2f", precioUnitario) + '\n' +
                " butacas disponibles:" + getButacasDisponibles() +
                '}';
    }
}
