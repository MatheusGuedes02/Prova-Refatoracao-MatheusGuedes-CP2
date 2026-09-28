package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String placa, double capacidadeMaxima, boolean temBau) {
        super(placa, capacidadeMaxima);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }
}