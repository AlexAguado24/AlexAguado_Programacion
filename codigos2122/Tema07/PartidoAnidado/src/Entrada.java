public class Entrada {

    public static void main(String[] args) {

        Partido partido = new Partido();
        Partido.Equipo equipoLocal = partido.new Equipo("Real Madrid");
        Partido.Equipo equipoVisitante = partido.new Equipo("FC Barcelona");

        partido.agregarGolesLocal();


    }

}
