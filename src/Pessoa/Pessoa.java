package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf= cpf;
    }

    public Pessoa() {
        super();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
    }
}
