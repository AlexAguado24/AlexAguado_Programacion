public class Arrays {

    public static void main(String[] args) {
        // array de numeros
        int[] numeros = new int [10];
        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double[] decimales = new double[2];
        int[] numerosDos = {1,2,3,4,5,6,7,8,9,10};
        int longitudArray = numerosDos.length;
        //System.out.println(longitudArray);
        //System.out.println(numerosDos[9]);


        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println(numerosDos[i]);
        }

        numerosDos[7] = 88;

        System.out.println("Modifico alguna posicion");


        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println(numerosDos[i]);
        }

        //Ejercio 1 Array

        int[] nuevaPosicion = new int [15];

        System.out.println("Modifico posiciones");

        for (int y = 0; y < nuevaPosicion.length; y++) {
            nuevaPosicion[y]= (int) (Math.random()*50 + 1);
            System.out.println(nuevaPosicion[y]);
        }

        System.out.println("Par o Impar");
        int numeroPar=0, numeroImpar=0;
        for (int i = 0; i < 15; i++) {
            if (nuevaPosicion[i] %2==0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }

        }




    }

    //meter en un array de 15 posiciones 15 numeros aleatorios entre 0 y 50
}
