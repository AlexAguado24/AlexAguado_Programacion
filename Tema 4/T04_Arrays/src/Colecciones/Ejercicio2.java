package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add((int) (Math.random()*100+1));
        listaNumeros.add((int) (Math.random()*100+1));
        listaNumeros.add((int) (Math.random()*100+1));
        listaNumeros.add((int) (Math.random()*100+1));
        listaNumeros.add((int) (Math.random()*100+1));

        System.out.println(listaNumeros);

        int suma = 0, max = -99999, min = 99999;
        double media = 0.0;

        for (Integer item:listaNumeros) {
            suma += item;
            if (item > max) {
                max = item;
            }
            if (item<min) {
                min = item;
            }
        }
        /* para averiguar el maximo y minimo sin necesidad de if
        int max = Collections.max(listaNumeros);
        int min = Collections.min(listaNumeros);*/

        media = (double)suma / (double) listaNumeros.size();
        System.out.println("La suma es igual a "+suma);
        System.out.println("La media es igual a "+media);
        System.out.println("El numero maximo es "+max);
        System.out.println("El numero minimo es "+min);


    }
}
//Crea un ArrayList de numeros enteros que guarde valores aleatorios (entre 0 y 100).
// Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.