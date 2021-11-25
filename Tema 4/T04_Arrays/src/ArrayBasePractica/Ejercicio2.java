package ArrayBasePractica;

public class Ejercicio2 {
    public static void main(String[] args) {
        int puntosObtenidos = 0;
        double media=0.0;
        int[] aleatorios = new int [30];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int)(Math.random()*11);
            System.out.print(aleatorios[i]);
        }
        System.out.println("");
        for (int i = 0; i < aleatorios.length; i++) {
            puntosObtenidos += aleatorios[i];
        }
        System.out.println("Numero de puntos obtenidos: "+puntosObtenidos);
        media = (double )puntosObtenidos / aleatorios.length;
        System.out.printf("Media de puntos obtenidos %.2f%n", media);
    }
}
//Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
//
//Numero de puntos obtenidos
//Media de puntos obtenidos