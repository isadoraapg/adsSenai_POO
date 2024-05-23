package Trabalho2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concessionaria concessionaria = new Concessionaria();

		Carro carro = new Carro(null, null, 4, 20.0, null, 200.0, null);
		carro.setMarca("Toyota");
		carro.setModelo("China");
		carro.setAnoFabricacao(2000);
		carro.setPreco(20000.0);
		concessionaria.adicionarVeiculo(carro);

		Moto moto = new Moto(null, null, 150, null, null, "Elétrica", 150.0);
		moto.setMarca("Honda");
		moto.setModelo("Fan");
		moto.setAnoFabricacao(2013);
		moto.setPreco(10000.0);
		concessionaria.adicionarVeiculo(moto);

		System.out.println("Veículos disponíveis na concessionária:");
        concessionaria.listarVeiculos();
        System.out.println("Preço de venda moto R$ "  + moto.calcularPrecoVenda());
        System.out.println("Preço de venda Carro R$ " + carro.calcularPrecoVenda());



	}

}
