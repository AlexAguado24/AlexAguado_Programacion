package ExcepcionAleatorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int intentos = 0;
        int numeroIntroducido = 0;
        int numeroClave = (int)(Math.random()*8);
        do {
            try {
                System.out.println("Adivina el numero escondido");
                in = new Scanner(System.in);
                numeroIntroducido = in.nextInt();
                if (numeroIntroducido<0) {
                    throw new ExcepcionNumero("Numero inferior a 0");
                }
            } catch (InputMismatchException | ExcepcionNumero e) {
                System.out.println(e.getMessage());
            } finally {
                intentos++;
            }
        } while (numeroIntroducido != numeroClave);

        System.out.println("Felicidades, lo has adivinado tras " + intentos + " intentos");

    }
}
