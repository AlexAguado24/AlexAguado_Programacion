package EjerciciosBasePOO;

import java.util.Scanner;

public class EntradaPersona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, apellido, dni;
        int edad, altura;
        double peso;

        System.out.println("Introduce un nombre");
        nombre = in.next();
        System.out.println("Introduce un apellido");
        apellido = in.next();
        System.out.println("Introduce un dni");
        dni = in.next();
        System.out.println("introduce una edad");
        edad = in.nextInt();
        System.out.println("introduce una altura");
        altura = in.nextInt();
        System.out.println("introduce una peso");
        peso = in.nextDouble();

        Persona persona1 = new Persona();

        Persona persona2 = new Persona("luis","Perez", dni);

        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);



    }
}
