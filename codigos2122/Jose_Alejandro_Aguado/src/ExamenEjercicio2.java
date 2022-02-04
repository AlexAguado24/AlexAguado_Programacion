import java.util.Scanner;

public class ExamenEjercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double valorRefresco = 1.20,
                valorCafe = 1.0,
                valorBocadillo = 3.20,
                valorMenu = 9.50;
        int opcion;
        int numRefrescos = 0,
                numCafes = 0,
                numBocadillos = 0,
                numMenus = 0,
                comensales = 0;
        int refrescos,
                cafes,
                bocadillos,
                menus;
        do {
            System.out.println("1.Pedir cafe");
            System.out.println("2.Pedir refresco");
            System.out.println("3.Pedir bocadillo");
            System.out.println("4.Pedir menu");
            System.out.println("5.Pedir la cuenta");
            System.out.println("Introduce una opcion");
            opcion = in.nextInt();

            if (opcion < 0) {
                System.out.println("Opcion incorrecta");
            }
            switch (opcion) {
                case 1:
                    System.out.println("Introduces el numero de cafes");
                    cafes = in.nextInt();
                    if (cafes < 0) {
                        System.out.println("Numero de cafes incorrecto");
                    }
                    numCafes += cafes;
                    break;
                case 2:
                    System.out.println("Introduce el numero de refrescos");
                    refrescos = in.nextInt();
                    if (refrescos < 0) {
                        System.out.println("Numero de refrescos incorrecto");
                    }
                    numRefrescos += refrescos;
                    break;
                case 3:
                    System.out.println("Introduce el numero de bocadillos");
                    bocadillos = in.nextInt();
                    if (bocadillos < 0) {
                        System.out.println("Numero de bocadillos incorrecto");
                    }
                    numBocadillos += bocadillos;
                    break;
                case 4:
                    System.out.println("Introduce el numero de menus");
                    menus = in.nextInt();
                    if (menus < 0) {
                        System.out.println("Numero de menus incorrecto");
                    }
                    numMenus += menus;
                    break;
                case 5:
                    System.out.println("Introduce el numero de comensales");
                    comensales = in.nextInt();
                    if (comensales < 0) {
                        System.out.println("Numero de comensales incorrecto, introducelos de nuevo");
                    }
                    break;
            }
        } while (opcion != 5);
        System.out.println("Bocadillo " + numBocadillos);
        System.out.println("Refrescos " + numRefrescos);
        System.out.println("Menus " + numMenus);
        System.out.println("Cafes " + numCafes);
        double precioTotal = (valorRefresco * numRefrescos) + (valorCafe * numCafes) +
                (valorBocadillo * numBocadillos) + (valorMenu * numMenus);
        System.out.println("Precio total " + precioTotal);
        double xPersona = precioTotal / comensales;
        System.out.printf("Precio por persona %.2f%n", xPersona);
    }
}
