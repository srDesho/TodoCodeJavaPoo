package com.cristian.Logica;

public abstract class Pokemon {
    protected int num_pokemon;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporada;
    protected String tipo;

    protected Pokemon() {
    }
    protected Pokemon(int num_pokemon, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        this.num_pokemon = num_pokemon;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
    }

    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();
}
