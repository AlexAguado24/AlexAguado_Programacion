package controller;

import java.io.*;
import java.util.Scanner;

public class FicherosControllerPractica {

    Scanner in = new Scanner(System.in);

    public void lecturaFichero(File file) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int lectura = 0;
            /*do {
                lectura = fileReader.read();
                System.out.println(lectura);
            } while (lectura != -1 );*/
            while ((lectura = fileReader.read()) != -1) {
                System.out.println((char) lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void lecturaBuffer(File file) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = null;
            String lecturaCompleta = "";
            /*String linea = bufferedReader.readLine();
            System.out.println(linea);*/
            while ((lectura = bufferedReader.readLine()) != null) {
                System.out.println(lectura);
                lecturaCompleta += lectura + " ";
            }
            System.out.println("La lectura completa es: " + lecturaCompleta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escrituraFichero(File file) {
        FileWriter fileWriter = null;
        String lineaEscribir = "Esto es un ejemplo de una linea dentro del fichero";
        try {
            fileWriter = new FileWriter(file);
            /*fileWriter.write("Ejemplo");
            fileWriter.write("\n");
            fileWriter.write("Esto es una nueva linea en el fichero");*/
            fileWriter.write(101);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void cifrarLinea(File file) {

        String lineaEscribir = "Esto es un ejemplo de una linea dentro del fichero";
        String[] letras = lineaEscribir.split("");

        for (String letra : letras) {
            int codigo = (byte) (letra.charAt(0));
            int codigoCifrado = codigo * 2;
            char caracterCifrado = (char) codigoCifrado;
            System.out.println(caracterCifrado);
        }
    }

    public void escribirFicheroCompleto(File file) {

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es un ejemplo");
            printWriter.println("Esto es un ejemplo de linea paralela");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

    public void escribirConsola(File file) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        String linea = "";
        int  opcion = 0;
        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            do {
                System.out.println("Escribe nueva Frase");
                printWriter.println(linea = in.next());
                System.out.println("¿Quieres continuar escribiendo? (0)no/ (1)si");
                opcion = in.nextInt();
            } while (opcion != 0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura=bufferedReader.readLine()) != null){
                System.out.println(lectura);
                lecturaCompleta += lectura + " ";
            }
            System.out.println("La lectura completa es: "+ lecturaCompleta);
        } catch (IOException e) {

        }
    }

}
