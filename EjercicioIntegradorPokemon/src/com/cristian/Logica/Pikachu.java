package com.cristian.Logica;

public class Pikachu extends  Pokemon implements IElectrico{
    public Pikachu() {
    }

    public Pikachu(int num_pokemon, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        super(num_pokemon, nombrePokemon, pesoPokemon, sexo, temporada, tipo);
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con IMPACT TRUENO");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con PUÑO DE TRUENO");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con RAYO");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy " + nombrePokemon + " y estoy atacando con RAYO DE CARGA");
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
