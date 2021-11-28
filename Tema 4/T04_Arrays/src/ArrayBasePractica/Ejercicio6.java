package ArrayBasePractica;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] aleatorios = new int[20];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random()* 31);
            System.out.print(aleatorios[i]);
        }
        System.out.println("");

        for (int item:aleatorios) {
            if (item == 6) {
                item += 2;
            }
            if (item == 7) {
                item +=8;
            }
            if (item == 20) {
                item -= 10;
            }
            System.out.print(item);
        }

    }
}
//Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
//
//modificar todos los 6 por 8
//modificar todos los 7 por 15
//modificar todos los 20 por 10