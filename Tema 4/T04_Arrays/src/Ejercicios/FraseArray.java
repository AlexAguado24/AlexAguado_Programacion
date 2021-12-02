package Ejercicios;

import java.util.Scanner;

public class FraseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase, masLarga="", masCorta="sdgfjhsgdfdggfdagfudygudasygf";


        System.out.println("Escribe una frase");
        frase = in.nextLine();

        String[] palabras = frase.split(" ");

        for (String item:palabras) {
            if (item.length() > masLarga.length() ) {
                masLarga = item;
            }
            if (item.length() < masCorta.length()) {
                masCorta = item;
            }
            if (item.length() == 4) {
                System.out.println(item);;
            }
        }
        System.out.println("La palabra mas larga es "+ masLarga);
        System.out.println("La palabra mas corta es "+ masCorta);


        in.close();
    }
}
//(FraseArray) Crear un programa que lea por teclado una frase.
// Con la frase leída crear un array de String con cada una de las palabras que forman parte de la frase. Una vez introducida el programa mostrará:
//La palabra más larga
//La palabra más corta
//La palabra o palabras que tienen exactamente 4 caracteres