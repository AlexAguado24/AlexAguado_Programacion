package model;

public class Profesor {

    private String nombre, Apellido;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        Apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + Apellido + '\'' +
                '}';
    }
}
