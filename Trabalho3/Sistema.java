package Trabalho3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Sistema {

	static List<Pessoa> listaDePessoa = new ArrayList<Pessoa>();


	public static void main(String[] args) {
		chamarMenu();
	}

	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar pessoa\n2 - Remover pessoa\n3 - Consultar pessoa\n4 - Atualizar pessoa\n5 - Listar pessoa\n6 - Buscar por endereco\n7 - Sair"));
			if (opcao == 1) {
				cadastrar();
			} else if (opcao == 2) { 
				remover();
			} else if (opcao == 3) { 
				consultar();
			}else if (opcao == 4) {
				atualizar();
			}else if (opcao == 5) { 
				listar();

			}else if (opcao == 6) {
				buscarPorEndereco();

			}else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 7);

		System.out.println("bye!!!");
	}

	private static void cadastrar() {			
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
		String rua = JOptionPane.showInputDialog("Digite a rua do endereço:");
		String cidade = JOptionPane.showInputDialog("Digite a cidade do endereço:");
		String estado = JOptionPane.showInputDialog("Digite o estado do endereço:");
				
		Pessoa pessoa = new Pessoa(nome, idade, new Endereco(rua, cidade, estado));

		listaDePessoa.add(pessoa);		
	}

	private static void remover() {
		String pessoaToRemove = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja remover:");

		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getNome().equals(pessoaToRemove)) {
				listaDePessoa.remove(pessoa);
				JOptionPane.showMessageDialog(null, "Pessoa removida");
				return;
			}
		}

		JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
	}


	private static void consultar() {
		String pessoaToConsultar = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja consultar:");

		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getNome().equals(pessoaToConsultar)) {
				System.out.println(pessoa.toString());
			}
		}
	}




	private static void atualizar() {
		String pessoaToRefresh = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja atualizar:");

		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getNome().equals(pessoaToRefresh)) {
				String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
				int novaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova idade:"));
				String novaRua = JOptionPane.showInputDialog("Digite a nova rua do endereço:");
				String novaCidade = JOptionPane.showInputDialog("Digite a nova cidade do endereço:");
				String novoEstado = JOptionPane.showInputDialog("Digite o novo estado do endereço");

				pessoa.setNome(novoNome);
				pessoa.setIdade(novaIdade);
				pessoa.getEndereco().setRua(novaRua);
				pessoa.getEndereco().setCidade(novaCidade);
				pessoa.getEndereco().setEstado(novoEstado);

				JOptionPane.showMessageDialog(null, "Informações da pessoa atualizadas com sucesso!");
				return;
			}
		}

		JOptionPane.showMessageDialog(null, "Pessoa não encontrada na lista.");
	}


	private static void listar() {
		for (Pessoa pessoa : listaDePessoa) {
			System.out.println(pessoa.toString());
		}
	}

	private static void buscarPorEndereco() {

		String buscarRua = JOptionPane.showInputDialog("Digite o endereco:");

		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getEndereco().getRua().equals(buscarRua)) {
				System.out.println(pessoa.toString());

				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Pessoa não encontrada");

	}
}