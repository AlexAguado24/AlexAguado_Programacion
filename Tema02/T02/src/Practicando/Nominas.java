package Practicando;

import java.util.Scanner;

public class Nominas {
    public static void main(String[] args) {
        double sueldoBruto, numPagas;
        Scanner in = new Scanner(System.in);

        System.out.println("Indica el sueldo bruto");
        sueldoBruto = in.nextDouble();
        System.out.println("Indica el numero de pagas");
        numPagas = in.nextDouble();

        //salario anual

        double rentencion = sueldoBruto / 0.15;
        System.out.println("su salario bruto anual es " +sueldoBruto);
        System.out.println("su salario neto anual es "+ (sueldoBruto - rentencion));
        //salario mensual
        System.out.printf("Su salario bruto mensual es %.2f%n", (sueldoBruto / numPagas));
        double retencionesMensuales = (sueldoBruto/numPagas)/ 0.15;
        System.out.println("Su salario neto mensual es "+ ((sueldoBruto/numPagas)-retencionesMensuales));
    }
}
//Nomina.java
//Realiza la impresión por pantalla de la nómina de un trabajador.
// Para ello deberás pedir por pantalla el sueldo bruto de un trabajador y el número de pagas (ambos deberán ser guardados en variables).
// Mostrar por pantalla: - su salario bruto anual - su salario neto anual (con una retención del 15%) - su salario bruto mensual - su salario neto mensual