package com.cristianml.logica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VideoJuego> videoJuegos = new ArrayList<>();

        VideoJuego juego1 = new VideoJuego(7771, "The Last of Us Part II", "PlayStation 4", 1, "Acción y aventura, supervivencia, sigilo");
        VideoJuego juego2 = new VideoJuego(7772, "Halo 5: Guardians", "Xbox One", 24, "Shooter en primera persona");
        VideoJuego juego3 = new VideoJuego(7773, "Animal Crossing: New Horizons", "Nintendo Switch", 4, "Simulación de vida, social");
        VideoJuego juego4 = new VideoJuego(7774, "Super Mario 64", "Nintendo 64", 1, "Plataforma, aventura");
        VideoJuego juego5 = new VideoJuego(7775, "The Legend of Zelda: Ocarina of Time", "Nintendo 64", 1, "Acción y aventura, RPG");

        videoJuegos.add(juego1);
        videoJuegos.add(juego2);
        videoJuegos.add(juego3);
        videoJuegos.add(juego4);
        videoJuegos.add(juego5);

        int amount = 1;
        // Recorremos la lista de juegos
        for (VideoJuego v : videoJuegos) {
            System.out.println("Juego n°" + amount
                    + "\nTítulo: " + v.getTitulo()
                    + "\nConsola: " + v.getConsola()
                    + "\nCantidad de jugadores: " + v.getCantidadJugadores());
            amount++;
        }

        // Cambiamos nombre y cantidad de juegadores de 2 videojuegos
        juego1.setTitulo("Spiderman");
        juego1.setCantidadJugadores(2);
        juego2.setTitulo("Tetris");
        juego2.setCantidadJugadores(2);

        // Recorremos la lista de juegos
        System.out.println("--------------------------------------------");
        amount = 1;
        for (VideoJuego v : videoJuegos) {
            System.out.println("Juego n°" + amount
                    + "\nTítulo: " + v.getTitulo()
                    + "\nConsola: " + v.getConsola()
                    + "\nCantidad de jugadores: " + v.getCantidadJugadores());
            amount++;
        }

        // Mostramos juegos que solo sean de consola Nintendo 64
        System.out.println("--------------------------------------------");
        amount = 1;
        for (VideoJuego v : videoJuegos) {
            if (v.getConsola().equals("Nintendo 64")) {
                System.out.println(v.toString());

            }
        }
    }
}