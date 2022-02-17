package TrigonometriaHerencia;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Figura> listaFiguras = new ArrayList<>();

        Figura triangulo = new Triangulo(12, 18);
        /*triangulo.calcularArea();
        System.out.printf("%.2f%n", triangulo.area);*/

        Circulo circulo = new Circulo(16.2);
        /*circulo.calcularArea();
        System.out.printf("%.2f%n", circulo.area);
        circulo.calcularDiametro();*/

        Rectangulo rectangulo = new Rectangulo(7, 5);
        /*rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        System.out.printf("Area %.2f%n Perimetro %.2f ", rectangulo.area, rectangulo.getPerimetro());*/

        listaFiguras.add(triangulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(circulo);

        for (Figura item : listaFiguras) {
            System.out.println("Imprimiendo de la clase "+item.getClass().getSimpleName());
            System.out.println(item.calcularArea());
            if (item instanceof Circulo) {
                System.out.println(((Circulo)item).calcularDiametro());
            } else if (item instanceof Rectangulo) {
                System.out.println(((Rectangulo)item).calcularPerimetro());
            }
        }
    }

}
