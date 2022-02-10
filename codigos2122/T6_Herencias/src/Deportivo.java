public class Deportivo extends Coche{

    private int par;

    public Deportivo(){}
    public Deportivo(String matricula, String bastidor, int cv, int cc, int par){
        super(matricula,bastidor,cv,cc);
        this.par = par;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        velocidad += (int) (Math.random()*40-30)+30;
        System.out.println("Velocidad calculada");

    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    // todo lo que tiene coche



}
