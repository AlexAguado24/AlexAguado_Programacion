package EjerciciosObjetosPOO.EjercicioEquipo;

public class Equipo {

    //atributos
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;


    //Constructores
    public Equipo(){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.goles = goles;
    }

    public Equipo (String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.goles = goles;
    }

    public Equipo (String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    //metodos
    public boolean atacar () {
        if (nivelAtaque*(nivelAtaque/(0-1))+(nivelCentro*nivelCentro/(0-1)/2)> 90){
            goles++;
            return true;
        } else {
            return false;
        }
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
