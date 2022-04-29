import controller.JSONController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ciclo;
        int curso;

        System.out.printf("Indica curso");
        curso = in.nextInt();
        System.out.printf("Indica ciclo");
        ciclo = in.next();
        JSONController jsonController = new JSONController();
        jsonController.leerJSONAsignaturas();
    }
}
