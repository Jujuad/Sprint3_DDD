package model;

import java.util.ArrayList;

public class GerenciadorCaminhao {
	private ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
	
	public void adicionarCaminhao(Caminhao caminhao) {
		caminhoes.add(caminhao);
	}
	public void removerCaminhao(Caminhao caminhao) {
		caminhoes.remove(caminhao);
	}
	public void listarCaminhoesDisponiveis() {
		System.out.println("Caminh�es dispon�veis: ");
        for (Caminhao caminhao : caminhoes) {
            if (caminhao.isDisponibilidade()) {
            	System.out.println("Galp�o: " + caminhao.getGalpao()+ " Numero de Serial: " + caminhao.getNumeroSerial() + " Placa: " + caminhao.getPlaca());
            }
        }
	}
}
