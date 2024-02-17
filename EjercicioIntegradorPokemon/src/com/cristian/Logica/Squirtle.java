package com.cristian.Logica;

public class Squirtle extends  Pokemon implements IPlanta{
    public Squirtle() {
    }

    public Squirtle(int num_pokemon, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        super(num_pokemon, nombrePokemon, pesoPokemon, sexo, temporada, tipo);
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con PARALIZAR");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con DRENAJE");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con HOJA AFILADA");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con LATIGO CEPA");
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
