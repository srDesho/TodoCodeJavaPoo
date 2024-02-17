package com.cristian.Logica;

public class Charmander extends  Pokemon implements IFuego{

    public Charmander() {}
    public Charmander(int num_pokemon, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        super(num_pokemon, nombrePokemon, pesoPokemon, sexo, temporada, tipo);
    }
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con PUÑO DE FUEGO");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con ASCUAS");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con LANZALLAMAS");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con PLACAJE");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con ARAÑAZO");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con MORDISCO");
    }
}
