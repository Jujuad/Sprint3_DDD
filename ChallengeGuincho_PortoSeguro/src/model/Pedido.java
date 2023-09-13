package model;

public class Pedido {
	private String identificador;
	private String enderecoLocal;
	private String enderecoOrigem;
	private String condicoes;
	private String referencia;
	private String status;
	private String rota;
	
	
	public Pedido(String identificador, String enderecoLocal, String enderecoOrigem, String condicoes,
            String referencia, String status, String rota) {
	  this.identificador = identificador;
	  this.enderecoLocal = enderecoLocal;
	  this.enderecoOrigem = enderecoOrigem;
	  this.condicoes = condicoes;
	  this.referencia = referencia;
	  this.status = status;
	  this.rota = rota;
	}
	
	public String pedidoFormatado() {
	    try {
	        return 	  "______________________________________"
	                + "IDENTIFICADOR DO PEDIDO: " + this.getIdentificador() + System.lineSeparator()
	                + "Endereço de saída: " + this.getEnderecoOrigem() + System.lineSeparator()
	                + "Endereço de entrega: " + this.getEnderecoLocal() + System.lineSeparator() 
	                + "Condições do cliente: " + this.getCondicoes() + System.lineSeparator() 
	                + "Referência do local: " + this.getReferencia() + System.lineSeparator() 
	                + "Status: " + this.getStatus() + System.lineSeparator()
	                + "______________________________________";
	    } catch (Exception e) {
	        System.err.println("Erro ao formatar o pedido: " + e.getMessage());
	        return "Erro ao formatar o pedido";
	    }
	}
	public void calcularMelhorRota() {
		// método a ser implementado utilizando alguma API de gps - proximas entregas (outra vez);
	}
	public void atualizarRotaAtual(String rota) {
	    try {
	        this.setRota(rota);
	    } catch (NullPointerException e) {
	        System.err.println("Erro ao atualizar rota atual: " + e.getMessage());
	    }
	}

	public void atualizarStatus(String status) {
	    try {
	        this.setStatus(status);
	    } catch (NullPointerException e) {
	        System.err.println("Erro ao atualizar status: " + e.getMessage());
	    }
	}
	
	public String getEnderecoLocal() {
		return enderecoLocal;
	}
	public void setEnderecoLocal(String enderecoLocal) {
		this.enderecoLocal = enderecoLocal;
	}
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	public String getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	
}
