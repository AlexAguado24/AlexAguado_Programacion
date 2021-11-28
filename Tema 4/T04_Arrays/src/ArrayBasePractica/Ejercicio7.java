package ArrayBasePractica;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] palabras = new String[10];
        int opciones, numLetras =0;
        double media=0.0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra:");
            palabras[i] = in.next();
        }
        do {
            System.out.println("Opciones:");
            System.out.println("1/Ver todas las palabras:");
            System.out.println("2/Obtener una palabra al azar:");
            System.out.println("3/Ver número de letras:");
            System.out.println("4/Ver media de letras:");
            System.out.println("5/Ver palabra con más letras");
            System.out.println("6/Ver palabra con menos letras");
            System.out.println("Elige una de las opciones");
            opciones = in.nextInt();

            switch (opciones) {
                case 1:
                    for (String item : palabras) {
                        System.out.print(item + " ");
                    }
                    break;
                case 2:
                    int aleatorio = (int) (Math.random() * 10);
                    System.out.println("La palabra al azar es " + palabras[aleatorio]);
                    break;
                case 3:
                    for (String item:palabras) {
                        numLetras += item.length();
                    }
                    System.out.println("El numero total de letras es "+ numLetras);
                    break;
                case 4:
                    for (String item:palabras) {
                        media = (double) numLetras / item.length();
                    }
                    System.out.printf("La media de letras es %.2f%n", media);
                    break;
                case 5:
                    String mayor = "";
                    for (String item:palabras) {
                        if (item.length() > mayor.length()) {
                            mayor = item;
                        }
                    }
                    System.out.printf("La palabra con mas letras es %s%n", mayor);
                    break;
                case 6:
                    String menor = "sjdfhguygfdiusdhgfiuasdgifusdghddifu";
                    for (String item:palabras) {
                        if (item.length() < menor.length()) {
                            menor= item;
                        }
                    }
                    System.out.printf("La palabra con mas letras es %s%n", menor);
                    break;
            }
        } while (opciones !=0 && opciones<=6);
    }
}
//Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//Ver todas las palabras: mostrarla todas las palabras del array
//Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//Ver media de letras: mostrará el número medio de letras entre todas las palabas
//Ver palabra con más letras
//Ver palabra con menos letras