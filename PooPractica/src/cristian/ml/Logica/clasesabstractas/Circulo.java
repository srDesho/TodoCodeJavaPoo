package cristian.ml.Logica.clasesabstractas;

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }


    // Implementamos sus metodos abstractos con sobreescritura de métodos
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }


}
