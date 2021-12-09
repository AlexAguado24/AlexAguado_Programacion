package Ejercicios;

import java.util.Scanner;

public class InvisibleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numParticipantes;

        System.out.println("Por favor introduce el numero de participantes");
        numParticipantes = in.nextInt();

        if (numParticipantes % 2 != 0) {
            System.out.println("Numero incorrecto, por favor introduce un numero par");
            numParticipantes = in.nextInt();
        }

        String[] nombres = new String[numParticipantes];
        String[] participantesSalidos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre de los participantes");
            nombres[i] = in.next();

            int participanteAleatorio = (int) (Math.random() * nombres.length);
            String participanteGenerado = nombres[participanteAleatorio];

            for (int x = 0; x < participantesSalidos.length; x++) {
                if (participanteGenerado.equalsIgnoreCase(participantesSalidos[x])) {
                    participanteAleatorio = (int) (Math.random() * nombres.length);
                }
            }
            if (i%2!=0) {
                System.out.print("Las parejas van a ser " + nombres[participanteAleatorio]);
                System.out.println(nombres[participanteAleatorio]);
            } else {
                System.out.println();
            }
        }
    }
}
//(InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programadebe:
//
//pedir el número de participantes (de ser impar saltará un fallo)
//pedir el nombre de cada uno de los participantes
//sacar por pantalla el orden de las parejas resultantes
