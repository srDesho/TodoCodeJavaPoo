package cristian.ml.Logica.interfaces;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementamos sus metodos abstractos con sobreescritura de métodos
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }


    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando un circulo");
    }
}
