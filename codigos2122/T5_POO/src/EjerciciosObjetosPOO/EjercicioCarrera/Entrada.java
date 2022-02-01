package EjerciciosObjetosPOO.EjercicioCarrera;

public class Entrada {

    public static void main(String[] args) {

        //variables
        int kilometrosEtapa = 10000;

        //Creo los coches que van a competir
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Dacia", "4785D", 120);

        cocheA.setModelo("leon");
        cocheA.setMatricula("7896A");
        cocheA.setCv(120);

        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        System.out.println();


        /*cocheA.mostrarDatos();
        System.out.println();
        cocheB.mostrarDatos();*/

        /*acelerar coches
        cocheA.acelerar((int) (Math.random() * (10 - 30)) + 30);
        cocheB.acelerar((int) (Math.random() * (10 - 30)) + 30);*/

        /*cocheA.setModelo("Honda");
        cocheA.setMatricula("7896F");
        cocheA.setCv(150);*/

        do {

            cocheA.acelerar((int) (Math.random() * (10 - 30)) + 30);
            cocheB.acelerar((int) (Math.random() * (10 - 30)) + 30);

            System.out.println(cocheA.getModelo() + " " +cocheA.getKilometrosRecorridos());
            System.out.println();
            System.out.println(cocheB.getModelo() + " " +cocheB.getKilometrosRecorridos());
            System.out.println();

        } while ((int) cocheA.getKilometrosRecorridos() <= kilometrosEtapa &&
                (int) cocheB.getKilometrosRecorridos() <= kilometrosEtapa);

        if (cocheA.getKilometrosRecorridos() > cocheB.getKilometrosRecorridos()) {
            System.out.print("El ganador es "+cocheA.getModelo() +"\t"+
                    cocheA.getMatricula() +" con "+ cocheA.getKilometrosRecorridos()+" km recorridos");
        } else {
            System.out.print("El ganador es "+cocheB.getModelo() +"\t"+
                    cocheB.getMatricula() +" con "+ cocheB.getKilometrosRecorridos() +" km recorridos");
        }



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
