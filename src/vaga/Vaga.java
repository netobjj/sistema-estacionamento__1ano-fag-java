package vaga;

import carro.Carro;
import pessoa.Pessoa;

public class Vaga {
    private int numero;
    private Carro carro;
    private Pessoa pessoa;

    public Vaga(int numero, Carro carro, Pessoa pessoa) {
        this.numero = numero;
        this.pessoa = pessoa;
        this.carro = carro;
    }

    public Vaga() {
        super();
    }

    public Vaga(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String toString() {
        return "Vaga [numero=" + numero + ", carro=" + carro + ", pessoa=" + pessoa + "]";
    }

}
