package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6Clase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Object[] coche1 = new Object[]{"Mercedes","c22c",250,"ASD123"};
        Object[] coche2 = new Object[]{"Audi","A5",350,false};
        Object[] coche3 = new Object[]{"VW","Arteon",180, true, 45.0,"repro"};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        listaCoches.add(new Object[]{"Ford","focus",150});
        listaCoches.add(new Object[]{"Ford","fiesta",423});
        listaCoches.add(new Object[]{"Ford","mondeo",123});
        listaCoches.add(new Object[]{"Mercedes","c180",180});
        listaCoches.add(new Object[]{"Mercedes","ClaseA",160});
        listaCoches.add(new Object[]{"Mercedes","benz",100});
        listaCoches.add(new Object[]{"Audi","r8",200});
        listaCoches.add(new Object[]{"Audi","a3",170});



        //obtener coches
        /*Object[] cocheSeleccionado = listaCoches.get(0);
        System.out.println(cocheSeleccionado[1]);
        System.out.println(listaCoches.get(2)[0]);*/
        //usando foreach
        listaCoches.get(0)[2]=700;
        System.out.println("Introduce la marca que quieres buscar");
        String marca = in.next();
        for (Object[] coche:listaCoches) {
            if (marca.equals(coche[0])) {
                for (Object item : coche) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }
            //System.out.println("Marca: "+ item[0] +" Modelo: "+item[1]+" CV: "+item[2]);
        }
        //usando for
        /*for (int i = 0; i < listaCoches.size(); i++) {
            Object[] cocheActual = listaCoches.get(i);
            for (int j = 0; j < cocheActual.length o listaCoches.size/get(i).length si no me quiero crear la variable; j++) {
                System.out.print("\t "+cocheActual[j]);
            }
            System.out.println();
        }*/
        in.close();
    }
}
