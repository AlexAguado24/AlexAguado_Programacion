package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        ArrayList<Object[]> garaje = new ArrayList<>();

        do {
            System.out.println("0. Salir del programa");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("Elige una de las opciones:");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    if (garaje.size() < 10) {
                        String marca, modelo, matricula = "";
                        int coste;
                        System.out.println("Introduce la marca del coche");
                        marca = in.next();
                        System.out.println("Introduce el modelo del coche");
                        modelo = in.next();
                        System.out.println("Introduce el coste de reparacion");
                        coste = in.nextInt();
                        System.out.println("Introduce la matricula del coche");
                        matricula = in.next();
                        garaje.add(new Object[]{marca, modelo, coste, matricula});
                    } else {
                        System.out.println("Garaje lleno, espere a que salga algun coche.");
                    }
                    break;
                case 2:
                    if (garaje.size() > 0) {
                        for (Object[] coche : garaje) {
                            for (Object item :coche) {
                                System.out.print(item +"\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Aun no hay ningun coche en el garaje");
                    }
                    break;
                case 3:
<<<<<<< Updated upstream
                    if (garaje.size() > 0) {
                        System.out.println("Introduce la matricula del coche que quieres buscar");
                        String matricula = in.next();
                        boolean encontrado = false;

                        for (Object[] coche:garaje) {
                            if (coche[3].toString().equalsIgnoreCase(matricula)) {
                                encontrado = true;
                                System.out.println("Matricula "+coche[0]+ "\tmarca"+ coche[1]+"\tcoste"+coche[2]+"\tmatricula"+coche[3]);
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Matricula no encontrada");
                        }
                        /*for (Object[] coche : garaje) {
                            if (coche[3].toString().equalsIgnoreCase(cocheBuscar)) {

                                for (Object item : coche) {
                                    System.out.print(item +"\t");
                                }
                                System.out.println();
                            }
                            if (cocheBuscar != coche[3]) {
                                System.out.println("No hay ningun coche con esa matricula");
                            }
                        }*/
                    } else {
                        System.out.println("Aun no hay coches en el garaje");
=======
                    System.out.println("Introduce la matricula del coche que quieres buscar");
                    String cocheBuscar = in.next();
                    for (Object[] coche:garaje) {
                        if (coche[3].equals(cocheBuscar)) {
                            
                        }
>>>>>>> Stashed changes
                    }
                    break;
                case 4:
                    if (garaje.size() > 0) {
                        int costeTotal=0;
                        for (Object[] coche :garaje) {
                            costeTotal += (int)coche[2];
                        }
                        System.out.println(costeTotal);
                    } else {
                        System.out.println("Aun no hay coches en el garaje");
                    }
                    break;
                case 5:
                    if (garaje.size() > 0) {
                        System.out.println("Introduce la matricula del coche que quieres buscar");
                        String borrarCoche = in.next();
                        boolean encontrado = false;
                        for (int i = 0; i < garaje.size(); i++) {
                            if (garaje.get(i)[2].toString().equalsIgnoreCase(borrarCoche)) {
                                System.out.println("Coche borrado");
                                encontrado=true;
                                garaje.remove(i);
                                break;
                            }
                            /*Object[] cocheActual = garaje.get(i);
                            for (int j = 0; j < cocheActual.length; j++) {
                                if (borrarCoche.equals(cocheActual[j])) {
                                    garaje.remove(cocheActual);
                                    System.out.println("Coche borrado");
                                }
                                if (borrarCoche != cocheActual[j]) {
                                    System.out.println("Matricula no encontrada");
                                }
                            }*/
                        }
                        if (!encontrado) {
                            System.out.println("Coche no encontrado");
                        }
                    } else {
                        System.out.println("Aun no hay coches en el garaje");
                    }
                    break;
                case 6:
                    if (garaje.size() > 0) {
                        garaje.clear();
                        System.out.println("Garaje vaciado");
                    } else {
                        System.out.println("Aun no hay coches en el garaje");
                    }
                    break;
            }
        }while (opcion >0);
        in.close();
    }
}
//(Garaje) Desarrollar una aplicación para el control de un garaje.
// El funcionamiento de la aplicación será desde consola mediante un menú que permita acceder a las diferentes opciones.
// Para la aplicación tendremos que tener en cuenta las siguientes cosas:

//Un coche está formado por los siguientes atributos: marca (string) modelo (string), coste (int), matricula (string).
// Las opciones de la aplicación serán las siguientes:

//Añadirá un coche al taller, pidiéndome todos los datos necesarios
//Listar coches
//Buscar coches: Se pedirá una matrícula y se mostrarán los datos del coche.
//Mostrar costes: Se mostrará el coste acumulado de todos los coches de la lista.
//Eliminar coche: Se pedirá una matrícula y se eliminará el coche de la lista
//Vaciar garaje: Eliminará todos los coches de la lista