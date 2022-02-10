public  class Coche {

    protected String matricula, bastidor;
    protected int cv, cc, velocidad;


    //constructores
    public Coche (String matricula, String bastidor, int cv, int cc){
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.cv = cv;
        this.cc = cc;
    }

    public Coche(){}


    //metodos
    public void calcularVelocidad(int velocidad){
        this.velocidad += velocidad;
    }

    public void mostrarDator(){
        System.out.println("Matricula: "+ matricula);
        System.out.println("Bastidor: "+ bastidor);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
        System.out.println("Velocidad :"+ velocidad);
    }


    // getters & setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
