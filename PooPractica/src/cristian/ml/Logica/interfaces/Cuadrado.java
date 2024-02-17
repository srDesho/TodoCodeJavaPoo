package cristian.ml.Logica.interfaces;

public class Cuadrado implements Figura, Dibujable {
    private double lado;

    public Cuadrado(){}

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementamos sus metodos abstractos con sobreescritura de métodos
    @Override
    public double calcularArea() {
        double resultado;
        resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}
