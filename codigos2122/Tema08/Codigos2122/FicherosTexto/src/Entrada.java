import controller.FicherosController;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        /*
        File directory = null;
        File directory2 = null;
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");
        //directory2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros_nuevo");*/
        //ficherosController.getFileInfo(file);
        //ficherosController.getDirectoryInfo(directory2);
        //ficherosController.listarDirectorios();
        File file = new File("C:\\Users\\Usuario\\Desktop\\Ficheros\\ficheroEscribirLineas.txt");

        FicherosController ficherosController = new FicherosController();
        ficherosController.escribirEnFichero(file);




    }
}
