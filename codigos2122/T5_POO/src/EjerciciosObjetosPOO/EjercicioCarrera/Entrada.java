package EjerciciosObjetosPOO.EjercicioCarrera;

public class Entrada {

    public static void main(String[] args) {

        //variables
        int kilometrosEtapa = 10000;

        //Creo los coches que van a competir
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Dacia","4785D",120);

        /*cocheA.mostrarDatos();
        System.out.println();
        cocheB.mostrarDatos();

        cocheA.setModelo("Honda");
        cocheA.setMatricula("7896F");
        cocheA.setCv(150);*/

        do {

            cocheA.acelerar((int) (Math.random() * (10 - 30)) + 30);
            cocheB.acelerar((int) (Math.random() * (10 - 30)) + 30);

            cocheA.mostrarDatos();
            cocheB.mostrarDatos();

        } while ((int)cocheA.getKilometrosRecorridos() < kilometrosEtapa ||
                (int)cocheB.getKilometrosRecorridos() < kilometrosEtapa);

        /*cocheA.mostrarDatos();
        System.out.println();
        cocheB.mostrarDatos();

        if (cocheA.getVelocidad() > cocheB.getVelocidad()) {
            System.out.print("El ganador es "+cocheA.getModelo() +"\t"+
                    cocheA.getMatricula() +" con "+ cocheA.getKilometrosRecorridos()+" km recorridos");
        } else {
            System.out.print("El ganador es "+cocheB.getModelo() +"\t"+
                    cocheB.getMatricula() +" con "+ cocheB.getKilometrosRecorridos() +" km recorridos");
        }*/

    }
}
