package base;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        for (int i = 0; i < numero.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d \t %d \t %d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
