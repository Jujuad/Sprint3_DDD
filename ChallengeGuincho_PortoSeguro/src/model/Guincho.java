package model;

public class Guincho {
	private String setor;
	private String unidade;
	private String tipo;
	private double peso;
	private boolean disponibilidade;
	
	
	public Guincho(String setor, String unidade, String tipo, double peso, boolean disponibilidade) {
        this.setor = setor;
        this.unidade = unidade;
        this.tipo = tipo;
        this.peso = peso;
        this.disponibilidade = disponibilidade;
    }
	
	public String calcularTensaoIdeal(Veiculo veiculo) {
        double pesoVeiculo = veiculo.getPeso();
        int qtdEixos = veiculo.getQtdEixos();
        double pesoEixo = veiculo.getPesoEixo();
        boolean chassiAlongado = veiculo.isChassiAlongado();
        double capacidadeCarga = veiculo.getCapacidadeCarga();

        // Chamando o método pesoGuincho
        double tensaoIdeal = pesoGuincho(pesoVeiculo, qtdEixos, pesoEixo, chassiAlongado, capacidadeCarga);
        return "A tensão ideal do guincho é " + tensaoIdeal;
    }

    private double pesoGuincho(double pesoVeiculo, int qtdEixos, double pesoEixo, boolean chassiAlongado, double capacidadeCarga) {
        // Cálculos para determinar a tensão ideal do guincho
        double result = pesoVeiculo * 2;
        result += qtdEixos * pesoEixo;
        if (chassiAlongado) {
            result += 1.5;
        }
        return result;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

}
