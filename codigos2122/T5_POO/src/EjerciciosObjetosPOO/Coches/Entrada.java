package EjerciciosObjetosPOO.Coches;

public class Entrada {

    public static void main(String[] args) {
        Motor motorGasoil = new Motor(150,1000);
        Motor motorGasolina = new Motor(120,500);

        Coche cocheGasolina = new Coche("Ford","Fiesta", new Motor(120,500));
        Coche cocheGasoil = new Coche("Opel","Corsa", new Motor(150,1000));

        /*System.out.println(cocheGasoil.getPrecioAverias());
        cocheGasoil.acumularAveria(900);
        cocheGasoil.acumularAveria(200);
        System.out.println(cocheGasoil.getPrecioAverias());*/


        Garaje garaje = new Garaje();

        if (garaje.aceptarCoche(cocheGasoil, "aceite")== true){
            System.out.println("Coche Aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosDeAceite());
        } else {
            System.out.println("Garaje ocupado");
        }



        if (garaje.aceptarCoche(cocheGasolina, "aceite")== true){
            System.out.println("Coche Aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosDeAceite());
        } else {
            System.out.println("Garaje ocupado");
        }

    }
}
