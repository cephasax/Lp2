package br.ufrn.imd.lp2.excecoes;

public class TaQuebradoException extends Exception{

	/**
	 * Adicionado apenas para remoção do warning sobre a serialização
	 */
	private static final long serialVersionUID = 1L;

	public TaQuebradoException() {
		super("Este atuador não pode executar sua ação principal pois esta quebrado.");
	}
	
}
