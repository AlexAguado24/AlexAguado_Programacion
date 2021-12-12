package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList listaCoches = new ArrayList();
        Scanner in = new Scanner(System.in);
        Object[] coche1 = new Object[3];
        Object[] coche2 = new Object[3];
        Object[] coche3 = new Object[3];
        String marca, modelo;
        int caballos;
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        for (int i = 0; i < coche1.length; i++) {
            if (i == 0) {
                System.out.println("Introduce la marca");
                marca = in.next();
            }
            if (i == 1) {
                System.out.println("Introduce el modelo");
                modelo = in.next();
            }
            if (i == 2) {
                System.out.println("Introduce los caballos");
                caballos = in.nextInt();
            }
        }
        for (int i = 0; i < coche2.length; i++) {
            if (i == 0) {
                System.out.println("Introduce la marca");
                marca = in.next();
            }
            if (i == 1) {
                System.out.println("Introduce el modelo");
                modelo = in.next();
            }
            if (i == 2) {
                System.out.println("Introduce los caballos");
                caballos = in.nextInt();
            }
        }
        for (int i = 0; i < coche3.length; i++) {
            if (i == 0) {
                System.out.println("Introduce la marca");
                marca = in.next();
            }
            if (i == 1) {
                System.out.println("Introduce el modelo");
                modelo = in.next();
            }
            if (i == 2) {
                System.out.println("Introduce los caballos");
                caballos = in.nextInt();
            }
        }
        for (Object item:listaCoches) {
            System.out.println(item);
        }
        System.out.println(listaCoches);
        in.close();
    }
}
//Crea un programa que permita meter una lista de coches, donde cada coche consta de marca (String), modelo (String) y caballos (int).
// Mete tres coches manualmente