package Practicando;

public class Metodos {
    public static void main(String[] args) {;
        int precio = 5;

        double precioiva = (double) precio * 0.21;
        double total = precioiva + precio;

        System.out.println(total);
    }
}
//Factura.java
//Escribe un programa que calcule el total de una factura a partir un precio base.
// Todos los elementos deberán ser guardados en variables. Se deberá mostrar tanto el precio con IVA y el precio sin IVA