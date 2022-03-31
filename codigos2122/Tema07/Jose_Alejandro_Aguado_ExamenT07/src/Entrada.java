public class Entrada {

    public static void main(String[] args) {

        Restaurante<PedidoComida> restauranteComida = new Restaurante("Bar de tapas",0,0);

        PedidoComida bocadillos = new PedidoComida(50,5,Comidas.bocadillos);
        PedidoComida raciones = new PedidoComida(100,10,Comidas.raciones);
        restauranteComida.registrarPedido(bocadillos);
        restauranteComida.registrarPedido(raciones);

        Restaurante<ConsumicionBarra> restauranteBebidas = new Restaurante("Refrescos S.L",0,0);

        ConsumicionBarra cocacolas = new ConsumicionBarra(20,10,Bebidas.refrescos);
        ConsumicionBarra copas = new ConsumicionBarra(100,10,Bebidas.copas);
        restauranteBebidas.registrarPedido(cocacolas);
        restauranteBebidas.registrarPedido(copas);

        restauranteBebidas.verPedidos();
        restauranteComida.verPedidos();

        Restaurante<ConsumicionGenerica> restauranteMultiple = new Restaurante("Come y Bebe", 0,0);

        PedidoComida menu = new PedidoComida(150,12,Comidas.menu);
        ConsumicionBarra cerves = new ConsumicionBarra(50,20,Bebidas.cervezas);

        restauranteMultiple.registrarPedido(menu);
        restauranteMultiple.registrarPedido(cerves);

        restauranteMultiple.verPedidos();

        restauranteMultiple.colocarComensales(40);
        restauranteMultiple.colocarComensales(20);

    }
}
