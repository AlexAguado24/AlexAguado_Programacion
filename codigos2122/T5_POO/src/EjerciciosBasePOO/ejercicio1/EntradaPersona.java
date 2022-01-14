package EjerciciosBasePOO.ejercicio1;

import java.util.Scanner;

public class EntradaPersona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Persona persona = new Persona("Borja","Martin","123a",20,170,60);
        persona = new Persona("luis","Perez", "245b",25);

        //Persona persona3 = new Persona("Carlos","Garcia");

        persona.mostrarDatos();

        /*persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);*/



    }
}
