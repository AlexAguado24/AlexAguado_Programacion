import controller.UsuariosController;
import model.Usuario;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        UsuariosController usuariosController = new UsuariosController();

        String nombre, apellido, pass;
        int opcionUsuario = 0, opcionLectura = 0;

        do {
            System.out.println("Nombre:");
            nombre = in.next();
            System.out.println("Apellido:");
            apellido = in.next();
            System.out.println("Password:");
            pass = in.next();
            Usuario usuario = new Usuario(nombre,apellido,pass);
            usuariosController.addUsuario(usuario);
            System.out.println("¿Quierers introducir otro usuario (0- no/ 1- si)?");
            opcionUsuario = in.nextInt();
        } while (opcionUsuario != 0);

        usuariosController.escribirUsuario();

        System.out.println("Quieres leer los ficheros");
        opcionLectura = in.nextInt();

        if (opcionLectura == 1){
            usuariosController.lecturaUsuario();
        }


    }
}
