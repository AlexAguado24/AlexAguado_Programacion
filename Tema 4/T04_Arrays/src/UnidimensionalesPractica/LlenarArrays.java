package UnidimensionalesPractica;

public class LlenarArrays {
    public static void main(String[] args) {
        int[] posiciones = new int[5];
        int min = 10, max = 50;
        for (int i = 0; i < posiciones.length; i++) {
            int num = (int) (Math.random()*(max - min + 1) + min);
            posiciones[i]=num;
        }
        for (int generados:posiciones) {
            System.out.println(generados);
        }

    }

}
//(LlenarArrays) Crear un array de int que tenga 5 posiciones y rellenarla con números aleatorios del 10 al 50. Mostrar por pantalla todos los números generados.