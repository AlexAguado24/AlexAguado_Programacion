public enum Posiciones {

    portero("portero",1000), defensa("defensa",1500),
    medio("mediocentro", 2000), delantero("delantero",3000);

    String definicion;
    int valor;

    Posiciones(){}

    Posiciones(String definicion, int valor){
        this.definicion = definicion;
        this.valor = valor;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
