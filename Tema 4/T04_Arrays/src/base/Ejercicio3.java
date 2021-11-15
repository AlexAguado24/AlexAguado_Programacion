package base;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero:");
            int numero = in.nextInt();

            numeros[i]= numero;
        }
        System.out.println("Orden inverso");
        for (int i = 9; i >= 0 ; i--) {
            if (i > 0) {
                System.out.print(numeros[i]+",");
            } else {
                System.out.println(numeros[i]);
            }

        }
        System.out.printf("%n");
        System.out.println("Orden normal");
        for (int i = 0; i < numeros.length; i++) {
            if (i < 9) {
                System.out.print(numeros[i]+",");
            } else {
                System.out.println(numeros[i]);
            }
        }

        in.close();
    }

}
