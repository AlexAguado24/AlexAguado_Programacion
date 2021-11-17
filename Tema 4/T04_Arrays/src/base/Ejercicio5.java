package base;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero:");
            int numeroIntroducido = in.nextInt();
            numeros[i] = numeroIntroducido;
        }
        for (int num : numeros) {
            if (num %2 ==0) {
                System.out.println(num + " : Par");
            } else {
                System.out.println(num + " : Impar");
            }
        }
    }
}
//Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.