import com.sun.source.tree.CompoundAssignmentTree;

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

        /*listaIdiomas.add(castellano);
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
            item.saludar();
            item.despedir();
        }

        for (Idiomas idioma : listaIdiomas) {
            idioma.listarPalabras();
        }*/

        Dialecto catalan = new Dialecto("Catalan",2000, castellano);

        catalan.cuantificar(20, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                System.out.println("El numero de hablantes de "+ catalan.getNombre()+" es el "+n+"%");
            }
        });
    }
}
