package trabalho;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Estoque {
	
	static List<Produto> listaDeProdutos = new ArrayList<Produto>();
	//construtor: primeiro metodo (antes do main)
		
		public static void main(String[] args) {	
			chamarMenu();
		}

		private static void chamarMenu() {
			int opcao = 0;
			do {
				opcao = Integer.valueOf(JOptionPane.showInputDialog("MENU:\n1 - Adicionar produto\n2 - Remover produto\n3 - Consultar produto\n4 - Atualizar produto\n5 - Listar produtos\n6 - Sair"));
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
				}else {
					System.out.println("Digite uma opcao valida!");
				}
			} while (opcao != 6);

			System.out.println("bye!!!");
		}

		private static void cadastrar() {
			Produto produto = new Produto();
			produto.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto:")));
			produto.setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
			produto.setDescricao(JOptionPane.showInputDialog("Digite a descricao do produto:"));
			produto.setQuantidade(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto:")));
			produto.setPreco(Double.valueOf(JOptionPane.showInputDialog("Digite o preco do produto 1:")));		
			listaDeProdutos.add(produto);				
		}

		private static void remover() {
			
			//removendo pelo index
			Integer codToRemove = (Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto que deseja remover:")));
			
			for(int i = 0; i < listaDeProdutos.size(); i++) {
				Produto codigo = listaDeProdutos.get(i);
				if(codigo.getCodigo().equals(codToRemove)) {
					listaDeProdutos.remove(i);
				}				
			}
			
			//CORREÇÃO: removendo pelo objeto
//			Integer codToRemove = (Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto que deseja remover:")));
//			for(Produto produto : listaDeProdutos) {
//				if(produto.getCodigo()== codToRemove) {
//					listaDeProdutos.remove(produto);
//				}
//			}
		}
		
		private static void consultar() {
			Integer cod = (Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto que deseja consultar:")));
			
			for (Produto produto : listaDeProdutos) {
				if(produto.getCodigo() == cod) {
					System.out.println(produto.toString());
				}
				
			}
		}
		
		private static void listar() {
			for (Produto produto : listaDeProdutos) {
	            System.out.println(produto.toString());
			}
		}
		
		private static void atualizar() {
			Integer codToRefresh = (Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto que deseja atualizar:")));
			
			for(int i = 0; i < listaDeProdutos.size(); i++) {
				Produto codigo = listaDeProdutos.get(i);
				if(codigo.getCodigo().equals(codToRefresh)) {
					codigo.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto:")));
					codigo.setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
					codigo.setDescricao(JOptionPane.showInputDialog("Digite a descricao do produto:"));
					codigo.setQuantidade(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto:")));
					codigo.setPreco(Double.valueOf(JOptionPane.showInputDialog("Digite o preco do produto 1:")));
					listaDeProdutos.set(i, codigo);
				}				
			}
						
			Integer cod = (Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto que deseja atualizar:")));
			for (Produto produto : listaDeProdutos) {
				if(produto.getCodigo() == cod) {
					produto.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo do produto:")));
					produto.setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
					produto.setDescricao(JOptionPane.showInputDialog("Digite a descricao do produto:"));
					produto.setQuantidade(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto:")));
					produto.setPreco(Double.valueOf(JOptionPane.showInputDialog("Digite o preco do produto 1:")));
				}				
			}			
		}	
	}