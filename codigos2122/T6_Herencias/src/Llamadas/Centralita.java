package Llamadas;

import java.util.ArrayList;

public final class Centralita {

    ArrayList<Llamada> registroLlamadas;

    public void registrarLlamada(Llamada llamada) {
        registroLlamadas.add(llamada);
        System.out.println("Numero Origen " + llamada.nOrigen);
        System.out.println("Numero Destino " + llamada.nDestino);
        System.out.println("Duracion " + llamada.duracion);
        for (Llamada item : registroLlamadas) {
            if (item instanceof LlamadaProvincial) {
                System.out.println("Coste " + ((LlamadaProvincial) item).coste);
            } else if (item instanceof LlamadaNacional) {
                System.out.println("Franja " + ((LlamadaNacional) item).getFranja());
                System.out.println("Coste " + ((LlamadaNacional) item).coste);
            }
        }

    }

    public void costesTotales() {
        double sumaCoste = 0;
        for (Llamada llamada : registroLlamadas) {
            sumaCoste += llamada.coste;
        }
    }


    public ArrayList<Llamada> getRegistroLlamadas() {
        return registroLlamadas;
    }

    public void setRegistroLlamadas(ArrayList<Llamada> registroLlamadas) {
        this.registroLlamadas = registroLlamadas;
    }
}
