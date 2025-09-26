package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Data
@Builder
public class Sala {
    private String uuid;
    private Integer numero;
    private Boolean is3D;
    private Integer cantButacas;

    @Override
    public String toString() {
        return "Sala{" +
                "uuid='" + uuid + '\'' +
                ", numero=" + numero + '\'' +
                ", is3D=" + is3D + '\'' +
                ", capacidad de butacas =" + cantButacas +
                '}';
    }
}
