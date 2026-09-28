package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        // Verificacao para caso o peso do pacote seja maior que a capacidade maxima
        if (pacote.getPesoPacote() > veiculo.getCapacidadeMaxima()) {
            throw new IllegalArgumentException("O pacote (" + pacote.getPesoPacote() + "kg) excede a capacidade maxima do veiculo (" + veiculo.getCapacidadeMaxima() + "kg)!"
            );
        }
        
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void enviarPacote() {
        System.out.println("Levando pacote " + pacote.getCodigoRastreio() + " no veiculo " + veiculo.getPlaca());
    }
}