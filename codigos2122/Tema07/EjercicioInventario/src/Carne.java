public final class Carne extends Alimento{

    private int proteinas;

    public Carne(String calidad, String origen, double precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(proteinas);
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
