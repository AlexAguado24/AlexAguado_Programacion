package EjerciciosObjetosPOO.Agenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = -1, telefono;
        String nombre, dni;

        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Borrar persona");
            System.out.println("3. Editar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Listar personas");
            System.out.println("Elige una de las opciones");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Añadiendo persona:");
                    System.out.println("Introduce un DNI");
                    dni = in.next();
                    System.out.println("Introduce un nombre");
                    nombre = in.next();
                    System.out.println("Introduce un Nº de telefono");
                    telefono = in.nextInt();
                    Persona persona1 = new Persona( dni, nombre, telefono);
                    agenda.agregarPersona(persona1);
                    break;
                case 2:
                    System.out.println("Indica el DNI de la persona");
                    dni = in.next();
                    if (agenda.borrarPersona(dni)){
                        System.out.println("Persona borrada correctamente");
                    }else {
                        System.out.println("Persona no encontrada");
                    }
                    break;
                case 3:
                    System.out.println("Indica el DNI de la persona");
                    dni = in.next();
                    System.out.println("Introduce el nombre nuevo");
                    nombre = in.next();
                    System.out.println("Introduce el telefono nuevo");
                    telefono = in.nextInt();
                    agenda.editarPersona(dni);
                    break;
                case 4:
                    System.out.println("Introduce el DNI de la persona");
                    dni = in.next();
                    agenda.buscarPersona(dni);
                    break;
                case 5:
                    agenda.listarAgenda();
                    break;
            }

        }while (opcion != 0);

    }
}
