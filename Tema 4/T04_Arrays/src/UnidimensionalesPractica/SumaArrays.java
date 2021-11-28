package UnidimensionalesPractica;

import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaro variables
        int[] primero, segundo;
        int longitud;
        //pide datos por consola
        System.out.println("Indica la longitud de los arrays");
        longitud = in.nextInt();
        //doy valores a las variables
        primero = new int[longitud];
        segundo = new int[longitud];
        int[] tercero = new int[longitud];

        //relleno el primer array
        for (int i = 0; i < primero.length; i++) {
            System.out.println("Indica un numero para el primer array");
            primero[i] = in.nextInt();
        }
        //relleno el segundo array
        for (int i = 0; i < segundo.length; i++) {
            System.out.println("Indica un numero para el segundo array");
            segundo[i] = in.nextInt();
        }
        //relleno el tercero
        for (int i = 0; i < tercero.length; i++) {
            tercero[i] = primero[i] + segundo[i];
        }
        //imprimo los valores
        for (int item:primero) {
            System.out.print(item +" ");
        }
        System.out.println();
        for (int item:segundo) {
            System.out.print(item +" ");
        }
        System.out.println();
        for (int item:tercero) {
            System.out.print(item +" ");
        }
    }
}
//(SumaArrays) Crear una aplicación que:
//
//pida la longitud de dos arrays de enteros
//crea los array de enteros con las longitudes introducidas
//crea un tercer array de la misma longitud que los dos anteriores
//rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)