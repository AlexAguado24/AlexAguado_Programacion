package EjerciciosObjetosPOO.EjercicioTrigonometria;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion = -1;

        /*Triangulo triangulo = new Triangulo(5, 12);

        Circulo circulo = new Circulo(9);

        Cuadrado cuadrado = new Cuadrado(10, 15);

        triangulo.calcularAreaTriangulo();
        System.out.print("El area del triangulo es: " + triangulo.getArea());
        System.out.println();*/
        do {

            System.out.println("Elija una de las siguientes opciones");
            System.out.println("1. Triangulo");
            System.out.println("2. Circulo");
            System.out.println("3. cuadrado");
            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ha elegido trabajar con triangulos");
                    System.out.println("Introduce base");
                    int base = in.nextInt();
                    System.out.println("Introduce altura");
                    int altura = in.nextInt();

                    Triangulo triangulo2 = new Triangulo(base, altura);

                    do {
                        System.out.printf("Elige una opcion: %n" +
                                "1.Calcular area %n" + "2.Mostrar datos%n");
                        System.out.println("0. Volver");
                        opcion = in.nextInt();

                        switch (opcion) {
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    } while (opcion!=0);

                    System.out.println("pulsa enter para continuar");
                    in.next();
                    break;
                case 2:
                    System.out.println("Pulsa enter para continuar");
                    in.next();
                    break;
                case 3:
                    System.out.println("Pulsa enter para continuar");
                    in.next();
                    break;
            }

        } while (opcion != 0);
    }

}
