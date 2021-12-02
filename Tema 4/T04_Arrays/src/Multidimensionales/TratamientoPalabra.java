package Multidimensionales;

import java.util.Locale;

public class TratamientoPalabra {
    public static void main(String[] args) {

        String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
        System.out.println(palabraTratar.toUpperCase());
        String palabraComparar = "ejemplo de palabras";

        if (palabraTratar.toLowerCase().equals(palabraComparar.toLowerCase())) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";

        //Saber cuantas palabras tengo

        String[] palabras = fraseCompleta.split(" ");
        System.out.println("El numero de palabras es "+ palabras.length);

        //cuantas letras tengo
        int letrasTotales=0;
        for (String item:palabras) {
            letrasTotales+=item.length();
        }
        System.out.println("El numero total de letras es; "+ letrasTotales);

        fraseCompleta.replaceAll(" ","").replaceAll(",","")
                        .replaceAll(".","");

        System.out.println(fraseCompleta);

        System.out.println(fraseCompleta.replaceAll(" ","").length());;

        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' ') {
                System.out.println(fraseCompleta.charAt(i));
            }
        }

        System.out.println(fraseCompleta.indexOf("a"));
        //fraseCompleta.indexOf(452);
        //fraseCompleta.substring(10,20)

        String correo = "borja.martin@cesjuanpablosegundo.es";
        //borja.martin
        //cesjuanpablosegundo.es
        correo.indexOf("@");
        String nombre= correo.substring(0,correo.indexOf("@"));
        System.out.println(nombre);
        String dominio= correo.substring(correo.indexOf("@")+1);
        System.out.println(dominio);



    }
}
