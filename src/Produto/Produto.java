package Produto;

public class Produto {
    private String nome;
    private double preco;
    private double percentualDesconto;
    private double precoFinal;

    public double setPrecoFinal(double preco, double percentualDesconto) {
        this.precoFinal = (preco - (preco / percentualDesconto));
        return (preco - (preco / percentualDesconto));
    }

    public Produto(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
        this.precoFinal = setPrecoFinal(preco, percentualDesconto);
    }

    public Produto() {
        super();
    }

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
        this.precoFinal = setPrecoFinal(this.preco, percentualDesconto);
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", percentualDesconto=" + percentualDesconto +
                ", precoFinal=" + precoFinal +
                '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


