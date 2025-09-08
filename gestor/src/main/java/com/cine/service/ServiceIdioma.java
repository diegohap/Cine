package com.cine.service;

import com.cine.entity.Idioma;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ServiceIdioma {
    private List<Idioma> idiomas;

    public void crearIdioma(Idioma idioma) {
        idiomas.add(idioma);
    }

    public Optional<Idioma> actualizarIdioma(Idioma idioma) {
        for (Idioma i : idiomas) {
            if (i.equals(idioma)) {
                i = idioma;
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    public Boolean eliminarIdioma(Idioma idioma) {
        return idiomas.remove(idioma);
    }

    public Optional<Idioma> buscarIdioma(Idioma idioma) {
        for (Idioma idioma1 : idiomas) {
            if (idioma1.equals(idioma)) {
                return Optional.of(idioma1);
            }
        }
        return Optional.empty();
    }

    public List<Idioma> listarIdiomas() {
        return idiomas;
    }
}
