package br.com.fiapdelivery.model;

public class Pacote {
		private String codigoRastreio;
		private double pesoPacote;
		private String situacaoAtual;
		
		
		public Pacote(String codigoRastreio, double pesoPacote, String situacaoAtual) {
	        this.codigoRastreio = codigoRastreio;
	        this.pesoPacote = pesoPacote;
	        this.situacaoAtual = situacaoAtual;
	    }
		
		public void atualizarStatus(String novoStatus) {
	        this.situacaoAtual = novoStatus;
	    }
		
		public String getCodigoRastreio() {
			return codigoRastreio;
		}

		public double getPesoPacote() {
			return pesoPacote;
		}

		public String getSituacaoAtual() {
			return situacaoAtual;
		}
	}