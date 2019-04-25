package br.ufrn.imd.lp2.excecoes;

import java.util.ArrayList;

public class Carro {

	private ArrayList<Acessorio> acessorios;
	private ArrayList<Atuador> atuadores;

	public Carro() {
		this.acessorios = new ArrayList<Acessorio>();
		this.atuadores = new ArrayList<Atuador>();
	}

	public ArrayList<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(ArrayList<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public ArrayList<Atuador> getAtuadores() {
		return atuadores;
	}

	public void setAtuadores(ArrayList<Atuador> atuadores) {
		this.atuadores = atuadores;
	}

}
