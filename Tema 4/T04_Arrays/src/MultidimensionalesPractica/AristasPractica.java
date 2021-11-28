package MultidimensionalesPractica;

public class AristasPractica {
    public static void main(String[] args) {
        //declarando variables
        int [][] aristas = new int[4][4];
        int sumaFila1 = 0, sumaFilaN = 0, sumaColumna1 = 0, sumaColumnaN = 0;

        //dando valores al array
        for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas.length; j++) {
                aristas[i][j] = (int)(Math.random()*(30-10+1)+10);
                if (j!= aristas.length-1) {
                    System.out.print(aristas[i][j]+",");
                }
                if (j >= aristas.length-1) {
                    System.out.println(aristas[i][j]);
                }
            }
        }
        //realizando operaciones
        for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas.length; j++) {
                if (i==0) {
                    sumaFila1 += aristas[i][j];
                }
                if (i == aristas.length-1) {
                    sumaFilaN += aristas[i][j];
                }
                if (j == 0) {
                    sumaColumna1 += aristas[i][j];
                }
                if (j == aristas.length-1) {
                    sumaColumnaN += aristas[i][j];
                }
            }
        }
        System.out.println(sumaFila1);
        System.out.println(sumaFilaN);
        System.out.println(sumaColumna1);
        System.out.println(sumaColumnaN);

    }
}
