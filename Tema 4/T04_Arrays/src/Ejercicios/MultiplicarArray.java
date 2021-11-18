package Ejercicios;

import java.util.Scanner;

public class MultiplicarArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner in = new Scanner(System.in);
        int suma = 0;
        double media = 0;

        for (int i = 0; i <= numeros.length -1; i++) {
            System.out.println("Introduce un numero");
            int numeroIntroducido = in.nextInt();

            numeros[i] = numeroIntroducido;
        }
        for (int multiplicar: numeros) {
            System.out.println(multiplicar * 2);
        }
        for (int item : numeros) {
             suma += item;
        }
        media = (double) suma / (double) numeros.length;

        System.out.printf("La suma de todos los numeros es %d%n", suma);
        System.out.printf("La media de todos los numeros es %.2f%n", media);
    }
}

//for (int i = 0; i <numeros.length; i++){
    //numeros[i]= numeros[i] * 2; - para multiplicar los elementos con un for normal
    //}
// for (int item: numeros)
    //system.out.println(item)- para sacar los elementos por consola
//(MultiplicarArray) Crear un array de 5 posiciones:
//
//se le pedirá al usuario que introduzca cada unos de los elementos del array
//Multiplica cada elemento del array * 2 y vuelve a guardar su valor
//Saca por consola la suma de todos los números
//Saca la media de todos los elementos