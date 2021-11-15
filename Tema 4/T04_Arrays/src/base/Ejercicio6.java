package base;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] numeros = new int[20];
        int modificacion = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
            System.out.println(numeros[i]);
        }
        System.out.println("numeros modificados");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == 6) {
                numeros[i] = 8;
                modificacion++;
            } if (numeros[i] == 7) {
                numeros[i] = 15;
                modificacion++;
            } if (numeros[i] ==20) {
                numeros[i] = 10;
                modificacion++;
            }
            System.out.println(numeros[i]);
        }
        System.out.printf("Se han realizado %d moficaciones %n", modificacion);
    }
}
