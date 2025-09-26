package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Data
@Builder
public class Pelicula {
    private String uuid;
    private String titulo;
    private Double rating5stars;
    private Idioma idioma;
    private String genero;
    private Integer duracionMin;

    @Override
    public String toString() {
        return "Pelicula{" +
                "uuid='" + uuid + '\'' +
                ", titulo='" + titulo + '\'' +
                ", rating5stars=" + rating5stars +
                ", idioma=" + idioma +
                ", genero='" + genero + '\'' +
                ", duracionMin=" + duracionMin +
                '}';
    }
}
