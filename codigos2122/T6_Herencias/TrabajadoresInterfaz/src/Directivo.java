public final class Directivo extends Persona implements Comision{

    private double capital, beneficios;
    private int voto;

    public Directivo() {}

    public Directivo(String nombre, String apellido, String dni, double capital) {
        super(nombre, apellido, dni);
        this.capital = capital;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: "+capital);
    }

    @Override
    public void votar(int voto) {
        this.voto = (int)(Math.random()*6)/2;
    }

    @Override
    public void repatirBeneficios() {
        this.beneficios = this.beneficios * 0.15;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
