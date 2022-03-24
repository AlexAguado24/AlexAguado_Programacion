import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Torneo {

    private ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaEquipos;
    private String nombre;


    public Torneo(String nombre) {
        this.nombre = nombre;
        this.listaPartidos = new ArrayList<>();
    }

    public void realizarSorteo(ArrayList<Equipo> equipos) {

        this.listaEquipos = equipos;

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
        Collections.shuffle(listaPartidos);
    }

    public void mostrarPartido() {
        for (Partido partido : listaPartidos) {
            System.out.printf("%s vs %s%n", partido.getEquipoLocal().getNombre(), partido.getEquipoVisitante().getNombre());
        }
    }

    public void iniciarTorneo() {
        for (Partido item : listaPartidos) {
            item.jugarPartido();
        }
    }

    public void mostrarPartidoJugado() {
        for (Partido partido : listaPartidos) {
            System.out.printf("%s : %d vs %s : %d%n",
                    partido.getEquipoLocal().getNombre(),
                    partido.golesLocal,
                    partido.getEquipoVisitante().getNombre(),
                    partido.golesVisitante);
        }
    }

    public void imprimirClasificacion() {

        Collections.sort(listaEquipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                }
                return 0;
            }
        });

        int contador = 1;

        for (Equipo equipo : listaEquipos) {
            System.out.printf("%d - %s - %d%n", contador, equipo.getNombre(), equipo.getPuntos());
            contador++;
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

        public void generarGolesLocales() {
            if (equipoLocal.nivelAtaque > equipoVisitante.nivelDefensa) {
                equipoLocal.golesTotales = (int) (Math.random() * 3);
                equipoLocal.setGolesEncuentro(equipoLocal.getGolesEncuentro() + golesLocal);
            }
        }

        public void generarGolesVisitante() {
            if (equipoVisitante.nivelAtaque > equipoLocal.nivelDefensa) {
                equipoVisitante.golesTotales = (int) (Math.random() * 3);
                equipoVisitante.setGolesEncuentro(equipoVisitante.getGolesEncuentro() + golesLocal);
            }
        }

        public void jugarPartido() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    generarGolesLocales();
                    generarGolesVisitante();
                }
            }
            jugado = true;
            if (golesLocal > golesVisitante) {
                equipoLocal.setPuntos(equipoLocal.puntos + 3);
            } else if (golesVisitante > golesLocal) {
                equipoVisitante.setPuntos(equipoLocal.puntos + 3);
            } else {
                equipoLocal.setPuntos(equipoLocal.puntos + 1);
                equipoVisitante.setPuntos(equipoLocal.puntos + 1);
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
