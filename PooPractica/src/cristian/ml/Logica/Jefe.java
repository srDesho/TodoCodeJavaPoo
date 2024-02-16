package cristian.ml.Logica;

public class Jefe extends Persona{
    int idJefe;
    int deparatamentoJefe;

    public Jefe() {
    }

    public Jefe(int id, String nombre, String apellido, String domicilio, String telefono, int idJefe, int deparatamentoJefe) {
        super(id, nombre, apellido, domicilio, telefono);
        this.idJefe = idJefe;
        this.deparatamentoJefe = deparatamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public int getDeparatamentoJefe() {
        return deparatamentoJefe;
    }

    public void setDeparatamentoJefe(int deparatamentoJefe) {
        this.deparatamentoJefe = deparatamentoJefe;
    }
}
