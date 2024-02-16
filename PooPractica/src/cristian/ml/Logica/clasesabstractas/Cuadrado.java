package cristian.ml.Logica.clasesabstractas;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(){};
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    // Implementamos sus metodos abstractos con sobreescritura de métodos
    @Override
    public double calcularArea() {
        double resultado;
        resultado = lado * lado;
        return resultado;
    }
}
