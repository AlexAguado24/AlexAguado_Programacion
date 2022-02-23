package ListaMultimedia;

import java.util.ArrayList;

public final class Coleccion {

    private ArrayList<Elemento> listaElementos;

    public Coleccion() {
        listaElementos = new ArrayList<>();
    }

    public void añadirElemento(Elemento elemento) {
        boolean existe = false;
        for (Elemento item : listaElementos) {
            if (item.getId().equalsIgnoreCase(elemento.getId())) {
                existe = true;
                System.out.println("El elemento ya existe");
                break;
            }
        }
        if (!existe) {
            listaElementos.add(elemento);
            System.out.println("Elemento añadido");
        }
    }

    public void eliminarElemento(String id) {
        boolean existe = false;
        for (Elemento item : listaElementos) {
            if (item.getId().equalsIgnoreCase(id)) {
                existe = true;
                listaElementos.remove(item);
                System.out.println("Elemento eliminado");
                break;
            }
        }
        if (!existe) {
            System.out.println("El elemento que buscas no existe");
        }
    }

    private void listarLibro() {
        for (Elemento item : listaElementos) {
            if (item instanceof Libro) {
                item.mostrarDatos();
            }
        }
    }

    private void listarAudio() {
        for (Elemento item : listaElementos) {
            if (item instanceof Audio) {
                item.mostrarDatos();
            }
        }
    }

    private void listarVideo() {
        for (Elemento item : listaElementos) {
            if (item instanceof Video) {
                item.mostrarDatos();
            }
        }
    }

    private void listarTodo() {
        for (Elemento item : listaElementos) {
            item.mostrarDatos();
        }
    }

    public void listarElementos (String tipo) {
        switch (tipo){
            case "libro":
                listarLibro();
                System.out.println();
                break;
            case "audio":
                listarAudio();
                System.out.println();
                break;
            case "video":
                listarVideo();
                System.out.println();
                break;
            case "todos":
                listarTodo();
                System.out.println();
                break;
        }
    }
}
