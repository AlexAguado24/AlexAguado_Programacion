package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class MayorArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //creo las variables para trabajar + el array vacio
        int longitud;
        int[] numeros;
        int max=-99999, min=99999;

        System.out.println("¿De que longitud quieres crear el array?");
        longitud = in.nextInt();

        numeros = new int[longitud];

        for (int i = 0; i <= numeros.length -1; i++) {
            System.out.println("Introduce un numero");
            int numeroIntroducido = in.nextInt();

            numeros[i] = numeroIntroducido;
        }

        for (int item: numeros) {
            System.out.println(item);
        }

        System.out.println("Desordenados");

        //Ahora uso el Arrays.sort para ordenar los elementos de menos a mayor (Algoritmo de la burbuja)
        Arrays.sort(numeros);

        for (int item : numeros) {
            System.out.println(item);
        }

        System.out.println("El mayor es "+ numeros[numeros.length -1]);
        System.out.println("El menor es "+ numeros[0]);

        /*for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<min) {
                min = numeros[i];
            }
            if (numeros[i]>max) {
                max = numeros[i];
            }
        }
        //forma de hacerlo con un foreach
        for (int item:numeros) {
            if (item<min) {
                min = item;
            }
            if (item>max) {
                max = item;
            }
        }*/
    }
}

//(MayorArray) Crea una aplicación que realice lo siguiente:
//
//pida por pantalla la longitud del array de enteros
//crea el array de enteros con la longitud introducida
//pida al usuario que introduzca todos los datos del array
//saque por pantalla el elemento mayor y el elemento menor
