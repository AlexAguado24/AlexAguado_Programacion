import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Coche coche = new Coche("123A", "123", 100, 2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());*/
        Deportivo deportivo = new Deportivo("234B","234", 200, 2500,600);
        deportivo.calcularVelocidad(120);
        Electrico electrico = new Electrico("345C","345",150,1500,80);
        electrico.calcularVelocidad(100);
        electrico.getVelocidad();
        Suv suv = new Suv("456D","456",180,1800,true);
        suv.calcularVelocidad(80);
        suv.getVelocidad();
    }
}
