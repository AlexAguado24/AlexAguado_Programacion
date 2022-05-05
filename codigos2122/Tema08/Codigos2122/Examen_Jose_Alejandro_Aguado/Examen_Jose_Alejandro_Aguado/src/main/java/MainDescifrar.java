import controller1.ControladorDescifrar;

import java.io.File;

public class MainDescifrar {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Archivos_examen\\fichero_cifrado.txt");

        ControladorDescifrar controladorDescifrar = new ControladorDescifrar();

        controladorDescifrar.descifrarCodigo(file);
    }
}
