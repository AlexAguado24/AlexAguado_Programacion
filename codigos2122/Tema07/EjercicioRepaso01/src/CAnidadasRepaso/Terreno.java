package CAnidadasRepaso;

import java.util.Scanner;

public class Terreno {

    Scanner in = new Scanner(System.in);
    private Casa casa;
    private int m2, valoracion;
    private String orientacion;

    public Terreno() {}

    public Terreno( int m2, int valoracion, String orientacion) {
        casa = new Casa();
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    public void revalorizarTerreno(){
        if (casa.getHabitaciones() > 0) {
            this.valoracion += valoracion * 1.25;
        } else if (casa.getM2Casa() > 100) {
            this.valoracion += valoracion * 1.30;
        } else if (casa.isPiscina()) {
            this.valoracion += valoracion * 1.50;
        }
    }

    public void construirCasa (Casa casa) {
        System.out.println("Indica los m2 de la casa");
        casa.setM2Casa(in.nextInt());
        setCasa(new Casa(casa.getM2Casa(), casa.getHabitaciones(),casa.isPiscina()));
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    class Casa {

        private int m2Casa, habitaciones;
        private boolean piscina;

        public Casa() {}

        public Casa(int m2Casa,int habitaciones, boolean piscina) {
            this.m2Casa = m2Casa;
            this.habitaciones = habitaciones;
            this.piscina = false;
        }

        public void construirHabitacion (int metros){
            try {
                setHabitaciones(+1);
                if (m2Casa < metros) {
                    throw  new ExcepcionTamaño("No puedes construir una habitacion tan grande");
                }
            } catch (ExcepcionTamaño e) {
                System.out.println("No puedes construir una habitacion tan grande");
                System.out.println("la habitacion tiene que ser menor de " + m2Casa + "m2, escribe el tamaño");
                metros = in.nextInt();
            } finally {
                setM2Casa(- metros);
                setHabitaciones(+1);
            }
        }

        public void construirPiscina (){
            this.piscina = true;
        }

        public void construirAnexo (int metros){}

        public int getM2Casa() {
            return m2Casa;
        }

        public void setM2Casa(int m2Casa) {
            this.m2Casa = m2Casa;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }

}
