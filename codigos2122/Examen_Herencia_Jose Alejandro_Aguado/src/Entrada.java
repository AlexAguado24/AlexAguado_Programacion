public class Entrada {

    public static void main(String[] args) {

        Seleccion seleccion = new Seleccion("Brasil");

        Posicion posicion = Posicion.Delantero;
        Posicion[] posiciones = new Posicion[]{Posicion.Delantero,Posicion.Medio,Posicion.Defensa,Posicion.Portero};


        Jugador jugador1 = new Jugador("Mario","Rodriguez","123A",19,posicion.name(),2000);
        Jugador jugador2 = new Jugador("Raul","Gonzalez","234B",25,Posicion.Defensa.name(),2500);
        Jugador jugador3 = new Jugador("Pepe","Alvarez","345C",19,Posicion.Portero.name(),1500);
        Jugador jugador4 = new Jugador("Luis","Perez","456D",24,Posicion.Medio.name(),3000);

        seleccion.contratarJugador(jugador1);
        seleccion.contratarJugador(jugador2);
        seleccion.contratarJugador(jugador3);
        seleccion.contratarJugador(jugador4);

        Entrenador entrenador1 = new Entrenador("Pochetino","Rodriguez","654D",50,"ofensiva",5000);
        Entrenador entrenador2 = new Entrenador("Zizu","Zidane","789F",45,"defensiva",8000);

        seleccion.contratarEntrenador(entrenador1);
        seleccion.contratarEntrenador(entrenador2);

        seleccion.verPosicion("delantero");
        seleccion.mostrarGastos();
        seleccion.verPlantilla();


    }

}
