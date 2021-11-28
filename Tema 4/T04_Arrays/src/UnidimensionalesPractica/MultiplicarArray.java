package UnidimensionalesPractica;

import java.util.Scanner;

public class MultiplicarArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] posiciones = new int[5];
        int suma = 0;
        double media = 0.0;

        for (int i = 0; i < posiciones.length; i++) {
            System.out.println("Introduce un numero:");
            posiciones[i] = in.nextInt();
        }
        for (int item:posiciones) {
            item*=2;
        }
        for (int item:posiciones) {
            suma +=item;
        }
        System.out.println("La suma es igua a "+suma);
        media = (double) suma / posiciones.length;
        System.out.printf("La media es igual a %.2f%n", media);

    }
}
//(MultiplicarArray) Crear un array de 5 posiciones:
//
//se le pedirá al usuario que introduzca cada unos de los elementos del array
//Multiplica cada elemento del array * 2 y vuelve a guardar su valor
//Saca por consola la suma de todos los números
//Saca la media de todos los elementos