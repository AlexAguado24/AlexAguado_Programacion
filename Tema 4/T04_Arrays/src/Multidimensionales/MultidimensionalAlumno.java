package Multidimensionales;

public class MultidimensionalAlumno {
    public static void main(String[] args) {
        Object[][] alumnos = new Object[3][5];
        int notaMedia, suspensas, notaTotal;
        alumnos[0][0] = "Borja";
        alumnos[0][1] = 6;
        alumnos[0][2] = 5;
        alumnos[0][3] = 7;
        alumnos[0][4] = false;

        alumnos[1][0] = "Pedro";
        alumnos[1][1] = 4;
        alumnos[1][2] = 7;
        alumnos[1][3] = 9;
        alumnos[1][4] = true;

        alumnos[2][0] = "Jose";
        alumnos[2][1] = 7;
        alumnos[2][2] = 1;
        alumnos[2][3] = 2;
        alumnos[2][4] = true;



        for (int i = 0; i < alumnos.length; i++) {

            double media = 0.0;
            int susoensas = 0;
            double sumatorio = 0.0;


            for (int j = 1; j < alumnos[i].length-1; j++) {
                media +=(double) alumnos[i][j]/(double) 3;
                if ((int) alumnos[i][j]<5) {
                    susoensas++;
                }
            }
            boolean conv = (boolean) (alumnos[i][alumnos[i].length-1]);
            String nombre = (String) alumnos[i][0];
            if (conv == true) {
                System.out.printf("%s tiene una media de %.2f, %d y tiene asignaturas convalidadas", nombre, media);
            } else {
                System.out.printf("%s tiene una media de %.2f y no tiene asignaturas convalidadas", nombre, media);
            }
        }

        String nombre =(String) alumnos[0][0];
        double media =((double)(int) alumnos[0][1] + (int )alumnos[0][2] + (int) alumnos[0][3] / 3);
        boolean conv =(boolean) alumnos[0][alumnos[0].length-1];


    }
}

