package ExercEnderecoPessoa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Main {

	static List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();


	public static void main(String[] args) {
		chamarMenu();
	}

	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("1 cadastrar \n 2 remover \n 3 atualizar \n 4 consultar \n 5 pesquisa avançada \n 6 sair"));
			if (opcao == 1) {
				cadastrar();
			} else if (opcao == 2) { 
				remover();
			} else if (opcao == 3) { 
				atualizar();
			} else if (opcao == 4) { 
				consultar();
			} else if (opcao == 5) { 
				pesquisarAvancadamente();
			}
			else {
				System.out.println("Digite uma opcao valida");
			}
		} while (opcao != 6);

		System.out.println("bye!!!");
	}


	public static void cadastrar() {

		Integer codigo = Integer.valueOf(JOptionPane.showInputDialog("Digite o COD: "));
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a idade: "));


		List<Endereco> ListaDeEnderecos = new ArrayList<Endereco>();

		do {
			String rua = JOptionPane.showInputDialog("Digite a rua: ");
			String cidade = JOptionPane.showInputDialog("Digite a cidade: ");
			String estado = JOptionPane.showInputDialog("Digite o estado: ");  

			Endereco endereco = new Endereco(rua,cidade,estado);
			ListaDeEnderecos.add(endereco);

		} while (Integer.valueOf(JOptionPane.showInputDialog("Deseja cadastrar um novo " + "endereço? 1-Sim 2-Não" )) == 1);

		Pessoa pessoa = new Pessoa(codigo,nome,idade, ListaDeEnderecos);

		listaDePessoas.add(pessoa);
		System.out.println("Pessoa adicionada com sucesso!");

	}



	public static void remover() {

		Integer codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que deseja remover: "));

		for (Pessoa pessoa : listaDePessoas) { 
			if (pessoa.getCodigo() == codToRemove) {
				listaDePessoas.remove(pessoa);
				System.out.println("Pessoa removida com sucesso!");
			}
		}

		System.out.println("cod nao existente");

	}


	public static void atualizar() {

		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o cod que deseja atualizar: "));

		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getCodigo() == codToUp) {
				pessoa.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o COD: ")));
				pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
				pessoa.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade: ")));


				List<Endereco> listaDeEnderecos = new ArrayList<Endereco>();

				do {
					String rua = JOptionPane.showInputDialog("Digite a rua: ");
					String cidade = JOptionPane.showInputDialog("Digite a cidade: ");
					String estado = JOptionPane.showInputDialog("Digite o estado: ");  

					Endereco endereco = new Endereco(rua,cidade,estado);
					listaDeEnderecos.add(endereco);

				} while (Integer.valueOf(JOptionPane.showInputDialog("Deseja cadastrar um novo " + "endereço? 1-Sim 2-Não" )) == 1);

				pessoa.setEndereco(listaDeEnderecos);
			}
		}
	}


	public static void consultar() {

		int codToConsult = Integer.valueOf(JOptionPane.showInputDialog("Digite o cod que deseja consultar"));

		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getCodigo() == codToConsult) {
				System.out.println (pessoa.toString ()); 
			}
		}
	}

	private static void pesquisarAvancadamente() {

		String ruaDesejada = JOptionPane.showInputDialog("Digite a rua que deseja consultar: ");

		for (Pessoa pessoa : listaDePessoas) {     //varrendo a lista de pessoas
			List<Endereco> listaDeEnderecos = pessoa.getEndereco();	    //varrendo a lista de endereços dentro de pessoa
			for(Endereco endereco : listaDeEnderecos) {               
				if(endereco.getRua().equalsIgnoreCase(ruaDesejada)) {
					System.out.println (pessoa.toString ()); 
				}
			}

		}
	} 
}
