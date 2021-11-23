package Practicando;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class FormatoPersonas {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nomAp1, nomAp2;
        int edad1, edad2;
        double altura1, altura2;
        String letra1, letra2;


        System.out.println("primer Cliente:");
        System.out.println("Nombre y apellido:");
        nomAp1 = in.nextLine();
        System.out.println("Edad:");
        edad1 = in.nextInt();
        System.out.println("Altura:");
        altura1 = in.nextDouble();
        System.out.println("Letra DNI:");
        letra1 = in.next();

        System.out.println("");

        System.out.println("Segundo cliente");
        System.out.println("Nombre y apellido:");
        nomAp2 = in.next();
        System.out.println("Edad:");
        edad2 = in.nextInt();
        System.out.println("Altura:");
        altura2 = in.nextDouble();
        System.out.println("Letra DNI:");
        letra2 = in.next();

        System.out.println("Nombre \t\t\t\t Edad\t Altura\tLetra");
        System.out.println("=============== ====  =======  =====");
        System.out.println(nomAp1+"\t\t\t\t"+edad1+"\t"+altura1+"\t"+letra1);
        System.out.println(nomAp2+"\t\t\t\t"+edad2+"\t"+altura2+"\t"+letra2);
        System.out.println("---------------------------------------------");

        in.nextInt();
    }
}
//FormatoPersonas.java
//Hágase un programa que lea el nombre de dos personas, su altura, su edad, si tienen carnet o no de conducir y la letra de su dni. Se mostrarán los datos como se indica en la salida.
//
//ENTRADA
//Nombre y apellidos: Juan Gómez
//Edad: 23
//Altura: 1,79
//Carnet de conducir: false
//Letra dni: a
//Nombre y apellidos: María Lombardi Edad: 45
//Altura: 1,53
//
//SALIDA
//
//NOMBRE           EDAD  ALTURA CARNET LETRA
//================ ===== ====== ====== =====
//Juan Gómez       00023   1,79 FALSE      A
//Maria Lombardi   00045   1,53 TRUE       X
//-------------------------------------------