package br.ufrn.imd.lp2.excecoes;

public class Freio extends Atuador{

	//A classe freio nao é a responsável por tratar a exceção
	//ela apenas passa a bola pra alguem (super classe, nesse caso) pode(???) resolver
	
	@Override
	public void acaoPrincipal() /*throws TaQuebradoException*/ {
		super.acaoPrincipal();
		
		if(this.isFuncionando()) {
			System.out.println("\t\t Frear");
		}
		else {
			throw new TaQuebradoException();
		}
	}
	
}
