package Ejercicios;

import java.util.Scanner;

public class GeneradorPalabras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','k','r','s','t','u','v','w','x','y','z'};
        int longitud;

        System.out.println("Indica la longitud del array");
        longitud = in.nextInt();

        for (int i = 0; i < longitud; i++) {
            System.out.println("Palabra " +i);
            System.out.println("Indica la longitud de cada palabra del array");
            int numeroLetras = in.nextInt();
            String palabra = "";
            for (int j = 0; j < numeroLetras; j++) {
                char letraAleatoria =abecedario[(int) (Math.random()*abecedario.length)];
                palabra += letraAleatoria;
            }
            System.out.println(palabra);
        }

        in.close();
    }
}
//(GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
//Crear un de chars con todas las letras del abecedario.
//Crear un array de String con una longitud pedida por teclado
//Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
// Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
// (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
//Imprimir por pantalla las palabras generadas