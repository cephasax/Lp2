package br.ufrn.imd.lp2.aula9.locavel;

import java.util.ArrayList;
import java.util.List;

public class LojaCarros {
	
	private List<Veiculo> veiculos;

	public LojaCarros() {
		veiculos = new ArrayList<Veiculo>();
	}

	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
	}

	public void printVeiculos() {
		System.out.println("Lista de Veiculos");
		for(Veiculo v: veiculos){
			System.out.println("Veiculo: " + v.getPlaca());
		}
	}
	
	public void printAlugados() {
		System.out.println("==============Alugados==============");
		for (Veiculo veiculo : veiculos) {
			if (veiculo.isAlugado()) {
				if (veiculo instanceof Moto) {
					System.out.println("Moto: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Partida: " + ((Moto) veiculo).getPartida() + " Cilindradas : "
							+ ((Moto) veiculo).getCilindradas());
				} else {
					System.out.println("Carro: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Motor : " + ((Carro) veiculo).getPotencia() + " Portas: "
							+ ((Carro) veiculo).getPortas());
				}
			}
		}
		System.out.println("==============  Fim  ==============");
	}

	public void printLivres() {

		System.out.println("==============Livres==============");

		for (Veiculo veiculo : veiculos) {
			if (!veiculo.isAlugado()) {
				if (veiculo instanceof Moto) {
					System.out.println("Moto: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Partida: " + ((Moto) veiculo).getPartida() + " Cilindradas : "
							+ ((Moto) veiculo).getCilindradas());
				} else {
					System.out.println("Carro: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Motor : " + ((Carro) veiculo).getPotencia() + " Portas: "
							+ ((Carro) veiculo).getPortas());
				}
			}
		}
		System.out.println("==============  Fim  ==============");
	}
}
