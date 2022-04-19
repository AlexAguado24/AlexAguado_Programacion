import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FicheroLectura {

    public void lee(File file) {

        FileReader fichero = null;
        try {
            fichero = new FileReader(file);

            int c = 0;

            while ((c= fichero.read()) != -1) {
                c = fichero.read();

                char letra = (char) c;

                System.out.print(letra);
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }
    }
}

