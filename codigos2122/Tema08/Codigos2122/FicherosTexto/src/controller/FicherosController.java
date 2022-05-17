package controller;

import java.io.*;
import java.util.Scanner;

public class FicherosController {
    Scanner in = new Scanner(System.in);

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    /*public void getFileInfo(File file) {
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero? " + file.isFile());
        System.out.println("Existe " + file.exists());
        System.out.println("Padre " + file.getParent());
        System.out.println("nombre " + file.getName());
        System.out.println("Ruta Absoluta " + file.getAbsolutePath());
        System.out.println("Ruta Relativa " + file.getPath());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
    /*public void getDirectoryInfo(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()) {
            String[] nombreficheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero : ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(nombreficheros);
            for (String nombre : nombreficheros) {
                System.out.println(nombre);
            }
        }
    }*/
    public void listarDirectorios() {
        /*int opcion = -1;
        System.out.println("Que opcion quieres ejecutar?");
        opcion = in.nextInt();
        File[] ficheros = file.listFiles();
        if (file.isDirectory()) {
                for (File fichero : ficheros) {
                    if (fichero.isFile()) {
                        System.out.println("No se puede listar, es un fichero");
                    } else {
                        System.out.println(fichero.getName());
                    }
                }
        }*/
        int opcion = 0;
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");
        File[] ficherosParent = file.listFiles();

        System.out.println("Imprimiendo " + file.getName());
        int contador = 0;
        for (File item : ficherosParent) {
            System.out.println(contador + " - " + item.getName());
            contador++;
        }
        System.out.println("Que directorio quieres listar");
        opcion = in.nextInt();
        /*if (opcion >= 0 && opcion < ficherosParent.length) {
            if (ficherosParent[opcion].isDirectory()) {
                File[] ficherosChild = ficherosParent[opcion].listFiles();
                int contadorChild = 0;
                for (File child : ficherosChild) {
                    System.out.println(contadorChild + " - " + child.getName());
                    contadorChild ++;
                }
            } else {
                System.out.println("He seleccionado un fichero");
            }
        } else {
            System.out.println("Opcion incorrecta");
        }*/
        if (opcion >= 0 && opcion < ficherosParent.length) {
            listarChild(ficherosParent[opcion]);
        } else {
            System.out.println("Opcion incorrecta");
        }
    }

    public void listarChild(File child) {
        int contador = 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        System.out.println("Listando el directorio - "+child.getName());
        for (File childitem : ficherosChild) {
            System.out.println(contador + " - " + childitem);
            contador++;
        }
        System.out.println(contador + " - Volver al padre");
        System.out.println("Que opcion quieres elegir");
        opcion = in.nextInt();

        if (opcion >= 0 && opcion <= ficherosChild.length) {
            if (opcion == contador) {
                listarChild(child.getParentFile());
            } else{
                if (ficherosChild[opcion].isDirectory()) {
                    listarChild(ficherosChild[opcion]);
                } else {
                    System.out.println("Error, es un fichero");
                }
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }

    public void escrituraFichero (File file){

        FileWriter fileWriter = null;

        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dentro del fichero";

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(101);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirFicheroCompleto(File file){

        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println("Esto es una linea");
            printWriter.println("Esto es una linea nueva");
            printWriter.println("Esto es un ejemplo de 3 lineas");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }


    }

    public void escribirEnFichero (File file) {

        int opcion;
        String lineaEscribir = "";

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;



        do{

            try {
                System.out.println("Introduce linea");
                lineaEscribir = bufferedReader.readLine();
                //System.out.println(lineaEscribir);
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(lineaEscribir);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (printWriter != null) {
                    printWriter.close();
                }
            }

            System.out.println("quieres escribir otra linea? (1= si / 0 = no)");
            opcion = in.nextInt();
        }while (opcion != 0);

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = "";
            String lecturaCompleta;
            StringBuffer lineaCompleta = new StringBuffer();
            while ((lectura = bufferedReader.readLine())!=null){
                lineaCompleta.append(lectura+"\n");
            }
            //guardar el buffer en lecturaCompleta es opcional por si se quiere tratar
            lecturaCompleta = lineaCompleta.toString();
            System.out.println(lecturaCompleta);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
