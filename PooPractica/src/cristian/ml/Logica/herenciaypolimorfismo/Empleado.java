package cristian.ml.Logica.herenciaypolimorfismo;

public class Empleado extends Persona{
    int numLegajo;
    String cargo;
    double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String domicilio, String telefono, int numLegajo, String cargo, double sueldo) {
        super(id, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
}
