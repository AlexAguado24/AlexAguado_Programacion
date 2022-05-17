package model;

public class Usuario {

    private String nombre, apellido, pais;
    private int telefono;

    public Usuario() {}

    public Usuario(String nombre, String apellido, String pais, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
