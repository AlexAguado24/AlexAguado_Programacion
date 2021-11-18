package base;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] palabras = new String[10];
        Scanner in = new Scanner(System.in);

        int sumaLetras = 0;
        int eleccion;
        String palabra;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Por favor introduce una palabra nueva");
            palabra = in.next();

            palabras[i] = palabra;
        }

        do {

            System.out.println("1: Ver todas las palabras");
            System.out.println("2: Obtener una palabra al azar");
            System.out.println("3: Ver numero de letras");
            System.out.println("4: Ver media de letras");
            System.out.println("5: Ver palabra con mas letras");
            System.out.println("6: Ver palabra con menos letras");
            System.out.println("Por favor elige una opcion");
            eleccion = in.nextInt();
        }while(eleccion!=0);


        switch (eleccion) {

            case 1:
                System.out.println("Vas a mostrar palabras");
                for (String item: palabras) {
                    System.out.println(item);
                }
                break;

            case 2:
                System.out.println("Vas aa optener una palabra aleatoria");
                //10 posiciones ->0 - 9
                int aleatorio = (int) (Math.random()*10);
                System.out.println("La palabra aleatoria es "+palabras[aleatorio]);
                break;

            case 3:
                sumaLetras =0;
                for (String item: palabras) {
                    item.length();
                    sumaLetras += item.length();
                }
                System.out.println("El numero total de letras es "+ sumaLetras);
                break;

            case 4:
                if (sumaLetras == 0) {
                    System.out.println("El numero de letras es 0, deberias contarlas primero");
                } else {
                    System.out.println("Ver el umero medio de letras " + sumaLetras / palabras.length);
                }
                break;

            case 5|6:
                String pequenia = "jhsgfkjasbfjhadjfjzdsgfasdgjads", grande = "";
                for (String item: palabras) {
                    if (item.length()> grande.length()) {
                        grande = item;

                    }
                    if (item.length()<pequenia.length()) {
                        pequenia = item;
                    }
                }
                break;
        }

        in.close();
    }
}
//Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//Ver todas las palabras: mostrarla todas las palabras del array
//Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//Ver media de letras: mostrará el número medio de letras entre todas las palabas
//Ver palabra con más letras
//Ver palabra con menos letras