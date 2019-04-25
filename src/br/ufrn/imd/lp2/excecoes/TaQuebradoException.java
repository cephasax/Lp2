package br.ufrn.imd.lp2.excecoes;

public class TaQuebradoException extends Exception{

	/**
	 * Adicionado apenas para remo��o do warning sobre a serializa��o
	 */
	private static final long serialVersionUID = 1L;

	public TaQuebradoException() {
		super("Este atuador n�o pode executar sua a��o principal pois esta quebrado.");
	}
	
}
