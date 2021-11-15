package base;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero:");
            int numero = in.nextInt();

            numeros[i]= numero;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d : %d%n", i, numeros[i]);
        }
    }
}
