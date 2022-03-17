public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    public Partido(){}

    public Partido(boolean jugado, int golesLocal, int golesVisitante) {
        this.jugado = jugado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public void agregarGolesLocal () {
        golesLocal = (int)(Math.random()*3);
    }

    public void agregarGolesVisitante () {
        golesVisitante = (int)(Math.random()*3);
    }

    public void mostrarResultado() {
        System.out.println("El resultado del partido es "+ equipoLocal.nombre +" = "
                + golesLocal +" : "+ equipoVisitante+ " = "+ golesVisitante);
        if (golesLocal > golesVisitante) {
            equipoLocal.puntos += 3;
        } else {
            equipoVisitante.puntos += 3;
        }
    }


    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    class Equipo {

        private int puntos;
        private String nombre;

        public Equipo( String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }



}
