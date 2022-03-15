import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Idiomas> listaIdiomas = new ArrayList<>();

        Idiomas castellano = new Idiomas("Castellano", 100) {
            @Override
            public void saludar() {
                System.out.println("El saludo en "+getNombre()+ " es "+ getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en "+getNombre()+ " es "+ getPalabras().get(1));
            }
        };

        Idiomas ingles = new Idiomas("Ingles", 150) {
            @Override
            public void saludar() {
                System.out.println("El saludo en "+getNombre()+ " es "+ getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en "+getNombre()+ " es "+ getPalabras().get(1));
            }
        };

        Idiomas aleman = new Idiomas("Aleman", 200) {
            @Override
            public void saludar() {
                System.out.println("El saludo en "+getNombre()+ " es "+ getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en "+getNombre()+ " es "+ getPalabras().get(1));
            }
        };

        listaIdiomas.add(castellano);
        listaIdiomas.add(ingles);
        listaIdiomas.add(aleman);

        castellano.ingresarPalabra("hola");
        castellano.ingresarPalabra("adios");
        castellano.ingresarPalabra("foca");

        ingles.ingresarPalabra("hi");
        ingles.ingresarPalabra("bye");
        ingles.ingresarPalabra("because");

        aleman.ingresarPalabra("hallo");
        aleman.ingresarPalabra("tschulss");
        aleman.ingresarPalabra("gehen");

        for (Idiomas item : listaIdiomas) {
            System.out.println("El saludo en " + item.getNombre() + " es ");
            item.saludar();
            item.despedir();
        }

        for (Idiomas idioma : listaIdiomas) {
            idioma.listarPalabras();
        }

    }

}
