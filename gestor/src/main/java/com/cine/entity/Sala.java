package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Sala {
    private String uuid;
    private Integer numero;
    private Boolean isPremium;
    private Boolean is3D;
    private List<Butaca> butacas;

    @Override
    public String toString() {
        return "Sala{" +
                "uuid='" + uuid + '\n' +
                ", numero=" + numero + '\n' +
                ", isPremium=" + isPremium + '\n' +
                ", is3D=" + is3D + '\n' +
                ", butacas ocupadas =" + butacasOcupadas() +'\n' +
                ", butacas libres =" + butacasLibres() + '\n' +
                ", capacidad de butacas =" + butacas.size() +
                '}';
    }

    public Integer butacasOcupadas() {
        Integer ocupadas = 0;
        for(Butaca butaca : butacas) {
            if(butaca.getEstado()) {
                ocupadas++;
            }
        }
        return  ocupadas;
    }

    public Integer butacasLibres() {
        return (int) butacas.stream().filter(butaca -> !butaca.getEstado()).count();
    }
}
