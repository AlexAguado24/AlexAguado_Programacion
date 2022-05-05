import ControllerJSON.JSONController;

import java.util.Scanner;

public class MainJSON {

    public static void main(String[] args) {
        JSONController controller = new JSONController();
        Scanner in = new Scanner(System.in);
        int opcionUsuario;

        System.out.println("1. Ver peliculas en cartelera");
        System.out.println("2. Ver peliculas proximamente");
        System.out.println("Elige la opcion que quieres");
        opcionUsuario = in.nextInt();

        controller.mostrarOpcion(opcionUsuario);

        if (opcionUsuario == 1){
            controller.escribirFicheroCartelera();
        } else if (opcionUsuario == 2) {
            controller.escribirFicheroProximamente();
        }

    }
}
