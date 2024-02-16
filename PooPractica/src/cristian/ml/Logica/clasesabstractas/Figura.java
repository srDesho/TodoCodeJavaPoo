package cristian.ml.Logica.clasesabstractas;
// Ésta será nuestra clase abstracta y creamos de la sgte manera:
public abstract class Figura {
    // Sus atributos solo pueden ser accedidos por las clases hijas, o sea que las creamos como protected.
    protected double x;
    protected double y;


    // Puede tener sus constructores pero de acceso protected para solo sus hijas puedan acceder.
    protected Figura() {
    }
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Creamos al menos un metodo abstracto
    public abstract double calcularArea();
}
