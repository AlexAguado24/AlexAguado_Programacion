package Ejercicio01;

import java.io.*;
import java.util.Scanner;

public class ControllerEj01 {
    Scanner in = new Scanner(System.in);
    BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));
    public void datosUsuario (File file){
        int opcion = 0;
        String nombre = "";
        String apellido = "";
        int telefono = 0;
        String  dni = "";
        int edad = 0;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        do {
            try {
                System.out.println("Introduce los datos del usuario");
                System.out.println("Introduce el nombre");
                nombre = bufferedReader.readLine();
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (printWriter != null){
                    printWriter.close();
                }
            }
        } while (opcion != 3);

    }
}
