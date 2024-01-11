import java.util.Random;

public class Partida<Arbitro> {
    private Time timeA;
    private Time timeB;
    private int[] gols;
    private Arbitro arbitro;
    private int publico;
    Random random = new Random();

    public void Time(Time timeA, Time timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        gols = new int[2];
    }

    public void marcarGol(int time) {
        gols[time]++;
    }

    public int marcarGolsAleatorios() {
        return random.nextInt(6); // Gera um número aleatório de gols (0 a 5).
    }
}
