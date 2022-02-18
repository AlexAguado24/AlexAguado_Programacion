package Llamadas;

import java.util.ArrayList;

public final class Centralita {

    ArrayList<Llamada> registroLlamadas;
    private double sumaCoste = 0;

    public Centralita() {
        registroLlamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada) {
        registroLlamadas.add(llamada);
        
        llamada.mostrarDatos();
        this.sumaCoste += llamada.getCoste();
    }

    public void costesTotales() {
        for (Llamada llamada : registroLlamadas) {
            sumaCoste += llamada.getCoste();
        }
        System.out.println("El coste de las llamadas es "+sumaCoste);
    }

    /*public void mostrarLlamadas(String tipo) {
        for (Llamada llamada : registroLlamadas) {
            if (tipo.equalsIgnoreCase("provincial") ) {
                if (llamada instanceof LlamadaProvincial) {
                    llamada.mostrarDatos();
                }
            }
        }
    }*/

    private void listarNacionales() {
        for (Llamada item : registroLlamadas) {
            if (item instanceof LlamadaNacional) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }
    private void listarLocales() {
        for (Llamada item : registroLlamadas) {
            if (item instanceof LlamadaLocal) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }
    private void listarProvinciales() {
        for (Llamada item : registroLlamadas) {
            if (item instanceof LlamadaProvincial) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }
    private void listarTodas () {
        for (Llamada item :registroLlamadas) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
        }
    }

    public void mostrarLlamadas (String tipo) {
        switch (tipo){
            case "locales":
                listarLocales();
                break;
            case "nacionales":
                listarNacionales();
                break;
            case "provinciales":
                listarProvinciales();
                break;
            case "todas":
                listarTodas();
                break;
        }
    }



    public ArrayList<Llamada> getRegistroLlamadas() {
        return registroLlamadas;
    }

    public void setRegistroLlamadas(ArrayList<Llamada> registroLlamadas) {
        this.registroLlamadas = registroLlamadas;
    }
}
