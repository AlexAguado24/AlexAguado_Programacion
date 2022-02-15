package EjerciciosObjetosPOO.EjercicioEquipo;

import java.util.ArrayList;

public class Equipo {

    //atributos
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;
    private ArrayList<Jugador> listaJugadores;


    //Constructores
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 101);
        this.nivelCentro = (int) (Math.random() * 101);
        this.nivelDefensa = (int) (Math.random() * 101);
        listaJugadores = new ArrayList<>();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        listaJugadores = new ArrayList<>();
    }

    //metodos
    public boolean atacar() {
        if (nivelAtaque * (Math.random()) + (nivelCentro * Math.random() / 2) > 90) {
            goles++;
            return true;
        } else {
            return false;
        }
    }

    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public void listarDelanteros() {
        /*for (Jugador jugador : listaJugadores) {
            if (jugador.getPosicion().equalsIgnoreCase(toString(delantero))) {

            }
        }*/
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
