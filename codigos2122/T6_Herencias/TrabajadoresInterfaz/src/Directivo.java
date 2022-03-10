public final class Directivo extends Persona implements Comision{

    private double capital;


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
    public double votar() {
        double voto = (Math.random()*11)/2;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficios) {
        System.out.println("El beneficio obtenido es "+beneficios*0.20);
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
