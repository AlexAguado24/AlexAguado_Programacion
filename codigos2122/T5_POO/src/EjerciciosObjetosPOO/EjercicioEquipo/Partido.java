package EjerciciosObjetosPOO.EjercicioEquipo;

public class Partido {

    private Equipo equipo1, equipo2;
    private boolean estadoPartido;
    private int tiempoPartido;

    public Partido(){}

    public Partido (Equipo equipo1, Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void iniciarPartido () {
        if (tiempoPartido == 1) {
            equipo1.atacar();
            equipo2.atacar();
            equipo1.atacar();
        } else {
            equipo2.atacar();
            equipo1.atacar();
            equipo2.atacar();
        }
    }

    public void mostrarResultados () {
        System.out.println("Equipo1 "+equipo1.getGoles() + " Equipo2 "+ equipo2.getGoles());
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public boolean isEstadoPartido() {
        return estadoPartido;
    }

    public void setEstadoPartido(boolean estadoPartido) {
        this.estadoPartido = estadoPartido;
    }

    public int getTiempoPartido() {
        return tiempoPartido;
    }

    public void setTiempoPartido(int tiempoPartido) {
        this.tiempoPartido = tiempoPartido;
    }
}
