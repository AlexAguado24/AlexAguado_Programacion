package model;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String titulo, fecha, descripcion, poster;

    public Pelicula() {}

    public Pelicula(String titulo, String fecha, String descripcion, String poster) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.poster = poster;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
