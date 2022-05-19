import controller.ControllerDB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ControllerDB controllerDB = new ControllerDB();
        //controllerDB.lecturaJSON();
        int total, opcion;
        String pais;

        System.out.println("Selecciona las facturas a buscar ((1 = total)/(2 = pais))");
        opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Introduce el total a buscar");
            total = scanner.nextInt();
            controllerDB.buscarTotal(total);
        } else if (opcion == 2) {
            System.out.println("Introduce el pais a buscar");
            pais = scanner.next();
            controllerDB.buscarPais(pais);
        }
    }
}
