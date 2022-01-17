package EjerciciosBasePOO.ejercicio2;

import EjerciciosBasePOO.ejercicio1.Persona;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce Nombre");
        String nombre = in.next();
        System.out.println("Introduce Apellido");
        String apellido = in.next();
        System.out.println("Introduce DNI");
        String dni = in.next();
        System.out.println("Introduce Edad");
        int edad = in.nextInt();
        System.out.println("Introduce Altura");
        int altura = in.nextInt();
        System.out.println("Introduce Peso");
        double peso = in.nextDouble();

        Persona persona = new Persona(nombre,apellido,dni,edad,altura,peso);
        Persona personaMano = new Persona("Alex","Aguado");
        Persona personaSola = new Persona();

        System.out.println("Persona");
        persona.mostrarDatos();
        System.out.println("PersonaMano");
        personaMano.mostrarDatos();
        System.out.println("personaSola");
        personaSola.mostrarDatos();




    }
}
