import controller.FicherosControllerPractica;

import java.io.File;

public class EntradaPractica {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero.txt");
        File file2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\ficheroEscritura.txt");

        FicherosControllerPractica ficherosControllerPractica = new FicherosControllerPractica();
        //ficherosControllerPractica.lecturaFichero(file);
        //ficherosControllerPractica.lecturaBuffer(file);
        //ficherosControllerPractica.escrituraFichero(file2);
        ficherosControllerPractica.cifrarLinea(file2);
    }
}
