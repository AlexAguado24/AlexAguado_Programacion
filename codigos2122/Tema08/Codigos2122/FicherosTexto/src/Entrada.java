import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        File file = null;
        File directory = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");

        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? "+file.isDirectory());
        System.out.println("Es fichero? "+file.isFile());
        System.out.println("Existe "+file.exists());
        System.out.println("Padre "+file.getParent());
        System.out.println("nombre "+file.getName());
        System.out.println("Ruta Absoluta "+file.getAbsolutePath());
        System.out.println("Ruta Relativa "+file.getPath());

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
