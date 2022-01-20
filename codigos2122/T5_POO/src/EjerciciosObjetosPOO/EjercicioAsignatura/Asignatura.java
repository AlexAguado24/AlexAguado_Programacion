package EjerciciosObjetosPOO.EjercicioAsignatura;

public class Asignatura {
    //variables
    private int id;
    private double calificacion;

    //constructor
    public Asignatura(int id){
        this.id = id;
    }

    //getters
    public double getCalificacion() {
        return calificacion;
    }

    public int getId() {
        return id;
    }
    //setters

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
