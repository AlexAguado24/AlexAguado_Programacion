package EjerciciosObjetosPOO.CajeroBase;

public class Entrada {

    public static void main(String[] args) {

        Banco bbva = new Banco();
        Banco santander = new Banco();

        bbva.abrirCuenta(new Cuenta(new Cliente("4785D"),1881,500.50));

        System.out.println(bbva.getCuentasBanco());

        bbva.borrarCuenta("4785D");

        System.out.println(bbva.getCuentasBanco());


    }
}
