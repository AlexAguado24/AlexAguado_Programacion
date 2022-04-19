import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Usuario\\Desktop\\Usuarios\\usuario.txt");
        FicheroLectura acceso = new FicheroLectura();


        acceso.lee(file);
    }
}

