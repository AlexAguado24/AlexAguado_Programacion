package Ejercicio3Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public final class Carrera {

    Scanner in = new Scanner(System.in);
    private ArrayList<Vehiculo> listaVehiculos;
    private Vehiculo ganador;
    int cv, cc, peso;


    public Carrera() {
        this.listaVehiculos = new ArrayList();
    }


    public void validarVehiculo(Vehiculo vehiculo, Validacion validar) {
        System.out.println("Indica el tipo de vehiculo: camion, moto o coche");
        vehiculo.setTipo(in.next());
        System.out.println("Indica el numero de ruedas:");
        vehiculo.setNumRuedas(in.nextInt());
        System.out.println("Indica los CV de vehiculo:");
        cv = in.nextInt();
        System.out.println("Indica los CC de vehiculo:");
        cc = in.nextInt();
        System.out.println("Indica el peso del vehiculo:");
        peso = in.nextInt();

        vehiculo = new Vehiculo(vehiculo.getTipo(), vehiculo.getNumRuedas(), cc,
                cv, peso) {
            @Override
            public void reprogramarMotor() {
                System.out.println("Elige una opcion:");
                System.out.println("1.Subir CV");
                System.out.println("2.Subir CC");
                System.out.println("3.Bajar peso");
                int opcion = in.nextInt();
                switch (opcion) {
                    case 1:
                        cv += cv * 25 / 100;
                        break;
                    case 2:
                        cc += cc * 35 / 100;
                        break;
                    case 3:
                        peso -= peso * 15 / 100;
                        break;
                }
            }
        };

        validar = new Validacion() {
            @Override
            public boolean validar(Vehiculo vehiculo) {
                for (Vehiculo item : listaVehiculos) {
                    if (item.getTipo().equalsIgnoreCase("coche")) {

                    }
                }
                return false;
            }
        };
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Vehiculo getGanador() {
        return ganador;
    }

    public void setGanador(Vehiculo ganador) {
        this.ganador = ganador;
    }
}
