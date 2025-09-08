package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Cliente {
    private String uuid;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
