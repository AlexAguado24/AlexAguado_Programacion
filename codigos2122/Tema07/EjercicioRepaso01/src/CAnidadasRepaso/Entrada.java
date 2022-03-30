package CAnidadasRepaso;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        Terreno terreno = new Terreno();
        boolean hayTerreno = false, hayCasa = false;

        do {
            System.out.println("Vamos a construir una casa");
            System.out.println("Elige la opcion que deseas");
            System.out.println("1. Contruir terreno");
            System.out.println("2. Contruir casa");
            System.out.println("3. Contruir habitacion");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indica los m2 del terreno");
                    int m2 = in.nextInt();
                    System.out.println("Indica su valor");
                    int valoracion = in.nextInt();
                    System.out.println("Indica su orientacion");
                    String orientacion = in.next();
                    terreno = new Terreno(m2,valoracion,orientacion);
                    hayTerreno = true;
                    break;
                case 2:
                    if (!hayTerreno) {
                        System.out.println("Aun no hay terreno donde construir la casa, debes contruirlo antes");
                    } else{
                        terreno.construirCasa(terreno.getCasa());
                        hayCasa = true;
                    }
                    break;
                case 3:
                    if (!hayCasa) {
                        System.out.println("No puedes hacer una habitacion antes que la casa");
                    } else {
                        System.out.println("Indica los metros de la habitacion");
                        int metros = in.nextInt();
                        terreno.getCasa().construirHabitacion(metros);
                    }
                    break;
            }
        }while (opcion !=0);
        terreno.revalorizarTerreno();
        System.out.println(terreno.getValoracion());
    }
}
