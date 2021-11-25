package ArrayBasePractica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero:");
            numeros[i] = in.nextInt();
        }
        for (int item :numeros) {
            System.out.printf("%d : %d%n", indice, item);
            indice++;
        }
    }
}
//Realiza un programa que pida 10 números por teclado y que los almacene en un array.
// A continuación se mostrará el contenido de ese array junto al índice (0 – 9)