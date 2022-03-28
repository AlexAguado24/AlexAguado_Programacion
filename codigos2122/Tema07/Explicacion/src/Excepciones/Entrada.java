package Excepciones;

import java.lang.reflect.Array;

public class Entrada {

    public static void main(String[] args) {
        String palabra = null;
        String[] palabras = new String[]{"uno","dos","tres","cuatro"};
        try {
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        } catch (NullPointerException e) {
            System.out.println("La palabra es nula");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de acceso en el array");
        }

        finally {
            System.out.println("Ejecucion obligatoria");
        }

        System.out.println("Bloque final");


    }

}
