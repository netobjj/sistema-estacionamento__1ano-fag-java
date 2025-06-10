package garagem;
import vaga.Vaga;
import java.util.ArrayList;

public class Garagem {
    private int capacidadeMaxima;
    private ArrayList<Vaga> vagas;

    public Garagem (int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.vagas = new ArrayList<>();
    }

    public Garagem() {
        super();
        this.vagas = new ArrayList<>();
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public ArrayList<Vaga> getVagas() {
        return this.vagas;
    }

    public ArrayList<Vaga> removeVaga(int index) {
        this.vagas.remove(index);
        return this.vagas;
    } 

    public void setVaga(Vaga vaga) {
        this.vagas.add(vaga);
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}
