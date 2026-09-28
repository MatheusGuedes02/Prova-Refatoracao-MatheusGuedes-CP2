package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidadeMaxima, int eixos) {
        super(placa, capacidadeMaxima);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }
}