package Carro;

import java.util.Objects;

public class Carro {

    private int ano;
    private String modelo;
    private String marca;
    private String cor;
    private String estado;

    public Carro(int ano, String modelo, String marca, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.estado = "desligado";
    }

    public void ligarOuDesligarCarro() {
        if (this.estado.equals("ligado")){
            this.estado = "desligado";
        } else {
            this.estado = "ligado";
        }
    }

    public Carro() {
        super();
    }

    public int getAno() {
        return this.ano; // can be return ano;
    }

    public int setAno(int ano) {
        return this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano && Objects.equals(modelo, carro.modelo) && Objects.equals(marca, carro.marca) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, modelo, marca, cor);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}


