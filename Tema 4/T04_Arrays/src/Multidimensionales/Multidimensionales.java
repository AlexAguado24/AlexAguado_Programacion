package Multidimensionales;

public class Multidimensionales {
    public static void main(String[] args) {
        int [][] arrayMulti = new int[3][3];
        arrayMulti[0][0]=7;
        arrayMulti[2][1]=8;
        arrayMulti[1][2]=6;

        int[][] arrayMultiDiferente  = {{1,2,3,4},{1,2,3},{1,2}};

        for (int i = 0; i < arrayMultiDiferente.length; i++) {
            for (int j = 0; j < arrayMultiDiferente.length; j++) {

            }
        }

        //Rellenar arrays con mismas filas y columnas
        /*for (int i = 0; i < arrayMulti.length; i++) {
            //System.out.println(arrayMulti[i]);
            //estando en la fila
            for (int j = 0; j < arrayMulti.length; j++) {
                System.out.print(arrayMulti[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti.length; j++) {
                System.out.print(arrayMulti[i][j]);
            }
            System.out.printf("%n");
        }*/

    }
}
