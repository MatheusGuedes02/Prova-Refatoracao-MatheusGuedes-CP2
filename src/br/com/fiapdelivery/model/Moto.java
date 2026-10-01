package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String placa, double capacidadeMaxima, boolean temBau) {
    	super(placa, temBau ? capacidadeMaxima : 10); //Se tiver bau vai poder receber a capacidade, se for false vai receber capacidade = 10(Valor medio que cabe sem bau);
        this.temBau = temBau;
        }


    public boolean isTemBau() {
        return temBau;
    }
}