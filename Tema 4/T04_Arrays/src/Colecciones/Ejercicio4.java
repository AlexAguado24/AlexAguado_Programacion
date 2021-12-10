package Colecciones;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> listaUno = new ArrayList<>();
        ArrayList<Integer> listaDos = new ArrayList<>();

        int numeros = 20, repetidos = 0;

        for (int i = 0; i < numeros; i++) {
            listaUno.add((int)(Math.random()*6));
            listaDos.add((int)(Math.random()*6));
        }
        System.out.println(listaUno + "\n" + listaDos);
        for (int i = 0; i < numeros; i++) {
            if (listaUno.get(i)==listaDos.get(i)) {
                repetidos++;
            }
        }
        System.out.println("La cantidd de numeros iguales es de "+repetidos);
    }
    //fori
    //if(a1.get(i)==a2.get(i))
}
//Crea dos ArrayList de números y guarda de forma aleatorio 20 números sin decimales en cada uno de ellos.
// Una vez hecho esto comprueba cuantos números de los dos arraylist son iguales (mismo número en la misma posición).
// Tras hacer la comprobación indica cuantos números han sido iguales
