import java.util.ArrayList;
import java.util.Collection;

public class Entrada {

    public static void main(String[] args) {

        Coleccion<Disco,Double,Boolean> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());

        Coleccion<Camiseta,Character,String> coleccionCamisetas = new Coleccion();
        coleccionCamisetas.agregarCosas(new Camiseta());
        
    }

}
