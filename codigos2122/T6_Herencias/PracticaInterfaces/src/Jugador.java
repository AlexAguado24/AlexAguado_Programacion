public final class Jugador extends Persona implements Seleccionable{

    private String posicion;
    private int ataque;
    private double prima;

    public Jugador(String nombre, String apellido, double sueldo, String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posicion: "+posicion);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo + (this.sueldo * Constantes.IRPF);
    }

    @Override
    public int atacar() {

        if (posicion.equalsIgnoreCase(Posiciones.delantero.getDefinicion())) {
            this.ataque = (int)(Math.random()*26)+75;
        } else if (posicion.equalsIgnoreCase(Posiciones.medio.getDefinicion())) {
            this.ataque = (int)(Math.random()*26)+50;
        } else if (posicion.equalsIgnoreCase(Posiciones.defensa.getDefinicion())) {
            this.ataque = (int)(Math.random()*51);
        }
        return ataque;
    }

    @Override
    public void repartirPrima() {
        this.sueldo += this.sueldo * 1.20;
        System.out.println("Repartida prima a jugador de: "+this.sueldo*0.20);
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
