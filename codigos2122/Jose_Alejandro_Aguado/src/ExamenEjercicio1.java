import java.util.Scanner;

public class ExamenEjercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion, tamanio = 0;
        int[] array = null;

        do {
            System.out.println("1/Iniciar el array");
            System.out.println("2/Guardar numeros aleatorior para rellenar el array");
            System.out.println("3/Listar posiciones superiores a 10 que el numero sea par");
            System.out.println("4/Rotar posicion del array a la izquierda");
            System.out.println("5/Listar posiciones del array");
            System.out.println("Indica la opcion deseada:");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Introduce el tamaño del array");
                    tamanio = in.nextInt();
                    if (tamanio <= 0) {
                        System.out.println("Tamaño incorrecto, introduce un numero entero");
                    } else {
                        array = new int[tamanio];
                    }
                    break;
                case 2:
                    if (tamanio == 0) {
                        System.out.println("El array no tiene una longitud definida, por favor definela");
                    } else {
                        for (int i = 0; i < array.length; i++) {
                            array[i] = (int) (Math.random() * 101);
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (tamanio == 0) {
                        System.out.println("El array no tiene una longitud definida, por favor definela");
                    } else {
                        for (int item : array) {
                            if (item > 10 && item % 2 == 0) {
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    if (tamanio == 0) {
                        System.out.println("El array no tiene una longitud definida, por favor definela");
                    } else {
                        int ultimo = array.length - 1;
                        for (int i = array.length - 1; i == 0; i--) {
                            if (i != array[0]) {
                                array[i] = array[i]-1;
                            }
                            if (i == array[0]) {
                                array[i] = ultimo;
                            }
                        }
                        for (int item : array) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (tamanio == 0) {
                        System.out.println("El array no tiene una longitud definida, por favor definela");
                    } else {
                        for (int item : array) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
        } while (opcion != -1);
    }
}
