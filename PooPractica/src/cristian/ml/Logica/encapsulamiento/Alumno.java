package cristian.ml.Logica.encapsulamiento;

public class Alumno {
    private int id;
    private String nombre;
    private String apeelidos;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apeelidos) {
        this.id = id;
        this.nombre = nombre;
        this.apeelidos = apeelidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeelidos() {
        return apeelidos;
    }

    public void setApeelidos(String apeelidos) {
        this.apeelidos = apeelidos;
    }
}
