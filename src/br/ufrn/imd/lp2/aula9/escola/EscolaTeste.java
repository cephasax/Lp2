package br.ufrn.imd.lp2.aula9.escola;

public class EscolaTeste {

	public static void main(String[] args) {
		Escola escola = new Escola();
		
		Professor prof1 = new ProfessorHorista();
		prof1.setIdade(35);
		prof1.setMatricula("20150234");
		prof1.setNome("Joao da Hora");
		prof1.setSalario(3200);
		
		Professor prof2 = new ProfessorIntegral();
		prof2.setIdade(42);
		prof2.setMatricula("20110001");
		prof2.setNome("Senhor Tibúrcio");
		prof2.setSalario(4800);
		
		escola.addProfessor(prof1);
		escola.addProfessor(prof2);
		
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
		System.out.println();
		Professor maiorSalario = escola.maiorSalario();
		System.out.println("Professor com maior salário: " + maiorSalario.getNome());
		System.out.println("salário dele: " + maiorSalario.getSalario());
		
		Professor prof3 = new ProfessorIntegral();
		prof3.setIdade(75);
		prof3.setMatricula("19800001");
		prof3.setNome("Veide Mais");
		prof3.setSalario(11500);
		
		escola.addProfessor(prof3);
		System.out.println();
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
		
		escola.removeProfessor(prof3);
		System.out.println();
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
	}

}
