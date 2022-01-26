package EjerciciosObjetosPOO.EjercicioTrigonometria;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion = -1;

        Triangulo triangulo = new Triangulo(5, 12);

        Circulo circulo = new Circulo(9);

        Cuadrado cuadrado = new Cuadrado(10, 15);

        System.out.print("El perimetro del cuadrado es: " + cuadrado.perimetroCuadrado(4, 9));
        System.out.println();
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

                    int option;
                    System.out.printf("Elige una opcion: %n"+
                            "1.Calcular area %n" + "2.Mostrar datos%n");
                    option = in.nextInt();

                    if (option == 1) {
                        double area = base*altura;
                        System.out.printf("El area del triangulo es %.2f%n",area);
                    } else {
                        System.out.println(triangulo2);
                    }

                    break;
            }

        } while (opcion != 0);
    }

}
