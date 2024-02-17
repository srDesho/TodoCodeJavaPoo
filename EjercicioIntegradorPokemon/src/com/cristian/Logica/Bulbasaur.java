package com.cristian.Logica;

public class Bulbasaur extends  Pokemon implements IAgua{
    public Bulbasaur() {
    }

    public Bulbasaur(int num_pokemon, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        super(num_pokemon, nombrePokemon, pesoPokemon, sexo, temporada, tipo);
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con HIDROBOMBA");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con PISTOLA DE AGUA");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con BURBUJAS");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con HIDROPULSO");
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
