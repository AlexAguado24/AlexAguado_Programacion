package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object[]> agenda = new ArrayList<>();
        int opcion, telefono;
        String nombre, apellido, dni;
        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar persona");
            System.out.println("Por favor, elige una opcion:");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agregando una persona");
                    System.out.println("Introduce su nombre:");
                    nombre = in.next();
                    System.out.println("Introduce su apellido:");
                    apellido = in.next();
                    System.out.println("Introduce su numero de telefono");
                    telefono = in.nextInt();
                    System.out.println("Introduce su DNI");
                    dni = in.next();
                    agenda.add(new Object[]{nombre,apellido,telefono,dni});
                    break;
                case 2:
                    if (agenda.size() > 0) {

                    } else {
                        System.out.println("Aun no hay personas guardadas");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (opcion != 0);
        in.close();
    }
}
//(Agenda) Realizar una aplicación que gestione usuarios mediante arrays, donde los cuales constan de nombre (string), apellido (string), teléfono (int) y dni (string):
// La funcionalidad de la aplicación se guiará por un menú con las siguientes opciones:
//Agregar persona: Pedirá los daos de nombre, apellido, teléfono y dni. Una vez pedidos agregará la persona en la lista.
//Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
//Borrar persona: Pedirá un dni y la eliminará de la lista
//Listar personas: Listará todo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
//En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción