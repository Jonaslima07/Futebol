import java.util.ArrayList;
import java.util.List;
public class Campeonato<Rodada> {
    private String nome;
    private List<Time> times;
    private List<Arbrito> arbitros;
    private List<Rodada> rodadas;

    public Campeonato(String nome) {
        this.nome = nome;
        times = new ArrayList<>();
        arbitros = new ArrayList<>();
        rodadas = new ArrayList<>();
    }
}
