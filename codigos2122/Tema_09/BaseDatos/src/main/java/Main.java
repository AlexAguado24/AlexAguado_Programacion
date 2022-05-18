import controller.ControllerBD;
import model.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, continuar = "";
        int edad;
        ControllerBD controllerBD = new ControllerBD();
        //controllerBD.insertarAlumnosStatement();
        /*do {
            System.out.println("introduce Nombre: ");
            nombre = scanner.next();
            System.out.println("introduce Apellido: ");
            apellido = scanner.next();
            System.out.println("introduce Edad: ");
            edad = scanner.nextInt();

            Alumno alumno = new Alumno(nombre, apellido, edad);
            controllerBD.insertarAlumnoStatement(alumno);

            System.out.println("Quieres continuar (s/n)");
            continuar = scanner.next();
        }while (continuar.equalsIgnoreCase("s"));*/
        //controllerBD.insertarAlumnoPrepare();
        /*System.out.println("Indica el nombre del alumno");
        nombre = scanner.next();
        System.out.println("Indica la nueva edad");
        edad = scanner.nextInt();
        controllerBD.modificartEdad(nombre,edad);*/
        //controllerBD.borrarAlumno();

        controllerBD.getResultados();




    }
}
