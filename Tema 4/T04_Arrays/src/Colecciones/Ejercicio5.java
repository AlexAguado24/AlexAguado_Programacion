package Colecciones;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("aparcar");
        palabras.add("subir");
        palabras.add("camion");
        palabras.add("gacela");
        palabras.add("jodido");
        palabras.add("croquet");
        palabras.add("balanceandome");
        palabras.add("ballena");
        palabras.add("chaqueta");
        palabras.add("moto");

        System.out.println(palabras);

        int numletras=0;
        String masLarga = "", masCorta="fduyguyeergufysegguoyhuifghuywehfrguuhew";

        for (String item:palabras) {
            numletras+=item.length();
            if (item.length() > masLarga.length() ) {
                masLarga = item;
            }
            if (item.length() < masCorta.length()) {
                masCorta = item;
            }
        }
        System.out.println("El numero total de letras es "+numletras);
        System.out.println("La palabra mas larga es "+masLarga);
        System.out.println("La palabra mas corta es "+masCorta);
    }
    //para sumar palabras se usa el .length y lo acumulamos
}
//Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera.
//Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra