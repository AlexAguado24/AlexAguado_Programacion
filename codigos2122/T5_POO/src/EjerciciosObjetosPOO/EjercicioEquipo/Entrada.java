package EjerciciosObjetosPOO.EjercicioEquipo;

public class Entrada {

    public static void main(String[] args) {

        Equipo equipoA = new Equipo("Madrid");
        Equipo equipoB = new Equipo("Barsa",90,60,50);

        equipoA.atacar();
        equipoB.atacar();

        System.out.println("El resultado es EquipoA "+ equipoA.getGoles()+ " EquipoB "+ equipoB.getGoles());

        equipoA.atacar();
        equipoB.atacar();

        System.out.println("El resultado es EquipoA "+ equipoA.getGoles()+ " EquipoB "+ equipoB.getGoles());

        equipoA.atacar();
        equipoB.atacar();

        System.out.println("El resultado es EquipoA "+ equipoA.getGoles()+ " EquipoB "+ equipoB.getGoles());

    }



}
