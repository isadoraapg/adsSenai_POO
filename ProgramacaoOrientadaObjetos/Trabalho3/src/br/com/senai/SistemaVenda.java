package br.com.senai;

import javax.swing.JOptionPane;

public class SistemaVenda {


	static Produto produto1 = new Produto();
	static Vendedor vendedor1 = new Vendedor();
	static Cliente cliente1 = new Cliente();
	static Venda venda1 = new Venda();


	public static void main(String[] args) {
		chamarMenu();
	}


	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Produto\n2 - Vendedor\n3 - Cliente\n4 - Venda\n5 - Sair\n"));
			if (opcao == 1) {
				chamarMenuProd();
			} else if (opcao == 2) { 
				chamarMenuVendedor();
			} else if (opcao == 3) { 
				chamarMenuCliente();
			} else if (opcao == 4) { 
				chamarMenuVenda();
			}
			else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 5);

		System.out.println("bye!!!");
	}



	//PRODUTO
	private static void chamarMenuProd() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar produto\n2 - Remover produto\n3 - Consultar produto\n4 - Atualizar produto\n5 - Listar produtos\n6 - Voltar\n7 - Sair"));
			if (opcao == 1) {
				cadastrarProduto();
			} else if (opcao == 2) { 
				removerProduto();
			} else if (opcao == 3) { 
				consultarProduto();
			} else if (opcao == 4) { 
				atualizarProduto();
			} else if (opcao == 5) { 
				listarProduto();
			} else if(opcao == 6) {
				chamarMenu();
			}
			else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 7);

		System.out.println("Programa encerrado!!!");
	}


	public static void cadastrarProduto() {

		if (produto1.getId() == 0) {

			produto1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto 1:")));
			produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto 1:"));
			produto1.setPreco(Double.valueOf(JOptionPane.showInputDialog("Digite o preco do produto 1:")));
			produto1.setQtd(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto 1:")));
		} else {
			System.out.println("Estoque todo ocupado");
		}
	}

	public static void removerProduto() {
		int codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que deseja remover"));
		if (codToRemove == 1) {
			produto1.setId(0);
			produto1.setNome("");			
			produto1.setPreco(0);
			produto1.setQtd(0);

		} else {
			System.out.println("codigo nao existente");
		}
	}

	public static void consultarProduto() {
		int codToConsultar = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que deseja consultar"));
		if (codToConsultar == 1) {
			System.out.println(produto1.getId());
			System.out.println(produto1.getNome());
			System.out.println(produto1.getPreco());
			System.out.println(produto1.getQtd());
		} else {
			System.out.println("codigo nao existente");
		}
	}

	public static void atualizarProduto() {
		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que deseja atualizar"));

		if (codToUp == 1) {
			produto1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto 1")));
			produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto 1"));
			produto1.setPreco(Double.valueOf(JOptionPane.showInputDialog("Digite o preco do produto 1:")));
			produto1.setQtd(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto 1:")));

		} else {
			System.out.println("Estoque todo ocupado");
		}
	}

	public static void listarProduto() {
		System.out.println(produto1.getId());
		System.out.println(produto1.getNome());
		System.out.println(produto1.getPreco());
		System.out.println(produto1.getQtd());

	}


	//VENDEDOR
	private static void chamarMenuVendedor() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar vendedor\n2 - Remover vendedor\n3 - Consultar vendedor\n4 - Atualizar vendedor\n5 - Listar vendedor\n6 - Voltar\n7 - Sair"));
			if (opcao == 1) {
				cadastrarVendedor();
			} else if (opcao == 2) { 
				removerVendedor();
			} else if (opcao == 3) { 
				consultarVendedor();
			} else if (opcao == 4) { 
				atualizarVendedor();
			} else if (opcao == 5) { 
				listarVendedor();
			} else if(opcao == 6) {
				chamarMenu();
			}
			else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 7);

		System.out.println("Programa encerrado!!!");
	}

	public static void cadastrarVendedor() {

		if (vendedor1.getId() == 0) {

			vendedor1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o id do vendedor 1:")));
			vendedor1.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor 1:"));
			vendedor1.setEmail(JOptionPane.showInputDialog("Digite o email do vendedor 1:"));
			vendedor1.setTelefone(JOptionPane.showInputDialog("Digite a telefone do vendedor 1:"));
		} else {
			System.out.println("Vendedor todo ocupado");
		}
	}

	public static void removerVendedor() {
		int codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do vendedor que deseja remover"));
		if (codToRemove == 1) {
			vendedor1.setId(0);
			vendedor1.setNome("");			
			vendedor1.setEmail("");
			vendedor1.setTelefone("");

		} else {
			System.out.println("Id nao existente");
		}
	}

	public static void consultarVendedor() {
		int codToConsultar = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do vendedor que deseja consultar"));
		if (codToConsultar == 1) {
			System.out.println(vendedor1.getId());
			System.out.println(vendedor1.getNome());
			System.out.println(vendedor1.getEmail());
			System.out.println(vendedor1.getTelefone());
		} else {
			System.out.println("Id nao existente");
		}
	}

	public static void atualizarVendedor() {
		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o Id que deseja atualizar"));

		if (codToUp == 1) {
			vendedor1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o Id do vendedor 1")));
			vendedor1.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor 1"));
			vendedor1.setEmail(JOptionPane.showInputDialog("Digite o email do vendedor 1:"));
			vendedor1.setTelefone(JOptionPane.showInputDialog("Digite a telefone do vendedor 1:"));

		} else {
			System.out.println("Vendedor todo ocupado");
		}
	}

	public static void listarVendedor() {
		System.out.println(vendedor1.getId());
		System.out.println(vendedor1.getNome());
		System.out.println(vendedor1.getEmail());
		System.out.println(vendedor1.getTelefone());

	}




	//CLIENTE
	private static void chamarMenuCliente() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar cliente\n2 - Remover cliente\n3 - Consultar cliente\n4 - Atualizar cliente\n5 - Listar cliente\n6 - Voltar\n7 - Sair"));
			if (opcao == 1) {
				cadastrarCliente();
			} else if (opcao == 2) { 
				removerCliente();
			} else if (opcao == 3) { 
				consultarCliente();
			} else if (opcao == 4) { 
				atualizarCliente();
			} else if (opcao == 5) { 
				listarCliente();
			} else if(opcao == 6) {
				chamarMenu();
			}
			else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 7);

		System.out.println("Programa encerrado!!!");
	}

	public static void cadastrarCliente() {

		if (cliente1.getId() == 0) {

			cliente1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o id do cliente 1:")));
			cliente1.setNome(JOptionPane.showInputDialog("Digite o nome do cliente 1:"));
			cliente1.setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente 1:"));
			cliente1.setEmail(JOptionPane.showInputDialog("Digite o email do cliente 1:"));
			cliente1.setTelefone(JOptionPane.showInputDialog("Digite a telefone do cliente 1:"));
		} else {
			System.out.println("Cliente todo ocupado");
		}
	}

	public static void removerCliente() {
		int codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do cliente que deseja remover"));
		if (codToRemove == 1) {
			cliente1.setId(0);
			cliente1.setNome("");
			cliente1.setCpf("");
			cliente1.setEmail("");
			cliente1.setTelefone("");

		} else {
			System.out.println("Id nao existente");
		}
	}

	public static void consultarCliente() {
		int codToConsultar = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do cliente que deseja consultar"));
		if (codToConsultar == 1) {
			System.out.println(cliente1.getId());
			System.out.println(cliente1.getNome());
			System.out.println(cliente1.getCpf());
			System.out.println(cliente1.getEmail());
			System.out.println(cliente1.getTelefone());
		} else {
			System.out.println("Id nao existente");
		}
	}

	public static void atualizarCliente() {
		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o Id que deseja atualizar"));

		if (codToUp == 1) {
			cliente1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o Id do cliente 1")));
			cliente1.setNome(JOptionPane.showInputDialog("Digite o nome do cliente 1"));
			cliente1.setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente 1"));
			cliente1.setEmail(JOptionPane.showInputDialog("Digite o email do cliente 1:"));
			cliente1.setTelefone(JOptionPane.showInputDialog("Digite a telefone do cliente 1:"));

		} else {
			System.out.println("Cliente todo ocupado");
		}
	}

	public static void listarCliente() {
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getEmail());
		System.out.println(cliente1.getTelefone());

	}	





	//VENDA
	private static void chamarMenuVenda() {
		int opcao;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar venda\n2 - Remover venda\n3  - Listar venda\n4 - Voltar\n5 - Sair"));
			if (opcao == 1) {
				cadastrarVenda();
			} else if (opcao == 2) { 
				removerVenda();
			} else if (opcao == 3) {  
				listarVenda();
			} else if(opcao == 4) {
				chamarMenu();
			}
			else {
				System.out.println("Digite uma opcao valida!");
			}
		} while (opcao != 5);
		System.out.println("Programa encerrado!!!");
	}


	private static void cadastrarVenda() {
		if (venda1.getId() == 0) {
			venda1.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o código da venda: ")));
			venda1.setDataVenda(JOptionPane.showInputDialog("Digite a data da venda: "));
			venda1.setQtd(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade que foi vendida: ")));
			venda1.setItensVenda(produto1);
		} else {
			System.out.println("O estoque está cheio, remova um produto.");
		}
		produto1.setQtd(produto1.getQtd() - venda1.getQtd() );

	}


	private static void removerVenda() {
		int codigo = Integer.valueOf(JOptionPane.showInputDialog("Digite o código da venda que deseja remover: "));
		if (venda1.getId() == codigo) {
			venda1 = new Venda();
		} else {
			System.out.println("Venda não encontrada.");
		}

	}


	private static void listarVenda() {
		System.out.println(venda1.getId());
		System.out.println(venda1.getQtd());
		System.out.println(venda1.getDataVenda());


	}


	//modelagem, programa principal, classes produto, vendedor, venda e cliente



}
