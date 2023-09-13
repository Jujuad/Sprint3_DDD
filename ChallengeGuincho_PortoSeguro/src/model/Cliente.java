package model;

import java.util.ArrayList;

public class Cliente {
	private String nomeSolicitante;
	private String nomeEmpresa;
	private String cpfSolicitante;
	private String cnpjEmpresa;
	private String telefone;
	private ArrayList<String> cartoes = new ArrayList<String>();
	private ArrayList<String> historicoPedidos = new ArrayList<String>();;
	private boolean isEspecial = false;
	
	
	public Cliente(String nomeSolicitante, String nomeEmpresa, String cpfSolicitante, String cnpjEmpresa, String telefone) {
        this.nomeSolicitante = nomeSolicitante;
        this.nomeEmpresa = nomeEmpresa;
        this.cpfSolicitante = cpfSolicitante;
        this.cnpjEmpresa = cnpjEmpresa;
        this.telefone = telefone;
    }
	
	
	public void atualizarPerfil(String nomeSolicitante, String nomeEmpresa, String cpfSolicitante, String cnpjEmpresa, String telefone) {
		this.nomeSolicitante = nomeSolicitante;
	    this.nomeEmpresa = nomeEmpresa;
	    this.cpfSolicitante = cpfSolicitante;
	    this.cnpjEmpresa = cnpjEmpresa;
	    this.telefone = telefone;
	}
	public void visualizarDetalhesPagamento(Pagamento pagamento) {
		String detalhesPagamento = pagamento.visualizarDetalhesPagamento();
	    System.out.println(detalhesPagamento);
	}
	
	public void cancelarPedido(Pedido pedido) {
		if (historicoPedidos.contains(pedido.pedidoFormatado())) {
	        historicoPedidos.remove(pedido.pedidoFormatado());
	        System.out.println("Pedido cancelado! ");
	    } else {
	        System.out.println("O pedido não foi encontrado.");
	    }
	}
	
	public void adicionarCartao(String numeroCartao, String nomeCompleto, String cvv) {
		cartoes.add("Numero do cartão: " + numeroCartao + System.lineSeparator()
		+ "nomeCompleto: " + nomeCompleto + System.lineSeparator()
		+ "cvv:" + cvv + System.lineSeparator());
		
	}
	public void removerCartao(String numeroCartao, String nomeCompleto) {
		for (String cartao: cartoes) {
			if (cartao.contains(nomeCompleto) && cartao.contains(numeroCartao)) {
				cartoes.remove(cartao);
			}
		}
	}
	public void listarCartoes() {
		for (String cartao: cartoes) {
			System.out.println(cartao);
		}
	}
	public void adicionarPedido(Pedido pedido) {
		historicoPedidos.add(pedido.pedidoFormatado());
	}
	public void removerPedido(String idPedido, Pedido pedido) {
		for (String pedidoHistorico: historicoPedidos) {
			if (pedidoHistorico.contains(idPedido)) {
				historicoPedidos.remove(pedidoHistorico);
			}
		}
	}
	public void listarPedidos() {
		for (String pedidoHistorico: historicoPedidos) {
			System.out.println(pedidoHistorico);
		}
	}
	
	
	public String getNomeSolicitante() {
		return nomeSolicitante;
	}
	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCpfSolicitante() {
		return cpfSolicitante;
	}
	public void setCpfSolicitante(String cpfSolicitante) {
		this.cpfSolicitante = cpfSolicitante;
	}
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isEspecial() {
		return isEspecial;
	}
	public void setEspecial(boolean isEspecial) {
		this.isEspecial = isEspecial;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	private String score;
}
