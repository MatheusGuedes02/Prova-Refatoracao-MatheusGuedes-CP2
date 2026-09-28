package br.com.fiapdelivery.model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeMaxima;

    public Veiculo(String placa, double capacidadeMaxima) {
        if (capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("A capacidade máxima deve ser maior que zero."); // Caso de validacao
        }
        this.placa = placa;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    // Getters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
}