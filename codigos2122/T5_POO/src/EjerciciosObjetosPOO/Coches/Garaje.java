package EjerciciosObjetosPOO.Coches;

public class Garaje {

    private Coche coche;
    private String averia;
    private int numCoches;

    public void devolverCoche(){
        this.coche = null;
    }

    public boolean aceptarCoche (Coche coche, String averia) {
        if (coche !=null) {
            return false;
        } else {
            numCoches++;
            this.coche = coche;
            if (averia.equalsIgnoreCase("aceite")) {
                coche.getMotor().setLitrosDeAceite(coche.getMotor()
                        .getLitrosDeAceite() +(int)(Math.random()*1000));
            }
            return true;
        }
    }

}
