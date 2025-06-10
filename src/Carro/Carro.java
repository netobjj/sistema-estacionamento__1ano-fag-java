package carro;

public class Carro {
    private String modelo;
    private String placa;
    private boolean estacionado;

    public Carro(String modelo, String placa, boolean estacionado) {
        this.modelo = modelo;
        this.placa = placa;
        this.estacionado = estacionado;
    }
    
    public Carro() {
        super();
    }
    
    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }


    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    
    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return "Carro [modelo=" + modelo + ", placa=" + placa + ", estacionado=" + estacionado + "]";
    }
}
