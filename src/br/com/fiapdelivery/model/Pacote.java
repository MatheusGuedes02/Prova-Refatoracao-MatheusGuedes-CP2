package br.com.fiapdelivery.model;

public class Pacote {
		private String codigoEnvio;
		private double pesoPacote;
		private String situacaoAtual;
		
		
		public Pacote(String codigoEnvio, double pesoPacote, String situacaoAtual) {
	        this.codigoEnvio = codigoEnvio;
	        this.pesoPacote = pesoPacote;
	        this.situacaoAtual = situacaoAtual;
	    }
		
		public void atualizarStatus(String novoStatus) {
	        this.situacaoAtual = novoStatus;
	    }
		
		public String getCodigoRastreio() {
			return codigoEnvio;
		}

		public double getPesoPacote() {
			return pesoPacote;
		}

		public String getSituacaoAtual() {
			return situacaoAtual;
		}
	}