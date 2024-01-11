import java.util.ArrayList;

public class Time {
    private String nome;
    private String liga;
    private ArrayList<Jogador> jogadores;
    private Tecnico tecnico;

    public Time(String nome, String liga) {
        this.nome = nome;
        this.liga = liga;
        this.jogadores = new ArrayList<>();
    }

    public void contrataTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public double salarioTecnico() {
        if (tecnico != null) {
            return tecnico.getSalario();
        }
        return 0.0; // Retorna 0.0 se não houver técnico contratado.
    }

    public void contrataJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public double folhaSalarial() {
        double folha = 0;
        for (Jogador jogador : jogadores) {
            folha += jogador.getSalario();
        }
        return folha;
    }
}
