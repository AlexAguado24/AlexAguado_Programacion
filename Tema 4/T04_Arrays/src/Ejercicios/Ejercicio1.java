package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random()* (50 - 10) + 10);
            numeros[i] = num;
        }
        for (int generados : numeros) {
            System.out.printf("%d%n", generados);
        }
    }
}
//(LlenarArrays) Crear un array de int que tenga 5 posiciones y rellenarla con números aleatorios del 10 al 50. Mostrar por pantalla todos los números generados.