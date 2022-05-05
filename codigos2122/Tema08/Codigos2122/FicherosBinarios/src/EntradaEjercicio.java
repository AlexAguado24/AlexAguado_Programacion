import controller.BinariosController;
import model.Usuario;

import java.util.Scanner;

public class EntradaEjercicio {

    public static void main(String[] args) {
        BinariosController controller = new BinariosController();
        Scanner in = new Scanner(System.in);
        String nombre, apellido, pass;
        int opcionUsuario = 0, opcionLectura = 0;

        controller.existeFichero();

        do{
            System.out.println("Introduce nombre");
            nombre = in.next();
            System.out.println("Introduce Apellido");
            apellido = in.next();
            System.out.println("Introduce password");
            pass = in.next();
            Usuario usuario = new Usuario(nombre, apellido, pass);
            System.out.println("Quierers meter mas usuarios");
            opcionUsuario = in.nextInt();
        } while (opcionUsuario !=0);

        controller.escribirBinario();

        System.out.println("Quieres leer el fichero");
        opcionLectura = in.nextInt();

        if (opcionLectura == 1){
            controller.lecturaBinario(true);
        }


    }
}
