package com.cine.bootstrap;

import com.cine.entity.*;
import com.cine.service.*;
import com.cine.util.UUID;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class DataInitializer {
    public static void initialize(ServiceIdioma serviceIdioma,
                                  ServicePelicula servicePelicula,
                                  ServiceButaca serviceButaca,
                                  ServiceSala serviceSala,
                                  ServiceFuncion serviceFuncion,
                                  ServiceCliente serviceCliente,
                                  ServiceDetalle serviceDetalle,
                                  ServiceReserva serviceReserva,
                                  ServiceFactura serviceFactura) {

        // Idiomas
        serviceIdioma.crearIdioma(Idioma.builder().audio(Lenguaje.ENG).subtitulos(Lenguaje.SPA).build());
        serviceIdioma.crearIdioma(Idioma.builder().audio(Lenguaje.SPA).subtitulos(Lenguaje.NONE).build());
        List<Idioma> idiomas = serviceIdioma.listarIdiomas();

        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Dark Knight", 4.8, idiomas.get(0), "Action", 152));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Inception", 4.7, idiomas.get(1), "Sci-Fi", 148));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Fight Club", 4.8, idiomas.get(0), "Drama", 139));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Forrest Gump", 4.9, idiomas.get(1), "Drama", 142));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Matrix", 4.7, idiomas.get(0), "Sci-Fi", 136));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Goodfellas", 4.6, idiomas.get(1), "Crime", 146));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Se7en", 4.6, idiomas.get(0), "Thriller", 127));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Silence of the Lambs", 4.7, idiomas.get(1), "Thriller", 118));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Interstellar", 4.7, idiomas.get(0), "Sci-Fi", 169));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Gladiator", 4.6, idiomas.get(1), "Action", 155));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Prestige", 4.6, idiomas.get(0), "Drama", 130));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lion King", 4.8, idiomas.get(1), "Animation", 88));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Saving Private Ryan", 4.7, idiomas.get(0), "War", 169));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Schindler's List", 4.9, idiomas.get(1), "Biography", 195));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Departed", 4.6, idiomas.get(0), "Crime", 151));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Whiplash", 4.7, idiomas.get(1), "Drama", 107));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "La La Land", 4.6, idiomas.get(0), "Musical", 128));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Social Network", 4.5, idiomas.get(1), "Biography", 120));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Parasite", 4.6, idiomas.get(0), "Thriller", 132));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Joker", 4.6, idiomas.get(1), "Drama", 122));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avengers: Infinity War", 4.7, idiomas.get(0), "Action", 149));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avengers: Endgame", 4.8, idiomas.get(1), "Action", 181));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Black Panther", 4.6, idiomas.get(0), "Action", 134));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Spider-Man: No Way Home", 4.7, idiomas.get(1), "Action", 148));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Doctor Strange", 4.5, idiomas.get(0), "Action", 115));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Fellowship of the Ring", 4.8, idiomas.get(0), "Fantasy", 178));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Two Towers", 4.8, idiomas.get(1), "Fantasy", 179));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Return of the King", 4.9, idiomas.get(0), "Fantasy", 201));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Star Wars: Episode IV – A New Hope", 4.7, idiomas.get(1), "Sci-Fi", 121));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Star Wars: Episode V – The Empire Strikes Back", 4.8, idiomas.get(0), "Sci-Fi", 124));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Star Wars: Episode VI – Return of the Jedi", 4.7, idiomas.get(1), "Sci-Fi", 131));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Jurassic Park", 4.6, idiomas.get(0), "Adventure", 127));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lion King", 4.8, idiomas.get(1), "Animation", 88));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Toy Story", 4.7, idiomas.get(0), "Animation", 81));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Toy Story 2", 4.7, idiomas.get(1), "Animation", 92));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Toy Story 3", 4.8, idiomas.get(0), "Animation", 103));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Finding Nemo", 4.7, idiomas.get(1), "Animation", 100));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Incredibles", 4.7, idiomas.get(0), "Animation", 115));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Shrek", 4.6, idiomas.get(1), "Animation", 90));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Shrek 2", 4.6, idiomas.get(0), "Animation", 93));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avatar", 4.7, idiomas.get(1), "Sci-Fi", 162));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Titanic", 4.7, idiomas.get(0), "Romance", 195));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Godfather: Part II", 4.9, idiomas.get(1), "Crime", 202));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Prestige", 4.7, idiomas.get(0), "Mystery", 130));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Memento", 4.7, idiomas.get(1), "Thriller", 113));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Departed", 4.6, idiomas.get(0), "Crime", 151));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Django Unchained", 4.7, idiomas.get(1), "Western", 165));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Inglourious Basterds", 4.6, idiomas.get(0), "War", 153));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Social Network", 4.5, idiomas.get(1), "Biography", 120));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Whiplash", 4.7, idiomas.get(0), "Drama", 106));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Guardians of the Galaxy", 4.6, idiomas.get(0), "Action", 121));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Guardians of the Galaxy Vol. 2", 4.5, idiomas.get(1), "Action", 136));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Doctor Strange", 4.5, idiomas.get(0), "Action", 115));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Black Panther", 4.6, idiomas.get(1), "Action", 134));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Captain America: Civil War", 4.6, idiomas.get(0), "Action", 147));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Iron Man", 4.5, idiomas.get(1), "Action", 126));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Iron Man 2", 4.4, idiomas.get(0), "Action", 124));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Iron Man 3", 4.5, idiomas.get(1), "Action", 130));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Thor", 4.4, idiomas.get(0), "Action", 115));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Thor: The Dark World", 4.3, idiomas.get(1), "Action", 112));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Thor: Ragnarok", 4.6, idiomas.get(0), "Action", 130));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Ant-Man", 4.4, idiomas.get(1), "Action", 117));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Ant-Man and the Wasp", 4.5, idiomas.get(0), "Action", 118));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avengers: Age of Ultron", 4.5, idiomas.get(1), "Action", 141));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avengers: Infinity War", 4.7, idiomas.get(0), "Action", 149));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Avengers: Endgame", 4.8, idiomas.get(1), "Action", 181));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Spider-Man: Homecoming", 4.5, idiomas.get(0), "Action", 133));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Spider-Man: Far From Home", 4.4, idiomas.get(1), "Action", 129));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Spider-Man: No Way Home", 4.7, idiomas.get(0), "Action", 148));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Black Widow", 4.5, idiomas.get(1), "Action", 134));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Shang-Chi and the Legend of the Ten Rings", 4.6, idiomas.get(0), "Action", 132));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Eternals", 4.3, idiomas.get(1), "Action", 156));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Doctor Strange in the Multiverse of Madness", 4.4, idiomas.get(0), "Action", 126));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Captain Marvel", 4.4, idiomas.get(1), "Action", 123));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Batman", 4.6, idiomas.get(0), "Action", 176));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Dark Knight", 4.9, idiomas.get(1), "Action", 152));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Dark Knight Rises", 4.8, idiomas.get(0), "Action", 165));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Inception", 4.8, idiomas.get(1), "Sci-Fi", 148));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Interstellar", 4.7, idiomas.get(0), "Sci-Fi", 169));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Dunkirk", 4.3, idiomas.get(1), "War", 106));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Tenet", 4.2, idiomas.get(0), "Action", 150));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Memento", 4.5, idiomas.get(1), "Thriller", 113));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Prestige", 4.7, idiomas.get(0), "Drama", 130));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Batman Begins", 4.6, idiomas.get(1), "Action", 140));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Matrix", 4.8, idiomas.get(0), "Sci-Fi", 136));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Matrix Reloaded", 4.3, idiomas.get(1), "Sci-Fi", 138));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Matrix Revolutions", 4.2, idiomas.get(0), "Sci-Fi", 129));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "John Wick", 4.5, idiomas.get(1), "Action", 101));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "John Wick: Chapter 2", 4.5, idiomas.get(0), "Action", 122));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "John Wick: Chapter 3 – Parabellum", 4.6, idiomas.get(1), "Action", 131));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "John Wick: Chapter 4", 4.7, idiomas.get(0), "Action", 169));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Mad Max: Fury Road", 4.6, idiomas.get(1), "Action", 120));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "Gladiator", 4.8, idiomas.get(0), "Action", 155));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Fellowship of the Ring", 4.9, idiomas.get(1), "Fantasy", 178));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Two Towers", 4.8, idiomas.get(0), "Fantasy", 179));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Lord of the Rings: The Return of the King", 4.9, idiomas.get(1), "Fantasy", 201));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Hobbit: An Unexpected Journey", 4.4, idiomas.get(0), "Fantasy", 169));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Hobbit: The Desolation of Smaug", 4.5, idiomas.get(1), "Fantasy", 161));
        servicePelicula.add(new Pelicula(UUID.generarUUID(), "The Hobbit: The Battle of the Five Armies", 4.4, idiomas.get(1), "Fantasy", 144));

        // SALAS CON BUTACAS
        for(int i=0; i<2; i++) {
            List <Butaca> butacas = generarButacas();
            for(Butaca butaca : butacas) {
                serviceButaca.add(butaca);
            }
            serviceSala.add(Sala.builder()
                            .uuid(UUID.generarUUID())
                            .butacas(butacas)
                            .is3D(i%2==0)
                            .isPremium(i%2==0)
                            .numero(i+1)
                    .build());
        }

        // FUNCIONES
        for(int i=0; i<2; i++) {
            serviceFuncion.add(Funcion.builder()
                            .uuid(UUID.generarUUID())
                            .sala(serviceSala.getAll().get((int)(Math.random()*serviceSala.getAll().size())))
                            .pelicula(servicePelicula.getAll().get((int)(Math.random()*servicePelicula.getAll().size())))
                            .horario(randomDateLast12MonthsNoMonday())
                            .precioUnitario(8000 + (Math.random()*4001))
                    .build());
        }

    }

    private static List<Butaca> generarButacas() {
        List<Butaca> butacas = new ArrayList<>();
        int cantidadButacas = 50 + (int)(Math.random() * 21);
        for(int i=0; i<cantidadButacas; i++) {
            butacas.add(Butaca.builder()
                    .uuid(UUID.generarUUID())
                    .num(i)
                    .estado(false)
                    .build());
        }
        return butacas;
    }

    public static Date randomDateLast12MonthsNoMonday() {
        Random random = new Random();
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusMonths(12);

        LocalDate randomDate;

        do {
            long startEpochDay = startDate.toEpochDay();
            long endEpochDay = today.toEpochDay();
            long randomDay = startEpochDay + random.nextLong() % (endEpochDay - startEpochDay + 1);
            if (randomDay < startEpochDay)
                randomDay = -randomDay; // seguridad
            randomDate = LocalDate.ofEpochDay(randomDay);
        } while (randomDate.getDayOfWeek() == DayOfWeek.MONDAY);

        int hour = 10 + random.nextInt(14); // 10 a 23
        int minute = random.nextInt(60);
        int second = random.nextInt(60);

        LocalTime randomTime = LocalTime.of(hour, minute, second);
        LocalDateTime randomDateTime = LocalDateTime.of(randomDate, randomTime);

        return Date.from(randomDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
