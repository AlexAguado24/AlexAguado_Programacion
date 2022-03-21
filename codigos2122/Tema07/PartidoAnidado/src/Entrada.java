public class Entrada {

    public static void main(String[] args) {

        Partido partido = new Partido();
        Partido.Equipo equipoLocal = partido.new Equipo("Real Madrid");
        Partido.Equipo equipoVisitante = partido.new Equipo("FC Barcelona");

        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                partido.agregarGolesLocal();
                partido.agregarGolesVisitante();
            }

        }




    }

}
