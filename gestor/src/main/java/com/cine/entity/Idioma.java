package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Data
@Builder
public class Idioma {
    private Lenguaje audio;
    private Lenguaje subtitulos;
}
