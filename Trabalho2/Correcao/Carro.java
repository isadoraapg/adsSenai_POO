package Trabalho2.Correcao;

public class Carro extends Veiculo {
	
	private Integer numeroDePortas;
	
	private Double capacidadeDoPortamala;

	public Carro(String marca, String modelo, Integer anoDeFabricacao, Double preco, Integer numeroDePortas,
			Double capacidadeDoPortamala) {
		super(marca, modelo, anoDeFabricacao, preco);
		this.numeroDePortas = numeroDePortas;
		this.capacidadeDoPortamala = capacidadeDoPortamala;
	}

	@Override
	public void calcularPrecoVenda(double taxa) {
		System.out.println(super.getPreco() + taxa);
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public Double getCapacidadeDoPortamala() {
		return capacidadeDoPortamala;
	}

	public void setCapacidadeDoPortamala(Double capacidadeDoPortamala) {
		this.capacidadeDoPortamala = capacidadeDoPortamala;
	}

}

