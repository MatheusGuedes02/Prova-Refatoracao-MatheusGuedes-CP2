package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo; // Aceita tanto Moto quanto Caminhao ou outros veiculos caso atualize.

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void enviarPacote() {
        System.out.println("Levando pacote " + pacote.getCodigoRastreio() + " no veiculo " + veiculo.getPlaca());
    }
}