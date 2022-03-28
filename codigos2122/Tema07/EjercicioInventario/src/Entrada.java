public class Entrada {

    public static void main(String[] args) {

        SupermercadoEspecifico<Alimento> supermercadoAlimentos = new SupermercadoEspecifico();
        supermercadoAlimentos.registrarElemento(new Carne("media","españa",45,100));
        supermercadoAlimentos.registrarElemento(new Carne("alta","españa",50,100));
        supermercadoAlimentos.registrarElemento(new Lacteo("alta","españa",75,200));
        supermercadoAlimentos.registrarElemento(new Lacteo("alta","españa",20,200));


        supermercadoAlimentos.mostrarPreciosFinales();

        /*SupermercadoEspecifico<Mueble> supermercadoMuebles = new SupermercadoEspecifico();
        supermercadoMuebles.registrarElemento(new Mesa("madera","35kg",100,20));
        supermercadoMuebles.registrarElemento(new Mesa("madera","35kg",150,20));
        supermercadoMuebles.registrarElemento(new Silla("madera","35kg",89,20));
        supermercadoMuebles.registrarElemento(new Silla("madera","35kg",41,20));

        supermercadoMuebles.mostrarPreciosFinales();*/
    }

}
