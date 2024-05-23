package br.com.senai;

import javax.swing.JOptionPane;

public class alunoMain {

	//Crie um programa em java que instancie três objetos dessa classe com informações diferentes
	//e os imprima na tela (criar menu com opção de cadastro e apresentação dos dados).
	
		
	static Aluno aluno1 = new Aluno();
	static Aluno aluno2 = new Aluno();
	static Aluno aluno3 = new Aluno();
	
	public static void main(String[] args) {
		chamarMenu();
		
	}

	
	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Cadastrar Aluno\n2 - Remover Aluno\n3 - Consultar Aluno\n4 - Atualizar Aluno\n5 - Listar Alunos\n6 - Sair"));
			if (opcao == 1) {
				cadastrarAluno();
			} else if (opcao == 2) { 
				removerAluno();
			} else if (opcao == 3) { 
				consultarAluno();
			} else if (opcao == 4) { 
				atualizarAluno();
			} else if (opcao == 5) { 
				listarAluno();
			}
			else {
				System.out.println("\nDigite uma opcao valida!");
			}
		} while (opcao != 6);

		System.out.println("\nPrograma finalizado!");
	}


	
	
	private static void listarAluno() {
		System.out.println("\nNome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Matricula: " + aluno1.getMatricula());
		System.out.println("Turma: " + aluno1.getTurma());
		System.out.println("Disciplina: " + aluno1.getDisciplina());
		
		System.out.println("\nNome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Matricula: " + aluno2.getMatricula());
		System.out.println("Turma: " + aluno2.getTurma());
		System.out.println("Disciplina: " + aluno2.getDisciplina());
		
		System.out.println("\nNome: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());
		System.out.println("Matricula: " + aluno3.getMatricula());
		System.out.println("Turma: " + aluno3.getTurma());
		System.out.println("Disciplina: " + aluno3.getDisciplina());
		
	}
	
	private static void listarAlunos() {
		System.out.println("\nNome: " + aluno1.getNome());
		System.out.println("Id: " + aluno1.getId());
		
		System.out.println("\nNome: " + aluno2.getNome());
		System.out.println("Id: " + aluno2.getId());
		
		System.out.println("\nNome: " + aluno3.getNome());
		System.out.println("Id: " + aluno3.getId());
	}



	private static void atualizarAluno() {
		listarAlunos();
		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno que deseja atualizar: "));

		if (codToUp == 1) {
			aluno1.setId(Integer.valueOf(JOptionPane.showInputDialog("\nDigite o id do aluno: ")));
			aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno1.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno1.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno1.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
			
		} else if(codToUp == 2) {
			aluno2.setId(Integer.valueOf(JOptionPane.showInputDialog("\nDigite o id do aluno: ")));
			aluno2.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno2.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno2.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno2.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno2.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
		}else if(codToUp == 3) {
			aluno3.setId(Integer.valueOf(JOptionPane.showInputDialog("\nDigite o id do aluno: ")));
			aluno3.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno3.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno3.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno3.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno3.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
		}
		
		
		else {
			System.out.println("\nNão há vagas para novos alunos.");
		}
		
	}


	private static void consultarAluno() {
		listarAlunos();
		int codToConsultar = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno que deseja consultar: "));
		if (codToConsultar == 1) {
			System.out.println("Nome: " + aluno1.getNome());
			System.out.println("Idade: " + aluno1.getIdade());
			System.out.println("Matricula: " + aluno1.getMatricula());
			System.out.println("Turma: " + aluno1.getTurma());
			System.out.println("Disciplina: " + aluno1.getDisciplina());
		} else if (codToConsultar == 2) {
			System.out.println("Nome: " + aluno2.getNome());
			System.out.println("Idade: " + aluno2.getIdade());
			System.out.println("Matricula: " + aluno2.getMatricula());
			System.out.println("Turma: " + aluno2.getTurma());
			System.out.println("Disciplina: " + aluno2.getDisciplina());
		}else if (codToConsultar == 3) {
			System.out.println("Nome: " + aluno3.getNome());
			System.out.println("Idade: " + aluno3.getIdade());
			System.out.println("Matricula: " + aluno3.getMatricula());
			System.out.println("Turma: " + aluno3.getTurma());
			System.out.println("Disciplina: " + aluno3.getDisciplina());
		} else {
			System.out.println("Código não existente!");
		}
	}


	private static void removerAluno() {
		listarAlunos();
		int codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o código do aluno que deseja remover: "));
		if (codToRemove == 1) {
			aluno1.setId(0);
			aluno1.setNome("");
			aluno1.setIdade(0);
			aluno1.setMatricula("");
			aluno1.setTurma("");
			aluno1.setDisciplina("");

		} else if (codToRemove == 2) {
			aluno2.setId(0);
			aluno2.setNome("");
			aluno2.setIdade(0);
			aluno2.setMatricula("");
			aluno2.setTurma("");
			aluno2.setDisciplina("");
		}else if (codToRemove == 3) {
			aluno3.setId(0);
			aluno3.setNome("");
			aluno3.setIdade(0);
			aluno3.setMatricula("");
			aluno3.setTurma("");
			aluno3.setDisciplina("");
		} else {
			System.out.println("\nCódigo não existente!");
		}
		
	}


	private static void cadastrarAluno() {
		if (aluno1.getId() == 0) {
			aluno1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno: ")));
			aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno1.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno1.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno1.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
			
		} else if (aluno2.getId() == 0) {
			aluno2.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno: ")));
			aluno2.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno2.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno2.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno2.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno2.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
			
		} else if (aluno3.getId() == 0) {
			aluno3.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno: ")));
			aluno3.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			aluno3.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
			aluno3.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));;
			aluno3.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));;
			aluno3.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno: "));;
		
		} else {
			System.out.println("\nNão há vagas para novos alunos.");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
