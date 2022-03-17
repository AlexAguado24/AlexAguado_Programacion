public class Coche {

    private int velocidad;
    private double precio;
    private String marca, modelo;
    private Motor motor;

    public Coche (){}

    public Coche(double precio, int velocidad, String marca, String modelo) {
        this.precio = precio;
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatosCoche(){
        System.out.println("Precio: "+precio);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad: "+velocidad);
        if (this.motor == null) {
            System.out.println("El coche no tiene motor aun");
        } else {
            motor.mostrarDatosMotor();
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.cv >0 && motor.cv < 50) {
            this.precio += this.precio *0.25;
        }
        if (motor.cv >50 && motor.cv < 100) {
            this.precio += this.precio *0.40;
        }
        if (motor.cv >100 && motor.cv < 200) {
            this.precio += this.precio * 0.60;
        }
        if (motor.cv > 200) {
            this.precio += this.precio * 0.70;
        }
    }

    class Motor {

        private int cv, cc;

        public Motor(){}

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void mostrarDatosMotor (){
            System.out.println("CV: "+cv);
            System.out.println("CC: "+cc);
        }

        public void calcularPrecioCoche (Coche c){

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
    }
}
