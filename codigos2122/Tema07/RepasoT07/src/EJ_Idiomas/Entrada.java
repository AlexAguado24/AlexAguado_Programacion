package EJ_Idiomas;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Idioma> idioma = new ArrayList();


        Idioma castellano = new Idioma("Castellano", 2000) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es: " + getPalabras().get(0));

            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: " + getPalabras().get(1));
            }
        };

        Idioma ingles = new Idioma("Ingles", 3000) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es: " + getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: " + getPalabras().get(1));
            }
        };

        Idioma aleman = new Idioma("Aleman", 1500) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es: " + getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: " + getPalabras().get(1));
            }
        };

        idioma.add(castellano);
        idioma.add(ingles);
        idioma.add(aleman);

        castellano.ingresarPalabra("Hola");
        castellano.ingresarPalabra("Adios");
        castellano.ingresarPalabra("jamon");

        ingles.ingresarPalabra("Hello");
        ingles.ingresarPalabra("Bye");
        ingles.ingresarPalabra("pop corn");

        aleman.ingresarPalabra("Gutten");
        aleman.ingresarPalabra("Bier");
        aleman.ingresarPalabra("Thanke");

        for (Idioma item : idioma) {
            item.listarPlabras();
        }

        Dialecto catalan = new Dialecto (castellano,2000);
        catalan.cuantificarHablantes(20, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                catalan.setNumeroHablantes(catalan.getNumeroHablantes()*n);
            }
        });

    }
}
