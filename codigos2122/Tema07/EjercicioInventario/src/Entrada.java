public class Entrada {

    public static void main(String[] args) {

        SupermercadoEspecifico<Alimento> supermercadoAlimentos = new SupermercadoEspecifico<Alimento>();
        supermercadoAlimentos.registrarElemento(new Carne("media","españa",50,100));


        supermercadoAlimentos.mostrarPreciosFinales();

        SupermercadoEspecifico<Mueble> supermercadoMuebles = new SupermercadoEspecifico<Mueble>();
        supermercadoMuebles.registrarElemento(new Mesa("madera","35kg",100,20));


    }

}
