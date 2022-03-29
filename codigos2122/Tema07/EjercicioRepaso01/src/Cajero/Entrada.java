package Cajero;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<String> listaErrores;
        Scanner in = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        int opcion = 0;
        int dinero = 0;

        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Ver saldo");
            System.out.println("5. Ver errores");
            System.out.println("Elige una opcion");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Creando cuenta");
                    System.out.println("Introduce un id");
                    String id = in.next();
                    System.out.println("Introduce un pin");
                    String pin = in.next();
                    int saldo = 0;

                    cuenta = new Cuenta(id,pin,saldo);
                    System.out.println("Cuenta creada");
                    break;
                case 2:
                    System.out.println("Ingresando dinero");
                    System.out.println("¿Cuanto dinero quieres ingresar?");
                    dinero = in.nextInt();
                    if (dinero < 0) {
                        System.out.println("No puedes ingresar esa cantidad, indica otra");
                        dinero = in.nextInt();
                    }
                    cuenta.ingresarDinero(dinero);
                    System.out.println("Dinero ingresado con exito");

                    break;
                case 3:
                    System.out.println("Sacando Dinero");
                    if (cuenta.getSaldo() == 0) {
                        System.out.println("Tu saldo esta a cero, debes ingresar dinero antes");
                    } else {
                        System.out.println("¿Cuanto dinero quieres sacar?");
                        dinero = in.nextInt();
                        if (dinero <= 0) {
                            System.out.println("La cantidad indicada no es correcta, indica un numero mayor que 0");
                            dinero = in.nextInt();
                        }
                        cuenta.sacarDinero(dinero);
                    }
                    break;
                case 4:
                    System.out.println("El saldo de la cuenta es "+cuenta.getSaldo());
                    break;
                case 5:
                    listaErrores = new ArrayList<>();

                    break;
            }
        } while (opcion != 0);

    }
}
