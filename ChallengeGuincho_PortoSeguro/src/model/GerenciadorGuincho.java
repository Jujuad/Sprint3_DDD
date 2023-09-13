package model;

import java.util.ArrayList;
public class GerenciadorGuincho {
	private ArrayList<Guincho> guinchos = new ArrayList<Guincho>();
	
	public void adicionarGuincho(Guincho guincho) {
		guinchos.add(guincho);
	}
	public void removerGuincho(Guincho guincho) {
		guinchos.remove(guincho);

	}
	public void listarGuinchosDisponiveis() {
		System.out.println("Guinchos disponíveis: ");
        for (Guincho guincho : guinchos) {
            if (guincho.isDisponibilidade()) {
            	System.out.println("Setor: " + guincho.getSetor() + " Unidade: " + guincho.getUnidade());
            }
        }
	}
}
