package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class Principal {
    public static void main(String[] args) {
        
        Caminhao caminhaoEntrega = new Caminhao("ABC1234", 500.0, 3); //placa, capacidade maxima, eixos do caminhao.
        
        Moto motoEntrega = new Moto("XYZ9876", 150.0, true); //placa, capacidade maxima, se tem ou nao bau.

        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente"); //Codigo de envio, peso do pacote, situacao do envio.
        Pacote pacote2 = new Pacote("BR001", 20, "pendente");
        
        Rota rotaCaminhao = new Rota(pacote1, caminhaoEntrega);
        System.out.print("Rota 1: ");
        rotaCaminhao.enviarPacote();

        Rota rotaMoto = new Rota(pacote2, motoEntrega);
        System.out.print("Rota 2: ");
        rotaMoto.enviarPacote();
    }
}