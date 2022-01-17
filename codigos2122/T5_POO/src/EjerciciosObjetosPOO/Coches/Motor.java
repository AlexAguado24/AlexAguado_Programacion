package EjerciciosObjetosPOO.Coches;

public class Motor {
    private int litrosDeAceite, cv;

    public Motor (int cv){
        this.cv = cv;
        // litros = 0; (por defecto)
    }
    public Motor(int cv, int litrosDeAceite){
        this.cv = cv;
        this.litrosDeAceite = litrosDeAceite;
    }

    public int getCV() {
        return cv;
    }

    public int getLitrosDeAceite() {
        return litrosDeAceite;
    }

    public void setLitrosDeAceite(int litrosDeAceite) {
        this.litrosDeAceite = litrosDeAceite;
    }
}
