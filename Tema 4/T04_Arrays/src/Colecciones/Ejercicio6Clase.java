package Colecciones;

import java.util.ArrayList;

public class Ejercicio6Clase {
    public static void main(String[] args) {
        Object[] coche1 = new Object[]{"Mercedes","c22c",250,"ASD123"};
        Object[] coche2 = new Object[]{"Audi","A5",350,false};
        Object[] coche3 = new Object[]{"VW","Arteon",180, true, 45.0,"repro"};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        listaCoches.add(new Object[]{"Ford","focus",150});

        //obtener coches
        /*Object[] cocheSeleccionado = listaCoches.get(0);
        System.out.println(cocheSeleccionado[1]);
        System.out.println(listaCoches.get(2)[0]);*/

        for (Object[] coche:listaCoches) {
            for (Object item :coche) {
                System.out.print(item + "\t");
            }
            System.out.println();
            //System.out.println("Marca: "+ item[0] +" Modelo: "+item[1]+" CV: "+item[2]);
        }

        /*for (int i = 0; i < listaCoches.size(); i++) {
            Object[] cocheActual = listaCoches.get(i);
            for (int j = 0; j < cocheActual.length o listaCoches.size/get(i).length si no me quiero crear la variable; j++) {
                System.out.print("\t "+cocheActual[j]);
            }
            System.out.println();
        }*/
    }
}
