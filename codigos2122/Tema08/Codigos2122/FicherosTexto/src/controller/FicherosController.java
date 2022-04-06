package controller;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicherosController {
    Scanner in = new Scanner(System.in);

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
        File file = new File("C:\\Users\\Usuario\\Desktop\\Ficheros");
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
        } else if (opcion == 4) {
            System.out.println(file.getParent());

        } else {
            System.out.println("Opcion incorrecta");
        }
    }

    public void listarChild(File child) {
        int contador = 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        for (File childitem : ficherosChild) {
            System.out.println(contador + " - " + childitem);
            contador++;
        }
        System.out.println("Que opcion quieres elegir");
        opcion = in.nextInt();
        if (opcion >= 0 && opcion < ficherosChild.length) {
            if (ficherosChild[opcion].isDirectory()) {
                listarChild(ficherosChild[opcion]);
            } else {
                System.out.println("Error, es un fichero");
            }
        } else if (opcion == 4)  {
            System.out.println(child.getParent());
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}
