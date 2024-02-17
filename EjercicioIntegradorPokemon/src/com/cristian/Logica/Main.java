package com.cristian.Logica;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(1, "Pikachu", 21.4, "macho", 1, "Eléctrico");
        Charmander charmander = new Charmander(2, "Charmander", 30.4, "macho", 1, "Fuego");
        Squirtle squirtle = new Squirtle(3, "Squirtle", 18.4, "macho", 1, "Planta");
        Bulbasaur bulbasaur = new Bulbasaur(4, "Bulbasaur", 34.4, "macho", 1, "Agua");

        System.out.println("------------Pikachu-----------");
        pikachu.atacarImpacTrueno();
        pikachu.atacarRayo();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayoCarga();
        pikachu.atacarAraniazo();
        pikachu.atacarMordisco();
        pikachu.atacarPlacaje();
        System.out.println();

        System.out.println("------------Charmander-----------");
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
        charmander.atacarPunioFuego();
        charmander.atacarAraniazo();
        charmander.atacarMordisco();
        charmander.atacarPlacaje();
        System.out.println();

        System.out.println("------------Squirtle-----------");
        squirtle.atacarDrenaje();
        squirtle.atacarHojaAfilada();
        squirtle.atacarParalizar();
        squirtle.atacarAraniazo();
        squirtle.atacarMordisco();
        squirtle.atacarPlacaje();
        System.out.println();

        System.out.println("------------Bulbasaur-----------");
        bulbasaur.atacarBurbuja();
        bulbasaur.atacarHidrobomba();
        bulbasaur.atacarHidropulso();
        bulbasaur.atacarPistolaAgua();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarPlacaje();
        System.out.println();
    }
}