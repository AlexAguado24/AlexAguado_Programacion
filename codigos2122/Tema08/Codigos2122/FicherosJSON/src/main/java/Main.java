import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JSONController controller = new JSONController();
        Scanner in = new Scanner(System.in);
        //controller.leerJSONAsignaturas();

        /*System.out.println("Indica ciclo");
        String ciclo = in.next();
        System.out.println("Indica curso");
        int curso = in.nextInt();*/

        controller.lecturaUsers();
    }
}
