public class Entrada {

    public static void main(String[] args) {

        Coche coche1 = new Coche(1000,200,"Seat","Ibiza");

        coche1.mostrarDatosCoche();

        Coche.Motor motor = coche1.new Motor(150,300);

        coche1.mostrarDatosCoche();
        System.out.println(coche1.getPrecio());

    }
}
