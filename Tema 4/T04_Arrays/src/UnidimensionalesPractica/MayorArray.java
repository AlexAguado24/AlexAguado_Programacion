package UnidimensionalesPractica;

import java.util.Scanner;

public class MayorArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] enteros;
        int longitud, max = -99999, min = 99999;


        System.out.println("Introduce la longitud del array");
        longitud = in.nextInt();

        enteros = new int[longitud];
        System.out.println("Introduce los valores");

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Escribe un numero:");
            enteros[i] = in.nextInt();
        }
        for (int item:enteros) {
            if (item>max) {
                max = item;
            }
            if (item<min) {
                min = item;
            }
        }
        System.out.printf("El elemento mayor es %d y el menor es %d%n", max, min);

        in.close();
    }
}
//(MayorArray) Crea una aplicación que realice lo siguiente:
//
//pida por pantalla la longitud del array de enteros
//crea el array de enteros con la longitud introducida
//pida al usuario que introduzca todos los datos del array
//saque por pantalla el elemento mayor y el elemento menor