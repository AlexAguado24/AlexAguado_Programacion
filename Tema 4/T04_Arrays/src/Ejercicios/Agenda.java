package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object[]> agenda = new ArrayList<>();
        int opcion;

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
                    String nombre = in.next();
                    System.out.println("Introduce su apellido:");
                    String apellido = in.next();
                    System.out.println("Introduce su numero de telefono:");
                    int telefono = in.nextInt();
                    System.out.println("Introduce su DNI:");
                    String dni = in.next();
                    boolean existe = false;
                    for (Object[] persona : agenda) {
                        if (persona[3].toString().equalsIgnoreCase(dni)) {
                            existe = true;
                            System.out.println("La persona que intentas guardar ya existe y sus datos son," +
                                    " Nombre: " + persona[0]
                                    + "\t Apellido: " + persona[1]
                                    + "\t Telefono: " + persona[2]
                                    + "\t DNI: " + persona[3]);
                            break;
                        }
                    }
                    if (!existe) {
                        agenda.add(new Object[]{nombre, apellido, telefono, dni});
                        System.out.println("Persona añadida a la lista");
                    }

                    break;
                case 2:

                    if (agenda.size() > 0) {

                        System.out.println("Introduce el dni de la persona que quieres buscar");
                        dni = in.next();
                        boolean encontrado = false;

                        for (Object[] persona : agenda) {

                            if (persona[3].toString().equalsIgnoreCase(dni)) {
                                encontrado = true;
                                System.out.println("Nombre: " + persona[0]
                                        + "\tApellido: " + persona[1]
                                        + "\tTelefono: " + persona[2]
                                        + "\tDNI: " + persona[3]);
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("La persona no esta en la lista");
                        }
                    } else {
                        System.out.println("Aun no hay personas guardadas");
                    }
                    break;
                case 3:
                    if (agenda.size() > 0) {
                        System.out.println("Introduce el DNI de la persona que quieres borrar");
                        dni = in.next();
                        boolean encontrado = false;
                        for (int i = 0; i < agenda.size(); i++) {
                            if (agenda.get(i)[3].toString().equalsIgnoreCase(dni)) {
                                encontrado = true;
                                System.out.println("Persona borrada de la agenda");
                                agenda.remove(i);
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("La persona no esta en la lista");
                        }
                    } else {
                        System.out.println("Aun no hay personas guardadas");
                    }
                    break;
                case 4:
                    if (agenda.size() > 0) {
                        for (Object[] persona : agenda) {

                            System.out.println("Nombre: " + persona[0]
                                    + "\tApellido: " + persona[1]
                                    + "\tTelefono: " + persona[2]
                                    + "\tDNI: " + persona[3]);

                        }
                        System.out.println("Listado de personas ejecutado.");

                        break;
                    } else {
                        System.out.println("Aun no hay personas en la agenda");
                    }
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