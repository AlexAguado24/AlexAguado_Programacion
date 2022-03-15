public class Entrada {

    public static void main(String[] args) {

        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();
        ClaseA claseA = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("El mensaje abstracto de la clase A");
            }
        };
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mensaje abs diferente");
            }
        };
        claseC.regitrarMensaje(claseA);

    }

}
