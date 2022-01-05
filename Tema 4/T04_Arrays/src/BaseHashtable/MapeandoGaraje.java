package BaseHashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class MapeandoGaraje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<String,Object[]> garaje = new Hashtable<>();
        int opcion;
        String marca, modelo, matricula=null;
        int coste;

        do {
            System.out.println("1. Añadirá un coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coches:");
            System.out.println("4. Mostrar costes:");
            System.out.println("5. Eliminar coche:");
            System.out.println("6. Vaciar garaje:");
            System.out.println("Ejecita una de las opciones");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    if (garaje.size() <= 10) {
                        System.out.println("Añadiendo coche:");
                        System.out.println("Introduce la marca del coche");
                        marca = in.next();
                        System.out.println("Introduce el modelo del coche");
                        modelo = in.next();
                        System.out.println("Introduce el coste de reparacion");
                        coste = in.nextInt();
                        System.out.println("Introduce la matricula del coche");
                        matricula = in.next();

                        garaje.put(matricula, new Object[]{marca, modelo, coste, matricula});
                    } else {
                        System.out.println("Garaje lleno, no caben mas coches");
                    }
                    break;

                case 2:
                    if (garaje.size() != 0) {
                        for (Object coche :garaje.get(matricula)) {
                            System.out.print(coche +"\t");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Aun no hay coches que listar");
                    }
                    break;
                case 3:
                    if (garaje.size() != 0) {
                        System.out.println("Buscando coche:");
                        System.out.println("Introduce la matricula del coche que quieres buscar");
                        matricula = in.next();
                        boolean encontrado = false;
                        for (Object coche:garaje.get(matricula)) {
                            if (garaje.get(matricula).toString() ) {

                            }
                        }
                    } else {
                        System.out.println("Aun no hay coches que listar");
                    }
                    break;
            }
        }while (opcion != 0);
    }
}
////(Garaje) Desarrollar una aplicación para el control de un garaje.
//// El funcionamiento de la aplicación será desde consola mediante un menú que permita acceder a las diferentes opciones.
//// Para la aplicación tendremos que tener en cuenta las siguientes cosas:
//
////Un coche está formado por los siguientes atributos: marca (string) modelo (string), coste (int), matricula (string).
//// Las opciones de la aplicación serán las siguientes:
//
////Añadirá un coche al taller, pidiéndome todos los datos necesarios
////Listar coches
////Buscar coches: Se pedirá una matrícula y se mostrarán los datos del coche.
////Mostrar costes: Se mostrará el coste acumulado de todos los coches de la lista.
////Eliminar coche: Se pedirá una matrícula y se eliminará el coche de la lista
////Vaciar garaje: Eliminará todos los coches de la lista