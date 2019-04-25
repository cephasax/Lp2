package br.ufrn.imd.lp2.aula9.comercio;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
	private List <Produto> produtos;
	
	public Deposito() {
		produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto p) {
		produtos.add(p);
	}
	
	public void removeProduto(Produto p) {
		produtos.remove(p);
	}
	
	public int quantidadeProdutos() {
		return produtos.size();
	}
	
	public boolean depositoVazio() {
		return produtos.size()==0 ? true:false;
	}
	
	public Produto maisCaro() {
		Produto p = null;
		if (produtos.size() > 0) {
			double maior = 0;
			for(int i = 0; i < produtos.size(); i++) {
				if(produtos.get(i).getPreco() >= maior) {
					p = produtos.get(i);
					maior = p.getPreco();
				}
			}
		}
		return p;
	}

}
