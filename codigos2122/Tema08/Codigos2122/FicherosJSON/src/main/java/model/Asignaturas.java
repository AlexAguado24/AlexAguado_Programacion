package model;

import java.util.Arrays;

public class Asignaturas {

    private String siglas, nombre, ciclo;
    private int hora, curso;
    private Profesor profesor;
    private String[] conocimientos;

    public Asignaturas() {
    }

    public Asignaturas(String siglas, String nombre, String ciclo, int hora, int curso, Profesor profesor, String[] conocimientos) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.hora = hora;
        this.curso = curso;
        this.profesor = profesor;
        this.conocimientos = conocimientos;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String[] getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String[] conocimientos) {
        this.conocimientos = conocimientos;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "siglas='" + siglas + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", hora=" + hora +
                ", curso=" + curso +
                ", profesor=" + profesor +
                ", conocimientos=" + Arrays.toString(conocimientos) +
                '}';
    }
}
