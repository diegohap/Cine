package com.cine.service;

import com.cine.entity.Pelicula;

import java.util.List;


public class ServicePelicula extends Service<Pelicula> {
    private static ServicePelicula instance;

    private ServicePelicula(List<Pelicula> peliculas) {
        super(peliculas);
    }

    public static ServicePelicula getInstance() {
        if (instance == null) {
            instance = new ServicePelicula(new java.util.ArrayList<>());
        }
        return instance;
    }
}
