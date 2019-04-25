package br.ufrn.imd.lp2.aula9.comercio;

public class ComercioTeste {
	
	public static void main(String[] args) {
		
		Deposito d = new Deposito();
		
		Produto livro  = new Livro();
		livro.setNome("La vai Ana");
		livro.setPreco(50.67);
		
		Produto geladeira  = new Geladeira();
		geladeira.setNome("geladeira simples");
		geladeira.setPreco(900.67);

		Produto pizza  = new Pizza();
		pizza.setNome("pizza vegetariana");
		pizza.setPreco(17.99);
		
		
		System.out.println("Depósito vazio? " + d.depositoVazio());
		System.out.println();
		
		d.addProduto (livro);
		d.addProduto(geladeira);
		d.addProduto(pizza);
		
		System.out.println("Produtos no Depósito: " + d.quantidadeProdutos());
		System.out.println();
		
		Produto pCaro =d.maisCaro();
		System.out.println("Produtos mais caro: " + pCaro.getNome());
		System.out.println("Preço: " + pCaro.getPreco());
		System.out.println();
		
		d.removeProduto(pizza);
		
		System.out.println("Produtos no Depósito: " + d.quantidadeProdutos());
		System.out.println();
		
	}
}
