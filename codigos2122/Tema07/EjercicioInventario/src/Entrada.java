public class Entrada {

    public static void main(String[] args) {

        SupermercadoEspecifico<Alimento> supermercadoAlimentos = new SupermercadoEspecifico<Alimento>();
        supermercadoAlimentos.registrarElemento(new Carne("media","españa",50,100));

        SupermercadoEspecifico<Mueble> supermercadoMuebles = new SupermercadoEspecifico<Mueble>();

    }

}
