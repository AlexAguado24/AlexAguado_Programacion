package Ejercicios;

import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int longitud;
        int[] primerArray, segundoArray;

        System.out.println("Introduce la longitud de los Array");
        longitud = in.nextInt();

        primerArray = new int[longitud];
        segundoArray = new int[longitud];

        int[] tercerArray = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un valor para el primer Array");
            primerArray[i] = in.nextInt();
        }
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un valor para el segundo Array");
            segundoArray[i] = in.nextInt();
        }
        for (int i = 0; i < longitud; i++) {
            tercerArray[i] = primerArray[i] + segundoArray[i];
            System.out.println("Los numeros del tercer array son "+ tercerArray[i]);
        }

    }
}

//(SumaArrays) Crear una aplicación que:
//
//pida la longitud de dos arrays de enteros
//crea los array de enteros con las longitudes introducidas
//crea un tercer array de la misma longitud que los dos anteriores
//rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)