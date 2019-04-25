package br.ufrn.imd.lp2.aula9.comercio;

public class ProdutoDuravel extends Produto {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		tipo.trim();
		if (tipo.equals("Eletrodometico") || tipo.equals("Eletronico") || tipo.equals("Escritorio") ) {
			this.tipo = tipo;
		}
	}
	
}
