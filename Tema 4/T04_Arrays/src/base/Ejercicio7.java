package base;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] palabras = new String[10];
        Scanner in = new Scanner(System.in);

        String palabra;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Por favor introduce una palabra nueva");
            palabra = in.next();

            palabras[i] = palabra;
        }

        System.out.println("1: Ver todas las palabras");
        System.out.println("2: Obtener una palabra al azar");
        System.out.println("3: Ver numero de letras");
        System.out.println("4: Ver media de letras");
        System.out.println("5: Ver palabra con mas letras");
        System.out.println("6: Ver palabra con menos letras");
        System.out.println("Por favor elige una opcion");
        int eleccion = in.nextInt();


        switch (eleccion) {

            case 1:
                for (int i = 0; i < palabras.length; i++) {
                    System.out.println(palabras[i]);
                }
                break;

            case 2:

                break;

        }
    }
}
//Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//Ver todas las palabras: mostrarla todas las palabras del array
//Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//Ver media de letras: mostrará el número medio de letras entre todas las palabas
//Ver palabra con más letras
//Ver palabra con menos letras