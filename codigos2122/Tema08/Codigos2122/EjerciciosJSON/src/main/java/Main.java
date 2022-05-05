import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONController controller = new JSONController();
        int usuarios;
        String genero;


        System.out.println("Cuantos usuarios quieres obtener?");
        usuarios = in.nextInt();
        System.out.println("Indica el genero: (male/female/ambos)");
        genero = in.next();
        controller.leerFicheros();
        controller.lecturaJSONAPI(usuarios,genero);
        controller.escribirUsuarios();

    }
}
