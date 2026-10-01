package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class Principal {
    public static void main(String[] args) {
        
        Caminhao caminhaoEntrega = new Caminhao("ABC1234", 500.0, 3); //placa, capacidade maxima, eixos do caminhao.
        Caminhao caminhaoEntrega1 = new Caminhao("ABC1234", 500.0, 3);
        
        
        Moto motoEntrega = new Moto("XYZ9876", 150.0, true); //placa, capacidade maxima, se tem ou nao bau.
        Moto motoEntrega1 = new Moto("SIX6776", 150.0, false);
        Moto motoEntrega2 = new Moto("BOT7030", 150.0, false);
        Moto motoEntrega3 = new Moto("NUR1930", 150.0, false);
        
        
        
        Pacote pacote1 = new Pacote("BR001", 150, "Enviado"); //Codigo de envio, peso do pacote, situacao do envio.
        Pacote pacote2 = new Pacote("BR002", 8, "pendente");
        Pacote pacote3 = new Pacote("BR003", 30, "pendente");
        Pacote pacote4 = new Pacote("BR004", 25, "pendente");
        Pacote pacote5 = new Pacote("BR005", 200, "Enviado");
        
        
        Rota rotaCaminhao = new Rota(pacote1, caminhaoEntrega);
        System.out.print("\nRota 1(Caminhão): ");
        rotaCaminhao.enviarPacote();
        
        Rota rotaCaminhao1 = new Rota(pacote5, caminhaoEntrega1);
        System.out.print("\nRota 2 (erro de capacidade maxima):");
        rotaCaminhao1.enviarPacote();

        Rota rotaMoto = new Rota(pacote3, motoEntrega);
        System.out.print("\nRota 3 (Moto com bau): ");
        rotaMoto.enviarPacote();

        Rota rotaMoto2 = new Rota(pacote2, motoEntrega1);
        System.out.print("\nRota 4 (Sem bau):");
        rotaMoto2.enviarPacote();
        
        Rota rotaMoto3 = new Rota(pacote4, motoEntrega2);
        System.out.print("\nRota 5 (Sem bau - erro de capacidade ):"); //Dar um jeito pra funcionar essa parte de erro
        rotaMoto2.enviarPacote();
        
        
    }
}