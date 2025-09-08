package com.cine.service;

import com.cine.entity.Pelicula;

import java.util.List;

public class ServicePelicula extends Service<Pelicula> {
    public ServicePelicula(List<Pelicula> peliculas) {
        super(peliculas);
    }
}
