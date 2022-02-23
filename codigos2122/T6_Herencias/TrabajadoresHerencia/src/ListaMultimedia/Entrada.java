package ListaMultimedia;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion = -1;
        Coleccion coleccion = new Coleccion();
        /*Coleccion coleccion = new Coleccion();

        Libro libro = new Libro("1","tree","paco","papel", 3,300);
        Video video = new Video("2","apple","manu","vhs",20,"Julio","6");
        Elemento audio = new Audio("3","cat","samu","cd",45,85,"mp3");

        coleccion.añadirElemento(libro);
        coleccion.añadirElemento(video);
        coleccion.añadirElemento(audio);

        coleccion.listarElementos("");

        coleccion.eliminarElemento("2");

        coleccion.listarElementos("video");

        coleccion.listarElementos("");*/

        do {
            System.out.println("1. Añadir a la coleccion");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Listar Elemento");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    String tipo = "";
                    do {
                    System.out.println("Que elemento quieres añadir?");
                    System.out.println("Libro");
                    System.out.println("Video");
                    System.out.println("Audio");
                    System.out.println("Volver");
                    tipo = in.next();
                    switch (tipo) {
                        case "libro":
                            Libro libro = new Libro();
                            System.out.println("Indica el ID");
                            libro.setId(in.next());
                            System.out.println("Indica el Titulo");
                            libro.setTitulo(in.next());
                            System.out.println("Indica el Autor");
                            libro.setAutor(in.next());
                            System.out.println("Indica el Formato");
                            libro.setFormato(in.next());
                            System.out.println("Indica el Tamaño");
                            libro.setTamaño(in.nextInt());
                            System.out.println("Indica el Num Paginas");
                            libro.setNumPaginas(in.nextInt());
                            coleccion.añadirElemento(libro);
                            break;
                        case "audio":
                            Audio audio = new Audio();
                            System.out.println("Indica el ID");
                            audio.setId(in.next());
                            System.out.println("Indica el Titulo");
                            audio.setTitulo(in.next());
                            System.out.println("Indica el Autor");
                            audio.setAutor(in.next());
                            System.out.println("Indica el Formato");
                            audio.setFormato(in.next());
                            System.out.println("Indica el Tamaño");
                            audio.setTamaño(in.nextInt());
                            System.out.println("Indica la Duracion");
                            audio.setDuracion(in.nextInt());
                            System.out.println("Indica el Soporte");
                            audio.setSoporte(in.next());
                            coleccion.añadirElemento(audio);
                            break;
                        case "video":
                            Video video = new Video();
                            System.out.println("Indica el ID");
                            video.setId(in.next());
                            System.out.println("Indica el Titulo");
                            video.setTitulo(in.next());
                            System.out.println("Indica el Autor");
                            video.setAutor(in.next());
                            System.out.println("Indica el Formato");
                            video.setFormato(in.next());
                            System.out.println("Indica el Tamaño");
                            video.setTamaño(in.nextInt());
                            System.out.println("Indica el Director");
                            video.setDirector(in.next());
                            System.out.println("Indica los Actores");
                            video.setAutor(in.next());
                            coleccion.añadirElemento(video);
                            break;
                    }
                    }while (tipo.toString().equalsIgnoreCase("Volver"));
                    break;
                case 2:
                    System.out.println("Indica el id del elemento a eliminar");
                    coleccion.eliminarElemento(in.next());
                    break;
                case 3:
                    System.out.println("¿Que Elemento quieres listar?");
                    System.out.println("Libro");
                    System.out.println("Audio");
                    System.out.println("Video");
                    System.out.println("Todos");
                    coleccion.listarElementos(in.next());
                    break;
            }
        } while (opcion != 4);
    }
}
