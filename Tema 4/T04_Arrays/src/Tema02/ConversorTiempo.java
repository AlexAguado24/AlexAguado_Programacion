package Tema02;

public class ConversorTiempo {
    public static void main(String[] args) {
        int numSegundos =24973, minutos, horas, segundos;

        minutos = numSegundos / 60;
        segundos = numSegundos % 60;
        horas = minutos /60;
        minutos = minutos %60;



        System.out.println("Horas: "+ horas);
        System.out.println("Minutos: "+ minutos);
        System.out.println("Segundos "+ segundos);

    }

}
//ConversorTiempo.java
//Hágase un programa que convierta segundos en horas, minutos y segundos.
//
//ENTRADA
//Número de segundos: 24973
//
//SALIDA
//Horas: 6
//Minutos: 56
//Segundos: 13