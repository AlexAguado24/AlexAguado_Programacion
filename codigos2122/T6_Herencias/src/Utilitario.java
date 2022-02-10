public class Utilitario extends Coche{

    private int plazas;

    public Utilitario(){}
    public Utilitario(String matricula, String bastidor, int cv, int cc, int plazas){
        super(matricula,bastidor,cv,cc);
        this.plazas = plazas;
    }

    @Override
    public void mostrarDator() {
        super.mostrarDator();
        System.out.println("Plazas: "+plazas);
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
