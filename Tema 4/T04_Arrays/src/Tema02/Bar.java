package Tema02;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioBebidas = 1.25, precioBocadillos = 2.05;
        int numBebidas, numBocatas;

        System.out.println("Numero de bebidas:");
        numBebidas = entrada.nextInt();
        System.out.println("Numero de bocadillos");
        numBocatas = entrada.nextInt();

        System.out.println("El coste de las bebidas es "+ precioBebidas * numBebidas);
        System.out.println("El coste de los bocadillos es "+ precioBocadillos * numBocatas);
        System.out.println("el coste total es "+ ((precioBebidas * numBebidas)+(precioBocadillos*numBocatas)));

        entrada.close();
    }
}
//Bar.java
//Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
// El camarero les pregunta cuántas bébidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos.
//
//ENTRADA
//Número de bebidas: 3
//Número de bocadillos: 5
//
//SALIDA
//Coste de las bebidas: 3.75
//Coste de los bocadillos: 10.25
//Coste consumición: 14.0