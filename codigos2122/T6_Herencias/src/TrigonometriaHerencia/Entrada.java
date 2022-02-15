package TrigonometriaHerencia;

public class Entrada {

    public static void main(String[] args) {

        Figura triangulo = new Triangulo(12.5,18.6);
        triangulo.calcularArea();
        System.out.printf("%.2f%n",triangulo.area);

        Circulo circulo = new Circulo(16.2);
        circulo.calcularArea();
        System.out.printf("%.2f%n",circulo.area);
        circulo.calcularDiametro();

        Rectangulo rectangulo = new Rectangulo(7.2,5.99);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        System.out.printf("Area %.2f%n Perimetro %.2f ",rectangulo.area, rectangulo.getPerimetro());
    }

}
