package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaPractica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object[]> agenda = new ArrayList<>();
        int opcion = -1;

        do {
            System.out.println("1. Agregar Persona");
            System.out.println("2. Buscar Persona");
            System.out.println("3. Borrar Persona");
            System.out.println("4. Listar Persona");
            System.out.println("Elige una de las opciones");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    if (agenda.size()<10) {
                        System.out.println("Agregando Persona");
                        System.out.println("Introduce el nombre");
                        String nombre = in.next();
                        System.out.println("Introduce apellido");
                        String apellido = in.next();
                        System.out.println("Introduce telefono");
                        int telefono = in.nextInt();
                        System.out.println("Introduce DNI");
                        String dni = in.next();
                        agenda.add(new Object[]{nombre, apellido, telefono, dni});
                        System.out.println("Persona añadida con exito");
                    } else {
                        System.out.println("La agenda esta llena.");
                    }
                    break;
                case 2:
                    if (agenda.size()>0) {
                        System.out.println("Buscando persona");
                        System.out.println("Introduce el dni de la persona que quieres buscar");
                        String personaBuscada = in.next();
                        boolean existe = false;
                        for (Object[] persona :agenda) {
                            if (persona[3].toString().equalsIgnoreCase(personaBuscada)) {
                                existe = true;
                                System.out.print("Nombre: "+persona[0]+
                                        "\t Apellido: "+ persona[1]+
                                        "\t Telefono: "+ persona[2]+
                                        "\t DNI: "+ persona[3]);
                            }
                            System.out.println();
                            if (!existe) {
                                System.out.println("La persona que buscas no existe");
                            }
                        }
                    } else {
                        System.out.println("La agenda esta vacia, introduce alguna persona antes");
                    }
                    break;
            }
        } while (opcion!=0);

    }
}
//(Agenda) Realizar una aplicación que gestione usuarios mediante arrays, donde los cuales constan de nombre (string), apellido (string), teléfono (int) y dni (string):
// La funcionalidad de la aplicación se guiará por un menú con las siguientes opciones:
//Agregar persona: Pedirá los datos de nombre, apellido, teléfono y dni. Una vez pedidos agregará la persona en la lista.
//Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
//Borrar persona: Pedirá un dni y la eliminará de la lista
//Listar personas: Listará todo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
//En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción