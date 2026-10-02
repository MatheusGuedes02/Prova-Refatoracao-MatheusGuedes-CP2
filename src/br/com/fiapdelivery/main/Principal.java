package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

/*
	Quero deixar aqui que eu comecei a fazer essa cp quando voce postou ela
desde então tenho estudado mais java em cima dessa prova e acabei fazendo 
coisas que provavelmente estao um pouco complexas pra uma coisa que provavelmente nao precisava

	-Mais pra frente na parte das rotas aqui na main mesmo acabei tentando fazer dar erro sem cair 
naquela tela de erro sem que terminasse o programa, então fui estudar sobre e acabei fazendo com 
try e catch, não sei se seria o ideal na questao de boas praticas, mas acabei testando e achei legal.
*/

public class Principal {
    public static void main(String[] args) {
        
        // --- VEICULOS ---
        Caminhao caminhaoEntrega = new Caminhao("ABC1234", 500.0, 3); 
        Caminhao caminhaoEntrega1 = new Caminhao("DEF5678", 500.0, 3); // Placa alterada para não repetir
        
        Moto motoEntrega = new Moto("XYZ9876", 150.0, true); 
        Moto motoEntrega1 = new Moto("SIX6776", 150.0, false);
        Moto motoEntrega2 = new Moto("BOT7030", 150.0, false);
        Moto motoEntrega3 = new Moto("NUR1930", 150.0, false);
        
        // --- PACOTES ---
        Pacote pacote1 = new Pacote("BR001", 150, "Enviado"); 
        Pacote pacote2 = new Pacote("BR002", 8, "Pendente");
        Pacote pacote3 = new Pacote("BR003", 30, "Pendente");
        Pacote pacote4 = new Pacote("BR004", 160, "Pendente");
        Pacote pacote5 = new Pacote("BR005", 600, "Enviado");
        Pacote pacote6 = new Pacote("BR006", 12, "Pendente");
        
        System.out.println("--- INICIANDO TESTES DO SISTEMA ---\n");

        
        // Rota 1 (Caminhão - Sucesso)
        try {
            Rota rotaCaminhao = new Rota(pacote1, caminhaoEntrega);
            System.out.print("Rota 1 (Caminhão): ");
            rotaCaminhao.enviarPacote();
            System.out.println(); // Pula linha após a mensagem da Rota
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 1 - Erro: " + e.getMessage());
        }
        
        // Rota 2 (Caminhão - Erro de capacidade máxima)
        try {
            Rota rotaCaminhao1 = new Rota(pacote5, caminhaoEntrega1);
            System.out.print("Rota 2 (Caminhão): ");
            rotaCaminhao1.enviarPacote();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 2 - Erro: " + e.getMessage());
        }

        // Rota 3 (Moto com baú - Sucesso)
        try {
            Rota rotaMoto = new Rota(pacote3, motoEntrega);
            System.out.print("Rota 3 (Moto com baú): ");
            rotaMoto.enviarPacote();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 3 - Erro: " + e.getMessage());
        }

        // Rota 4 (Moto sem baú - Sucesso)
        try {
            Rota rotaMoto2 = new Rota(pacote2, motoEntrega1);
            System.out.print("Rota 4 (Moto sem baú): ");
            rotaMoto2.enviarPacote();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 4 - Erro: " + e.getMessage());
        }
        
        // Rota 5 (Moto sem baú - Erro de capacidade)
        try {
            Rota rotaMoto3 = new Rota(pacote4, motoEntrega2);
            System.out.print("Rota 5 (Moto sem baú): ");
            rotaMoto3.enviarPacote(); 
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 5 - Erro: " + e.getMessage());
        }
        
        // Rota 6 (Testando a última moto que faltava)
        try {
            Rota rotaMoto4 = new Rota(pacote6, motoEntrega3);
            System.out.print("Rota 6 (Moto sem baú): ");
            rotaMoto4.enviarPacote();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Rota 6 - Erro: " + e.getMessage());
        }

        System.out.println("\n--- FIM DOS TESTES ---");
    }
}