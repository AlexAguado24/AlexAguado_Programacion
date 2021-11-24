package Tema02;

import java.util.Scanner;

public class CompararLogica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        boolean compara1 = true,
                compara2 = true,
                compara3 = true;

        System.out.println("Escribe un numero entre el 0 y 9:");
        num1 = in.nextInt();
        System.out.println("Escribe un numero entre el 0 y 9:");
        num2 = in.nextInt();

        compara1 = num1 %2==0 && num2 %2!=0;
        compara2 = num1 > num2*2 && num1*2 <8;
        compara3 = num1==num2 || num2-num1 <2;

        System.out.println(compara1);
        System.out.println(compara2);
        System.out.println(compara3);


    }
}
//CompararLogica.java
//Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:
//
//El primero es par y el segundo impar
//El primero es superior al doble del segundo e inferior a 8
//Son iguales o la diferencia entre el primero y el segundo es menor que 2
//ENTRADA
//Escribe un número entre 0 y 9: 4
//Escribe un número entre 0 y 9: 7
//
//SALIDA
//El primero es par y el segundo impar: true
//El primero es superior al doble del segundo e inferior a 8: false
//Son iguales o la diferencia entre el primero y el segundo es menor que 2: true