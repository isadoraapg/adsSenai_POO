package br.com.senai.rec;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		//PROFESSOR
		String nomeProf = JOptionPane.showInputDialog("Digite o nome do(a) Professor(a): ");
		Integer idadeProf = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) Professor(a): "));
		String generoProf = JOptionPane.showInputDialog("Digite o gênero do(a) Professor(a): ");
		Integer matriculaProf = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do(a) Professor(a): "));
		Double salarioBaseProf = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do(a) Professor(a): "));
		String disciplinaProf = JOptionPane.showInputDialog("Digite a disciplina do(a) Professor(a): ");
		Integer cargaHorariaProf = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do(a) Professor(a): "));
		Double valorHoraAulaProf = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora-aula do(a) Professor(a): "));
		Funcionario professor = new Professor(nomeProf, idadeProf, generoProf, matriculaProf, salarioBaseProf, disciplinaProf, cargaHorariaProf, valorHoraAulaProf);

		System.out.println(professor.toString() + "\nSalário Final: " + professor.calcularSalario() + "\n");  
		
		//COORDENADOR
		String nomeCoord = JOptionPane.showInputDialog("Digite o nome do(a) Coordenador(a): ");
		Integer idadeCoord = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) Coordenador(a): "));
		String generoCoord = JOptionPane.showInputDialog("Digite o gênero do(a) Coordenador(a): ");
		Integer matriculaCoord = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do(a) Coordenador(a): "));
		Double salarioBaseCoord = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do(a) Coordenador(a): "));
		String areaCoord = JOptionPane.showInputDialog("Digite a área de coordenação do(a) Coordenador(a): ");
		Double gratificacaoCoord = Double.parseDouble(JOptionPane.showInputDialog("Digite a gratificação do(a) Coordenador(a): "));
		Funcionario coordenador = new Coordenador(nomeCoord, idadeCoord, generoCoord, matriculaCoord, salarioBaseCoord, areaCoord, gratificacaoCoord);
		
		System.out.println(coordenador.toString() + "\nSalário Final: " + coordenador.calcularSalario() + "\n");
		
		//INSPETOR
		String nomeInsp = JOptionPane.showInputDialog("Digite o nome do(a) Inspetor(a): ");
		Integer idadeInsp = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) Inspetor(a): "));
		String generoInsp = JOptionPane.showInputDialog("Digite o gênero do(a) Inspetor(a): ");
		Integer matriculaInsp = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do(a) Inspetor(a): "));
		Double salarioBaseInsp = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do(a) Inspetor(a): "));
		String areaInsp = JOptionPane.showInputDialog("Digite a área de atuação do(a) Inspetor(a): ");
		Double addInsalubInsp = Double.parseDouble(JOptionPane.showInputDialog("Digite o adicional de insalubridade do(a) Inspetor(a): "));
		Funcionario inspetor = new Inspetor(nomeInsp, idadeInsp, generoInsp, matriculaInsp, salarioBaseInsp, areaInsp, addInsalubInsp);
		
		System.out.println(inspetor.toString() + "\nSalário Final: " + inspetor.calcularSalario()+ "\n");
		
		//DIRETOR
		String nomeDir = JOptionPane.showInputDialog("Digite o nome do(a) Diretor(a): ");
		Integer idadeDir = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) Diretor(a): "));
		String generoDir = JOptionPane.showInputDialog("Digite o gênero do(a) Diretor(a): ");
		Integer matriculaDir = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do(a) Diretor(a): "));
		Double salarioBaseDir = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do(a) Diretor(a): "));
		String setorDir = JOptionPane.showInputDialog("Digite o setor do(a) Diretor(a): ");
		Double bonusDir = Double.parseDouble(JOptionPane.showInputDialog("Digite o bônus do(a) Diretor(a): "));
		Funcionario diretor = new Diretor(nomeDir, idadeDir, generoDir, matriculaDir, salarioBaseDir, setorDir, bonusDir);
		
		System.out.println(diretor.toString() + "\nSalário Final: " + diretor.calcularSalario() + "\n");
	}

}
