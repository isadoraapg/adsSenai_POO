package Trabalho2.Correcao;

import java.util.List;

public class Principal {

	public static void main(String args[]) {
		Concessionaria concessionaria = new Concessionaria();
		adicionarDados(concessionaria);
		exibirDados(concessionaria);
	}

	private static void adicionarDados(Concessionaria concessionaria) {
		Carro carro = new Carro("Fiat", "Uno", 2020, 40000.0, 2, 300.0);
		Moto moto = new Moto("Honda", "Biz", 2024, 20000.0, 120, "Auto");

		concessionaria.addEstoque(carro);
		concessionaria.addEstoque(moto);
	}

	private static void exibirDados(Concessionaria concessionaria) {
		List<Veiculo> list = concessionaria.getList();
		for (Veiculo veiculo : list) {
			System.out.println(veiculo.toString());
			veiculo.calcularPrecoVenda(10);
		}
	}

}
