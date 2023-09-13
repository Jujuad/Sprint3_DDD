package model;

public class Caminhao {
	private Motorista motorista;
	private String galpao;
	private String numeroSerial;
	private String placa;
	private double peso;
	private double altura;
	private double comprimento;
	private String modelo;
	private boolean disponibilidade = true;
	
	
	public Caminhao(String galpao, String numeroSerial, String placa, double peso, double altura, double comprimento, String modelo) {
        this.galpao = galpao;
        this.numeroSerial = numeroSerial;
        this.placa = placa;
        this.peso = peso;
        this.altura = altura;
        this.comprimento = comprimento;
        this.modelo = modelo;
    }
	
	public double calcularPesoTotal(Veiculo veiculo) {
		return this.getPeso() + veiculo.getPeso();
	}
	public double calcularAlturaTotal(Veiculo veiculo) {
		return this.getAltura() + veiculo.getAltura();
	}
	public double calcularComprimentoTotal(Veiculo veiculo) {
		return this.getComprimento() + veiculo.getComprimento();
	}
	
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getGalpao() {
		return galpao;
	}
	public void setGalpao(String galpao) {
		this.galpao = galpao;
	}
	public String getNumeroSerial() {
		return numeroSerial;
	}
	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
