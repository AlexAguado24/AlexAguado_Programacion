package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        //se crean con tipo-nombre=valor
        //lista de cualquier tipo > OBJET
        ArrayList listaCosas = new ArrayList();//ArrayList = metodo contructor
        //para saber su tamaño
        int tamanio = listaCosas.size();//tamanio --> 0

        //añado un elemento a la lista
        listaCosas.add(5);
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Alex");
        tamanio = listaCosas.size();
        System.out.println(tamanio);

        int numero = (int) listaCosas.get(0);
        //para castear un String se usa el metodo .valueOf()
        String palabra = String.valueOf(listaCosas.get(1));

        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("hello");
        listaCosas.add("taco");
        listaCosas.add(6);
        listaCosas.add(100);



        //sacar de golpe todos los elementos
        //utilizando for
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println( i+1 + "-" + listaCosas.get(i));
        }
        //utilizando foreach
        int posiciones = 1;
        for (Object item :listaCosas) {
            System.out.println(posiciones+ " - "+item);
            posiciones++;
        }

        //buscar dentro de una lista la palabra hello
        //cuando la encuentre sacar la palabra encontrada y la posicion de la misma

        /*posiciones = 0;
        for (Object n :listaCosas) {
            if (n.equals("hello")) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posicion "+ posiciones +" esta "+n);
            }
            posiciones++;
        }*/

        //buscando palabra con un indexOf
        int posicionElemento = listaCosas.indexOf("hello");
        if (posicionElemento>-1) {
            System.out.println("Palabra encontrada");
            System.out.println("En la posicion "+posicionElemento);
        }

        //Pedir por consola una palabra a buscar
        //en el caso de que la palabra se encuentree en la lista
            //se modifique por otro pedido por consola
        //en caso de que no exista
            //se añade al final
        Scanner in = new Scanner(System.in);

        System.out.println("Indica la palabra que quieres modificar");
        Object palabraBuscada = in.next();
        int posicionPalabra = listaCosas.indexOf(palabraBuscada);
        if (posicionPalabra>-1) {
            System.out.println("Palabra encontrada, indica su nuevo valor");
            listaCosas.set(posicionPalabra,in.next());
        } else {
            System.out.println("La palabra no existe, se añadira al final");
            listaCosas.add(palabraBuscada);
        }
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println( i+1 + "-" + listaCosas.get(i));
        }
    }
}
