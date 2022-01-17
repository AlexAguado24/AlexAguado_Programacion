package EjerciciosBasePOO.Ejercicio4;

import EjerciciosBasePOO.ejercicio1.Persona;

public class Entrada {
    public static void main(String[] args) {
        Persona persona = new Persona("Borja","Martin");
        Persona persona1 = new Persona("Otra","Persona");

        persona.setEdad(20);
        persona.setPeso(70);
        persona.setAltura(180);
        System.out.println(persona.calcularIMC());



        persona1.setEdad(40);
        persona1.setPeso(60);
        persona1.setAltura(160);
        System.out.println(persona1.calcularIMC());
    }
}
