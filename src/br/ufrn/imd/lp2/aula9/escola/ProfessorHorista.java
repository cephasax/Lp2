package br.ufrn.imd.lp2.aula9.escola;

public class ProfessorHorista extends Professor {
	
	private static double VALOR_HORA = 25.0;
	private double horasTrabalhadas;

	public void calcularSalario() {
		setSalario(VALOR_HORA * horasTrabalhadas);
	}

	public static double getVALOR_HORA() {
		return VALOR_HORA;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
