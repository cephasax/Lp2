package br.ufrn.imd.lp2.excecoes;

public abstract class Atuador {

	protected boolean funcionando;

	public Atuador() {
		this.funcionando = true;
	}

	public void acaoPrincipal(){
		System.out.println("Acão realizada: ");
	};

	public void taQuebrado() {
		this.funcionando = false;
	}

	public boolean isFuncionando() {
		return funcionando;
	}

	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}

}
