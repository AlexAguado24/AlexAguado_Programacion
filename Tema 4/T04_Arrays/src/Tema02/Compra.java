package Tema02;

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorCompra;
        int iva;

        System.out.println("Introduce el valor de tu compra:");
        valorCompra = entrada.nextDouble();
        System.out.println("Introduce el IVA:");
        iva = entrada.nextInt();


        double sinIva = valorCompra - ((valorCompra / iva)/100);
        double ivaCompra = valorCompra - sinIva;

        System.out.printf("Compra: %.2f%n", sinIva);
        System.out.printf("IVA: %.2f%n \t=====%n\t%.2f", ivaCompra, valorCompra);

        entrada.close();
    }
}
//Compra.java
//Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€)
// y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA? ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.
//
//ENTRADA
//Valor de la compra (entre 0.00 y 500.00):298,45
//IVA (entre 0 y 25%):12
//
//SALIDA
//Compra: 	266.47
//IVA: 	31.98
//	======
//	298.45
