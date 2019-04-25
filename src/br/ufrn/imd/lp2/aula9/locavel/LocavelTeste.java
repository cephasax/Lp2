package br.ufrn.imd.lp2.aula9.locavel;

public class LocavelTeste {

	public static void main(String[] args) {
		LojaCarros lc = new LojaCarros();
		
		Veiculo v = new Carro();
		v.setAlugado(true);
		v.setMarca("Pontiac");
		v.setModelo("GT3");
		v.setPlaca("AAA-8888");
		
		Veiculo m = new Moto();
		m.setAlugado(false);
		m.setMarca("Honda");
		m.setModelo("Fan");
		m.setPlaca("BBB-2019");
				
		lc.addVeiculo(v);
		lc.addVeiculo(m);
		
		lc.printVeiculos();
		System.out.println();
		lc.printLivres();
		System.out.println();
		lc.printAlugados();
		System.out.println();
	}

}
