package EjerciciosObjetosPOO.EjercicioAsignatura;

public class Entrada {

    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);
        Alumno alumno2 = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);
        profesor.ponerNotas(alumno2);

        System.out.println(alumno.getAsignatura1().getCalificacion());
        System.out.println(alumno.getAsignatura2().getCalificacion());
        System.out.println(alumno.getAsignatura3().getCalificacion());
        //System.out.println(profesor.calcularMedia(alumno));
        if (profesor.calcularMedia(alumno) > 5) {
            System.out.println("Alumno pasa de curso");
        } else {
            System.out.println("Alumno no pasa de curso");
        }

    }
}
