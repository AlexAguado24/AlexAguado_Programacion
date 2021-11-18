package Ejercicios;

import java.util.Scanner;

public class PosicionesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int longitud;
        int [] numeros;


        System.out.println("Indica la longitud de tu Array");
        longitud = in.nextInt();

        numeros = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un elemento del Array");
            numeros[i] = in.nextInt();
        }
        int ultimo = numeros[numeros.length-1];
        int primero = numeros[0];

        for (int i = numeros.length; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[numeros.length-1]= primero;
        for (int item: numeros) {
            System.out.print(item);
        }
    }
}
//(PosicionesArray) Crea una aplicación que:
//
//pida por teclado la longitud de un array
//cree el array de enteros de la longitud introducida
//pida al usuario que introduzca todos los datos del array
//mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
//realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente