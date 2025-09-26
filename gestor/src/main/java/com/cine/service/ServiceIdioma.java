package com.cine.service;

import com.cine.entity.Idioma;

import java.util.List;
import java.util.Optional;


public class ServiceIdioma {
    private static ServiceIdioma instance;
    private List<Idioma> idiomas;

    private ServiceIdioma(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public static ServiceIdioma getInstance() {
        if (instance == null) {
            instance = new ServiceIdioma(new java.util.ArrayList<>());
        }
        return instance;
    }

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
