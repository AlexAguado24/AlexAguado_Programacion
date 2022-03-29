package Ejercicio3Repaso;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige una de las opciones");
            System.out.println("1. Crear carrera");
            System.out.println("2. Validar vehiculo");
            System.out.println("3. Generar ganador");
            System.out.println("4. Ver ganador");
            opcion = in.nextInt();
            switch (opcion){

            }
        } while (opcion != 0);
    }
}
