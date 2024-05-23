package Trabalho2.Correcao;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
	
	private List<Veiculo> list;

	public Concessionaria() {
		this.list = new ArrayList<Veiculo>();
	}
	
	public void addEstoque(Veiculo veiculo) {
		list.add(veiculo);
	}

	public List<Veiculo> getList() {
		return list;
	}

	public void setList(List<Veiculo> list) {
		this.list = list;
	}
	
}
