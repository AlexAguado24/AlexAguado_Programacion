import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        LeerFichero acceso = new LeerFichero();

        acceso.lee();
    }
}
class LeerFichero {
    public void lee () {
        try {
            FileReader fichero = new FileReader("C:\\Users\\Usuario\\Desktop\\Usuarios\\usuario.txt");

            int c = fichero.read();

            while (c != -1) {
                c = fichero.read();

                char letra = (char) c;

                System.out.print(letra);
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }
    }
}
