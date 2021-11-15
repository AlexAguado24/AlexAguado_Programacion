package base;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[30];
        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            //int numero = (int) (Math.random()*11);
            numeros[i] = (int) (Math.random()*11);
        }
        for ( int item : numeros ) {
            suma += item;
        }
        media = (double) suma / (double) numeros.length;
        System.out.println("La suma es "+suma);
        System.out.printf("La media es; %.2f%n", media);
    }
}
