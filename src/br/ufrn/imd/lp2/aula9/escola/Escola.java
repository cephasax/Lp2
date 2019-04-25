package br.ufrn.imd.lp2.aula9.escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	
	private List<Professor> professores;
	
	public Escola() {
		this.professores = new ArrayList<Professor>();
	}
	
	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
	public void removeProfessor(Professor p) {
		professores.remove(p);
	}
	
	public int quantidadeDeProfessores() {
		return professores.size();
	}
	
	public Professor maiorSalario() {
		Professor p = null;
		if (professores.size() > 0) {
			double maior = 0;
			for(int i = 0; i < professores.size(); i++) {
				if(professores.get(i).getSalario() >= maior) {
					p = professores.get(i);
					maior = p.getSalario();
				}
			}
		}
		return p;
	}
}
