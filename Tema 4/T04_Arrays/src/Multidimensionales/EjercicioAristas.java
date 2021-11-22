package Multidimensionales;

import java.util.Scanner;

public class EjercicioAristas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int filas, columnas;
        int sumatorioFila1 = 0, sumatorioFilaN = 0, sumatorioColumna1 = 0, sumatorioColumnaN = 0;
        int numerosAleatorios[][];

        System.out.println("cuantas filas tendra el array");
        filas = in.nextInt();

        System.out.println("cuantas columnas tendra el array");
        columnas = in.nextInt();

        numerosAleatorios = new int[filas][columnas];
        //Guardamos e imprimimos los valores
        for (int i = 0; i < numerosAleatorios.length; i++) {
            //recorro la fila i
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = (int) (Math.random() * 21);
                System.out.print(numerosAleatorios[i][j] + "\t ");

            }
            System.out.println("");
        }
        //  Sumamos valores de la fila 1 y N y columnas 1 y N
        // for i para recorrer las filas
        /*for (int i = 0; i < numerosAleatorios.length; i++) {
            //for i para recorrer las columnas
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                //if para el sumatorio de la primera fila
                if (i == 0) {
                    sumatorioFila1 +=numerosAleatorios[i][j];
                }
                //if para el sumatorio de la fila N
                if (i == filas-1) {
                    sumatorioFilaN += numerosAleatorios[i][j];
                }
                //if para el sumatorio de la primera columna
                if (j == 0) {
                    sumatorioColumna1 += numerosAleatorios[i][j];
                }
                //if para el sumatorio de la columna N
                if (j == columnas-1) {
                    sumatorioColumnaN += numerosAleatorios[i][j];
                }
            }
        }*/

        //Realizamos los sumatorios con un foreach
        int numeroFila = 0;
        for (int[] fila : numerosAleatorios) {
            //primera fila
            if (numeroFila == 0) {
                for (int columna : fila) {
                    sumatorioFila1 += columna;
                }
            }
            //ultima fila
            if (numeroFila == filas -1) {
                for (int columna : fila) {
                    sumatorioFila1 += columna;
                }
            }
            //primera columna
            //ultima columna

            numeroFila++;
        }
        System.out.println("La suma de la primera fila es " + sumatorioFila1);
        System.out.println("La suma de la ultima fila es " + sumatorioFilaN);
        System.out.println("La suma de la primera columna es " + sumatorioColumna1);
        System.out.println("La suma de la ultima columna es " + sumatorioColumnaN);
    }
}
