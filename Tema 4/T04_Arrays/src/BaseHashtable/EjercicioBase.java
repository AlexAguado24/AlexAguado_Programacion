package BaseHashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<String ,Object[]> listaCoches = new Hashtable();


        Object[] coche = new Object[]{"mercedes", "benz", "1234a"};
        listaCoches.put(coche[2].toString(), coche);
        listaCoches.put("2345b", new Object[]{"ford", "fiesta", "2345b", "100cv"});
        listaCoches.put("3456c", new Object[]{"Audi", "R8","3456c", "deportivo", "400cv"});

        //sacando datos con el metodo keys
        /*Enumeration<String> listaDatos = listaCoches.keys();
        while (listaDatos.hasMoreElements()) {
            String clave = listaDatos.nextElement();
            Object[] coches = listaCoches.get(clave);
            for (Object item : coches) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }*/

        //sacando datos con el metodo Elements
        Enumeration<Object[]> listaDatos = listaCoches.elements();
        while (listaDatos.hasMoreElements()) {
            Object [] coches = listaDatos.nextElement();
            for (Object item : coches) {
                System.out.print(item +"\t");
            }
            System.out.println();
        }

        //os pidan una matricula por teclado y saqueis todos los datos del coche encontrado.
        //en el caso de no encontrar la matricula saltara el aviso

        /*System.out.println("Introduce la matricula del coche que quieres buscar");
        String matricula = in.next();*/

        /*if (listaCoches.get(matricula) != null) {
            //Object[] cocheEncontrado = listaCoches.get(matricula);
            for (Object item :listaCoches.get(matricula)) {
                System.out.print(item+"\t");
            }
        } else {
            System.out.println("El coche no esta en la lista");
        }*/



    }
}
