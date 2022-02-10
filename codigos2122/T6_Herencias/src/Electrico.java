public class Electrico extends Coche{

    private int bateria;

    public Electrico(){}

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria){
        super(matricula,bastidor,cv,cc);
        this.bateria = bateria;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        velocidad += (int) (Math.random()*11)+20;
        System.out.println(velocidad);
    }

    @Override
    public void mostrarDator() {
        super.mostrarDator();
        System.out.println("Bateria: "+bateria);
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
