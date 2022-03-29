public class Entrada {

    public static void main(String[] args) {

        SupermercadoEspecifico<Alimento> supermercadoAlimentos = new SupermercadoEspecifico();
        supermercadoAlimentos.registrarElemento(new Carne("media","españa",45,100));
        supermercadoAlimentos.registrarElemento(new Carne("alta","españa",50,100));
        supermercadoAlimentos.registrarElemento(new Lacteo("alta","españa",75,200));
        supermercadoAlimentos.registrarElemento(new Lacteo("alta","españa",20,200));


        supermercadoAlimentos.mostrarPreciosFinales();


        Carne filete = new Carne("Galicia", "superior",50,500);
        filete.calcularPrecio();

        Silla silla = new Silla("Madera", "80",40,90);
        silla.calcularPrecio();

        SupermercadoEspecifico<Mueble> supermercadoMuebles = new SupermercadoEspecifico();
        supermercadoMuebles.registrarElemento(new Mesa("madera","35kg",100,20));
        supermercadoMuebles.registrarElemento(new Mesa("madera","35kg",150,20));
        supermercadoMuebles.registrarElemento(new Silla("madera","35kg",89,20));
        supermercadoMuebles.registrarElemento(new Silla("madera","35kg",41,20));

        /*supermercadoMuebles.mostrarPreciosFinales();
        supermercadoAlimentos.listarDatos();
        supermercadoMuebles.listarDatos();*/

        SupermercadoEspecifico<Inventariable> supermercadoGenerico = new SupermercadoEspecifico<>();
        supermercadoGenerico.registrarElemento(filete);
        supermercadoGenerico.registrarElemento(silla);

    }

}
