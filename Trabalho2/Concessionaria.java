package Trabalho2;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {


	private ArrayList<Veiculo> veiculosDisponiveis;
	
	/*private List<Veiculo> list; 
	public Concessionaria(ArrayList list) {
		this.list = new ArrayList<Veiculo>();
	}
	
	public void addEstoque(Veiculo veiculo) {
		list.add(veiculo);
	}
	
	
	
	*/
	

	public Concessionaria() {
		this.veiculosDisponiveis = new ArrayList<>();
	}


	public void adicionarVeiculo(Veiculo veiculo) {
		veiculosDisponiveis.add(veiculo);
	}
	public void listarVeiculos() {
		for (Veiculo veiculo : veiculosDisponiveis) {
			veiculo.imprimirInformacoes();
			System.out.println();

		}
	}
}