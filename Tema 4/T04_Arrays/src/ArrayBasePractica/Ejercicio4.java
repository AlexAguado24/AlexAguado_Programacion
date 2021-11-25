package ArrayBasePractica;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20],
                cuadrado = new int[20],
                cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random()*101);
            System.out.print(numero[i]+",");
        }
        System.out.println();
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] =(int) Math.pow(numero[i],2 );
            System.out.print(cuadrado[i]+",");
        }
        System.out.println();
        for (int i = 0; i < numero.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
            System.out.print(cubo[i] + ",");
        }
    }
}
//Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
//
//En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
//En el array cubo se deben almacenar los cubos de los valores que hay en numero.