public final class Canterano extends Persona implements Seleccionable{

    private int posibilidades;
    private int ataque;


    public Canterano(String nombre, String apellido, double sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posibilidades: "+posibilidades);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 100;
    }

    @Override
    public void repartirPrima() {
        this.sueldo += 200;
        System.out.println("Repartida prima a canterano: "+this.sueldo);
    }

    @Override
    public int atacar() {
        this.ataque = (int)(Math.random() *61);
        return 0;
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
