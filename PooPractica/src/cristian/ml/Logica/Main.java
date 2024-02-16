package cristian.ml.Logica;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2, "Cristian", "Montaño");

        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());

        alu1.setId(1);
        alu1.setNombre("Daniel");
        alu1.setApellido("Laime");

        System.out.println();
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());

        alu2.setId(35);

        // Cambiando valor del alumno 2
        System.out.println();
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
    }
}