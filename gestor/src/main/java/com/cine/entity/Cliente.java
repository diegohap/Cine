package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter
        ;

@AllArgsConstructor
@Getter
@Builder
public class Cliente {
    @Setter
    private String uuid;
    private String nombre;
    private String apellido;
    @Setter
    private String email;
    @Setter
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = capitalize(nombre);
    }

    public void setApellido(String apellido) {
        this.apellido = capitalize(apellido);
    }

    private String capitalize(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra;
        }
        palabra = palabra.toLowerCase(); // todo en minúscula
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "uuid='" + uuid + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
