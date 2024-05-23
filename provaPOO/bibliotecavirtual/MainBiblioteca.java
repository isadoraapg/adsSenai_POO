package senai.org.br.bibliotecavirtual;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

public class MainBiblioteca {
	private static Biblioteca biblioteca = new Biblioteca();
	private static Livro livro1;
	private static Revista revista1;
	private static MidiaEletronica midia1;
	private static Usuario usuario1;

	public static void main(String[] args) {
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("== Selecione o Setor Desejado ==\n"
					+ "1. Adicionar/Remover.\n"
					+ "2. Outras operações.\n"
					+ "0. Sair"));

			switch (opcao) {
			case 1:
				menuAdicionarRemover();
				break;
			case 2:
				menuOutrasOperacoes();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Encerrando Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		} while (opcao != 0);
	}

	public static void menuAdicionarRemover() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("== Menu Adicionar/Remover ==\n"
				+ "1. Adicionar item\n"
				+ "2. Adicionar usuário\n"
				+ "3. Remover item\n" 
				+ "4. Remover usuario\n"
				+ "0. Voltar"));

		switch (opcao) {
		case 1:
			adicionarItem(biblioteca);
			break;
		case 2:
			adicionarUsuario();
			break;
		case 3:
			removerItem();
			break;
		case 4:
			removerUsuario();
			break;	
		case 0:
			return;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
	}

	public static void menuOutrasOperacoes() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("== Menu Outras Operações ==\n"
				+ "1. Emprestar item\n"
				+ "2. Devolver item\n"
				+ "3. Calcular preço de venda\n"
				+ "4. Informações detalhadas\n"
				+ "5. Verificar disponibilidade\n"
				+ "6. Editar edição\n"
				+ "7. Reproduzir\n"
				+ "8. Baixar arquivo\n"
				+ "9. Gerar catálogo completo\n"
				+ "10. Listar itens disponíveis\n"
				+ "11. Listar usuários\n"
				+ "12. Buscar item\n"
				+ "0. Voltar"));

		switch (opcao) {
		case 1:
			emprestarItem(usuario1, biblioteca);
			break;
		case 2:
			devolverItem(usuario1, biblioteca);
			break;
		case 3:
			calcularPrecoVenda();
			break;
		case 4:
			informacoesDetalhadas();
			break;
		case 5:
			verificarDisponibilidade();
			break;
		case 6:
			editarEdicao();
			break;
		case 7:
			reproduzir();
			break;
		case 8:
			baixarArquivo();
			break;
		case 9:
			gerarCatalogoCompleto();
			break;
		case 10:
			listarItensDisponiveis();
			break;
		case 11:
			listarUsuarios();
			break;
		case 12:
			buscarItem();
			break;
		case 0:
			return;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
	}

	private static void calcularPrecoVenda() {
		System.out.println("o preço do livro é: " + livro1.calcularPrecoVenda() +" R$");
	}

	private static void informacoesDetalhadas() {
		livro1.informacoesDetalhadas();
	}

	public static void removerItem() {
		biblioteca.removerItem(midia1);
		System.out.println("Item removido com sucesso");
	}
	public static void removerUsuario() {
		biblioteca.removerUsuario(usuario1);;
		System.out.println("Usuario removido com sucesso");
	}

	private static void buscarItem() {
		String titulo = JOptionPane.showInputDialog("titulo do item");
		System.out.println(biblioteca.buscarItem(titulo));
	}

	private static void listarUsuarios() {
		System.out.println(biblioteca.listarUsuarios());
	}

	private static void listarItensDisponiveis() {
		System.out.println(biblioteca.listarItensDisponiveis());
	}

	private static void gerarCatalogoCompleto() {
		System.out.println(biblioteca.gerarCatalogoCompleto());
	}

	private static void baixarArquivo() {
		midia1.baixarArquivo();
	}

	private static void reproduzir() {
		midia1.reproduzir();
		Toolkit.getDefaultToolkit().beep();
	}

	private static void editarEdicao() {
		Integer volume = Integer.parseInt(JOptionPane.showInputDialog("volume atualizado"));
		Integer edicao = Integer.parseInt(JOptionPane.showInputDialog("edicao atualizado"));

		revista1.editarEdicao(volume, edicao);
	}
	private static void verificarDisponibilidade() {
		revista1.verificarDisponibilidade();
	}
	public static void devolverItem(Usuario usuario, Biblioteca biblioteca) {
		String titulo = JOptionPane.showInputDialog("titulo do item");

		ItemBiblioteca item = biblioteca.buscarItem(titulo);
		if (item != null) {
			usuario.devolverItem(item, biblioteca);
		} else {
			System.out.println("Item não encontrado.");
		}
	}
	private static void emprestarItem(Usuario usuario, Biblioteca biblioteca) {
		String titulo = JOptionPane.showInputDialog("titulo do item");

		ItemBiblioteca item = biblioteca.buscarItem(titulo);
		if (item != null) {
			usuario.emprestarItem(item, biblioteca);
		} else {
			System.out.println("Item não encontrado.");
		}
	}
	private static void adicionarUsuario() {
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("id do usuario"));
		String nome = JOptionPane.showInputDialog("nome do usuario");
		String email = JOptionPane.showInputDialog("email do usuario");
		String endereco = JOptionPane.showInputDialog("endereco do usuario");

		usuario1 = new Usuario(id, nome, email, endereco);
		biblioteca.adicionarUsuario(usuario1);
	}
	private static void adicionarItem(Biblioteca biblioteca) {
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("== Selecione o Setor Desejado ==\n"
					+ "1. Livro \n"
					+ "2. Revista \n"
					+ "3. MidiaEletronica \n"
					+ "4. Sair"));

			if(opcao == 1) {
				Integer id = Integer.parseInt(JOptionPane.showInputDialog("id do livro"));
				String titulo = JOptionPane.showInputDialog("titulo do livro");
				String autor = JOptionPane.showInputDialog("autor do livro");
				Integer anoPublicacao = Integer.parseInt(JOptionPane.showInputDialog("anoPublicacao do livro"));
				String genero = JOptionPane.showInputDialog("genero do livro");
				Integer numPaginas = Integer.parseInt(JOptionPane.showInputDialog("numPaginas do livro"));
				livro1 = new Livro(id, titulo, autor, anoPublicacao, genero, numPaginas);
				biblioteca.adicionarItem(livro1);
			}else if(opcao == 2) {
				Integer id = Integer.parseInt(JOptionPane.showInputDialog("id da revista"));
				String titulo = JOptionPane.showInputDialog("titulo da revista");
				String autor = JOptionPane.showInputDialog("autor da revista");
				Integer anoPublicacao = Integer.parseInt(JOptionPane.showInputDialog("anoPublicacao da revista"));
				Integer volume = Integer.parseInt(JOptionPane.showInputDialog("volume da revista"));
				Integer edicao = Integer.parseInt(JOptionPane.showInputDialog("edicao da revista"));
				revista1 = new Revista(id, titulo, autor, anoPublicacao, volume, edicao);
				biblioteca.adicionarItem(revista1);

			}else if(opcao == 3) {
				Integer id = Integer.parseInt(JOptionPane.showInputDialog("id da midia"));
				String titulo = JOptionPane.showInputDialog("titulo da midia");
				String autor = JOptionPane.showInputDialog("autor da midia");
				Integer anoPublicacao = Integer.parseInt(JOptionPane.showInputDialog("anoPublicacao da midia"));
				String formato = JOptionPane.showInputDialog("formato da midia");
				String tamanhoArquivo = JOptionPane.showInputDialog("tamanhoArquivo da midia");

				midia1 = new MidiaEletronica(id, titulo, autor, anoPublicacao, formato, tamanhoArquivo);
				biblioteca.adicionarItem(midia1);

			}
		} while (opcao != 4);



		
	}
}

