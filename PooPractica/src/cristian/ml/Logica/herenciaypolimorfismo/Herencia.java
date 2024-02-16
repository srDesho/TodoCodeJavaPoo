package cristian.ml.Logica.herenciaypolimorfismo;

public class Herencia {
    public static void main(String[] args) {
        // POLIMORFISMO, es cuando las clases hijas heredan del mismo tipo de clase padre,
        // y estas al compartir el mismo padre pueden ser llamadas en ciertos métodos donde pueden realizar
        // el mismo comportamiento aunque sean diferentes pero son del mismo tipo de la clase padre.

        // Ejemplo, creamos un vector de objetos de la clase padre la cual tiene clases hijas,
        // estas se pueden agregar en el mismo vector aun siendo distintos tipos.
        Persona[] vector = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Jefe();
        vector[3] = new Consultor();
        // vector[4] = "error"; // error si tratamos de agregar otro dato que no sea del mismo tipo heredado de la clase padre.

        // Otro ejemplo es en donde podemos asignar el valor de la clase hija al padre, pero no viceversa.
        Persona perso = new Persona();
        Consultor consu = new Consultor();

        perso = consu;

    }
}
