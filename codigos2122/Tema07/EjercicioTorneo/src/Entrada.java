import com.sun.nio.sctp.SctpSocketOption;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Torneo copa = new Torneo("Copa");
        ArrayList<Torneo.Equipo> listaEquipos = new ArrayList<>();

        Torneo.Equipo madrid = new Torneo.Equipo("Madrid",95,75);
        Torneo.Equipo barsa = new Torneo.Equipo("Barsa",90,80);
        Torneo.Equipo atleti = new Torneo.Equipo("Atleti",89,85);
        Torneo.Equipo betis = new Torneo.Equipo("Betis",88,87);

        listaEquipos.add(madrid);
        listaEquipos.add(barsa);
        listaEquipos.add(atleti);
        listaEquipos.add(betis);

        copa.realizarSorteo(listaEquipos);
        copa.mostrarPartido();
        copa.iniciarTorneo();
        System.out.println("Los partidos jugados son");
        copa.imprimirClasificacion();
    }
}
