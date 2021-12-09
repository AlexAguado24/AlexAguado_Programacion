package Ejercicios;

public class ChampionArray {
    public static void main(String[] args) {
        String[] bomboUno = {"Barcelona","PSG","Bayern","Manchester City","Juventus","RB Leizpzig","Valencia","Liverpool"};
        String[] bomboDos= {"Real Madrid","Tottenham","Nápoles","B. Dortmund","O. Lyon","Chelsea","Atalanta","Atético de Madrid"};

        String[] equiposSalidosB1 = new String[bomboUno.length];
        String[] equiposSalidosB2 = new String[bomboDos.length];

        for (int i = 0; i < bomboDos.length; i++) {
            int aleatorioUno = (int) (Math.random()* bomboUno.length);
            int aleatorioDos = (int) (Math.random()* bomboDos.length);
            String equipoGenerado1 = bomboUno[aleatorioUno];
            String equipoGenerado2 = bomboDos[aleatorioDos];

            for (int x = 0;x< equiposSalidosB1.length;x++){
                if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[i])) {
                    aleatorioUno = (int) (Math.random()*bomboUno.length);
                } 
                if (equipoGenerado2.equalsIgnoreCase(equiposSalidosB2[i])) {
                    aleatorioDos = (int) (Math.random()* bomboDos.length);
                }
            }
            System.out.println(bomboUno[aleatorioUno]+ " - " +bomboDos[aleatorioDos]);
        }
    }
}
//(ChampionArray) Desarrolla un programa que simule los cruzes del sorteo de la champion. Para ello debes saber que existen dos bombos:
//
//bombo1: Barcelona, PSG, Bayern, Manchester City, Juventus, RB Leizpzig, Valencia, Liverpool
//bombo2: Real Madrid, Tottenham, Nápoles, B. Dortmund, O. Lyon, Chelsea, Atalanta, Atético de Madrid
// El programa debe empajerar un equipo del bombo1 con un equipo del bombo2 sin repetir posibilidades y mostrarlo por pantalla con el siguiente formato: