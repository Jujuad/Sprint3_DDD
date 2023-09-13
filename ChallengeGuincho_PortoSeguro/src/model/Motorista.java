package model;

public class Motorista {
	private Pedido pedido;
	private String nome;
	private String telefone;
	private boolean disponibilidade;
	
	public Motorista(String nome, String telefone, boolean disponibilidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.disponibilidade = disponibilidade;
    }
	
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
}
