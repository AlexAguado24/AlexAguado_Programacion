package EjerciciosObjetosPOO.EjercicioEquipo;

public class Entrada {

    public static void main(String[] args) {

        Equipo equipoA = new Equipo("Madrid");
        Equipo equipoB = new Equipo("Barsa",60,60,60);

        equipoA.atacar();
        equipoB.atacar();

        equipoA.atacar();
        equipoB.atacar();

        equipoA.atacar();
        equipoB.atacar();

        System.out.println("El resultado es EquipoA "+ equipoA.getGoles()+ " EquipoB "+ equipoB.getGoles());
    }



}
