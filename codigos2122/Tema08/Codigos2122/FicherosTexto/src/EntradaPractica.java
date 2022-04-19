import controller.FicherosControllerPractica;

import java.io.File;
import java.io.FileWriter;

public class EntradaPractica {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        File file3 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero3.txt");
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero.txt");
        File file2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\ficheroEscritura.txt");
        File file4 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero4.txt");

        FicherosControllerPractica ficherosControllerPractica = new FicherosControllerPractica();
        //ficherosControllerPractica.lecturaFichero(file);
        //ficherosControllerPractica.lecturaBuffer(file);
        //ficherosControllerPractica.escrituraFichero(file2);
        //ficherosControllerPractica.cifrarLinea(file2);
        //ficherosControllerPractica.escribirFicheroCompleto(file3);
        ficherosControllerPractica.escribirConsola(file4);


    }
}
