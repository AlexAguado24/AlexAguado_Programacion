import java.util.ArrayList;

public class Torneo {

    private ArrayList<Partido> listaPartidos;
    private String nombre;


    public Torneo(String nombre) {
        this.nombre = nombre;
        this.listaPartidos = new ArrayList<>();
    }

    public void realizarSorteo(ArrayList<Equipo> equipos) {
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Partido partido = new Partido(equipos.get(i), equipos.get(j));
                listaPartidos.add(partido);
            }
        }

        for (int i = equipos.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                Partido partido = new Partido(equipos.get(j), equipos.get(i));
                listaPartidos.add(partido);
            }
        }
    }

    public void mostrarPartido() {
        for (Partido partido : listaPartidos) {
            System.out.printf("%s vs %s%n", partido.getEquipoLocal().getNombre(), partido.getEquipoVisitante().getNombre());
        }
    }

    public void jugarPartido(Partido partido) {
        for (Partido item : listaPartidos) {


            for (int i = 0; i < 3; i++) {
                if (partido.equipoLocal.nivelAtaque > partido.equipoVisitante.nivelDefensa) {
                    partido.equipoLocal.golesTotales = (int) (Math.random() * 3);
                }
                if (partido.equipoVisitante.nivelAtaque > partido.equipoLocal.nivelDefensa) {
                    partido.equipoVisitante.golesTotales = (int) (Math.random() * 3);
                }
            }
            for (int i = 0; i < 3; i++) {
                if (partido.equipoLocal.nivelAtaque > partido.equipoVisitante.nivelDefensa) {
                    partido.equipoLocal.golesTotales = (int) (Math.random() * 3);
                }
                if (partido.equipoVisitante.nivelAtaque > partido.equipoLocal.nivelDefensa) {
                    partido.equipoVisitante.golesTotales = (int) (Math.random() * 3);
                }
            }
            System.out.printf("El resultado del partido es %s %d - %s %d%n", partido.equipoLocal.getNombre(), partido.equipoLocal.getGolesEncuentro(), partido.equipoVisitante.getNombre(), partido.equipoVisitante.getGolesEncuentro());
        }
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    class Partido {
        private Equipo equipoLocal, equipoVisitante;
        private int golesLocal, golesVisitante;
        private boolean jugado;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
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

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }
    }

    static class Equipo {
        private int golesTotales, puntos, nivelAtaque, nivelDefensa;
        private String nombre;


        public Equipo(String nombre, int nivelAtaque, int nivelDefensa) {
            this.nombre = nombre;
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
        }

        public int getGolesEncuentro() {
            return golesTotales;
        }

        public void setGolesEncuentro(int golesEncuentro) {
            this.golesTotales = golesEncuentro;
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
