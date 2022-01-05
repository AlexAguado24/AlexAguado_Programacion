/*package BaseHashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MapeandoGaraje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        Hashtable<String, Object[]> garaje = new Hashtable();

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
                    if (garaje.size()<=10) {
                        System.out.println("Añadiendo coche al garaje");
                        System.out.println("Introduce la marca del coche");
                        String marca = in. next();
                        System.out.println("Introduce el modelo del coche");
                        String modelo = in.next();
                        System.out.println("Introduce el coste de la reparacion");
                        int coste = in.nextInt();
                        System.out.println("Introduce la matricula del coche");
                        String matricula = in.next();
                        Object[] coche = new Object[]{marca, modelo, coste, matricula};
                        garaje.put(coche[3].toString(), coche);
                        System.out.println("Coche añadido");
                    } else {
                        System.out.println("No hay mas espacio en el garaje");
                    }
                    break;
                case 2:
                    if (garaje.size() > 0) {
                        System.out.println("Listando coches");
                        Enumeration<Object[]> listaDatos = garaje.elements();
                        while (listaDatos.hasMoreElements()) {
                            Object[] cocheActual = listaDatos.nextElement();
                            for (Object item : cocheActual) {
                                System.out.print(item+"\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("El garaje esta vacio, por favor introduce un coche");
                }

                    break;
                case 3:
                    if (garaje.size() > 0) {
                        System.out.println("Buscando coche");
                        Enumeration<String> listaDatos = garaje.keys();
                        while (listaDatos.hasMoreElements()) {
                            String clave = listaDatos.nextElement();
                            Object[] coche = garaje.get(clave);
                            for (Object item :coche) {
                                boolean encontrado = false;
                                System.out.println("Introduce la matricula del coche que quieres buscar");
                                String matricula = in.next();
                                /*if (item[3].toString.equalsIgnoreCase) {
                                    encontrado = true;
                                    System.out.print(item +"\t");
                                }
                                if (!encontrado){
                                    System.out.println("El coche que buscas no esta en el garaje");
                                }*/
                            /*}
                        }
                    } else {
                        System.out.println("El garaje esta vacio, por favor añade un coche");
                    }
                    break;
            }
        }
        while (opcion > 0);
        in.close();
    }
}*/
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