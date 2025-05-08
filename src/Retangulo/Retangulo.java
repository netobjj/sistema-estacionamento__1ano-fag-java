package Retangulo;

import java.awt.image.ComponentColorModel;

public class Retangulo {
    private double altura;
    private double base;
    private double area;

    public double calcularArea(double base, double altura) {
        return (base * altura);
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calcularArea(base, altura);
    }

    public Retangulo() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        this.area = calcularArea(base, altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.area = calcularArea(base, altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", area=" + area +
                '}';
    }
}
