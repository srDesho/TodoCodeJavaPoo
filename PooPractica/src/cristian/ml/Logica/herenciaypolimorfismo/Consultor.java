package cristian.ml.Logica.herenciaypolimorfismo;

public class Consultor extends Persona {
    String nombreConsultora;
    int numConsulto;

    public Consultor() {
    }

    public Consultor(int id, String nombre, String apellido, String domicilio, String telefono, String nombreConsultora, int numConsulto) {
        super(id, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsulto = numConsulto;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsulto() {
        return numConsulto;
    }

    public void setNumConsulto(int numConsulto) {
        this.numConsulto = numConsulto;
    }
}
