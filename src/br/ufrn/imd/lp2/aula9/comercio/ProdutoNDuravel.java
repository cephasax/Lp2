package br.ufrn.imd.lp2.aula9.comercio;

public class ProdutoNDuravel extends Produto{
	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		genero.trim();
		
		if (genero.equals("Alimenticio") || genero.equals("Higiene") || genero.equals("Vestuario") ) {
			this.genero = genero;
		}
		
	}
	
}
