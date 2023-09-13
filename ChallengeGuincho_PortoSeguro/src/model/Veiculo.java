package model;

public class Veiculo {
	private double peso;
	private double comprimento;
	private double altura;
	private String placa;
	private String modelo;
	private String marca;
	private String cor;
	private String tipo;
	private int qtdEixos;
	private double pesoEixo;
	private String tipoCarroceria;
	private double capacidadeCarga;
	private boolean chassiAlongado = false;
	
	public Veiculo(double peso, double comprimento, double altura, String placa, String modelo, String marca,
            String cor, String tipo, int qtdEixos, String tipoCarroceria, double capacidadeCarga,
            boolean chassiAlongado) {
		 this.peso = peso;
		 this.comprimento = comprimento;
		 this.altura = altura;
		 this.placa = placa;
		 this.modelo = modelo;
		 this.marca = marca;
		 this.cor = cor;
		 this.tipo = tipo;
		 this.qtdEixos = qtdEixos;
		 this.tipoCarroceria = tipoCarroceria;
		 this.capacidadeCarga = capacidadeCarga;
		 this.chassiAlongado = chassiAlongado;
		}
			
	public double calcularPesoTotal(double pesoEixo) {
	    try {
	        if (qtdEixos > 0) {
	            return peso + capacidadeCarga + (qtdEixos * pesoEixo);
	        }
	        return peso + capacidadeCarga;
	    } catch (Exception e) {
	        System.err.println("Erro ao calcular o peso total: " + e.getMessage());
	        return -1; 
	    }
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQtdEixos() {
		return qtdEixos;
	}
	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public boolean isChassiAlongado() {
		return chassiAlongado;
	}
	public void setChassiAlongado(boolean chassiAlongado) {
		this.chassiAlongado = chassiAlongado;
	}

	public double getPesoEixo() {
		return pesoEixo;
	}

	public void setPesoEixo(double pesoEixo) {
		this.pesoEixo = pesoEixo;
	}


	
	
	
}
