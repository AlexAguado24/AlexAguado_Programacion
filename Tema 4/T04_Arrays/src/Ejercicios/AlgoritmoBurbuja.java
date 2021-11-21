package Ejercicios;

import java.util.Scanner;

public class AlgoritmoBurbuja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] prueba = new int[5];
        int aux;

        //Valores del array
        System.out.println("Valores del Array ");

        for (int i = 0; i < prueba.length; i++) {
            System.out.println("Introduce un valor:");
            prueba[i] = in.nextInt();
        }

        //Algoritmo Burbuja

        for (int i = 0; i < prueba.length -1; i++) {
            for (int j = 0; j < prueba.length -1; j++) {
                if (prueba[j] > prueba[j+1]) {
                    aux = prueba[j];
                    prueba[j] = prueba[j+1];
                    prueba[j+1] = aux;

                }
            }
        }
        // Array ordenado de menor a mayor
        for (int i = 0; i < prueba.length; i++) {
            System.out.print(prueba[i]);
        }
        System.out.println("");
        // Array ordenado de mayor a menor
        for (int i = prueba.length-1; i >=0 ; i--) {
            System.out.print(prueba[i]);
        }
        in.close();
    }
}
