import controller.ControllerBD;
import database.SchemaDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ControllerBD controllerBD = new ControllerBD();
        Scanner in = new Scanner(System.in);

        int edad, opc = 0;
        String nombre, apellido;

        /*System.out.println("Quieres añadir un usuario? (1= si/ 0 = no)");
        opc = in.nextInt();

        while (opc != 0){
            System.out.println("Introduce nombre");
            nombre = in.next();
            System.out.println("Introduce apellido");
            apellido = in.next();
            System.out.println("Introduce edad");
            edad = in.nextInt();
            Usuario usuario = new Usuario(nombre,apellido,edad);
            System.out.println("¿Quieres añadir mas usuarios? ((1/si)-(0/no))");
            opc = in.nextInt();
        }*/
    }
}
