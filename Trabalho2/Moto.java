package Trabalho2;

public class Moto extends Veiculo {

	
	private Integer cilindradas;
	private String partida;
	private Double taxa;
	
	public Moto(String marca, String modelo, Integer anoFabricacao, Double preco, Integer cilindradas, String partida,
			Double taxa) {
		super(marca, modelo, anoFabricacao, preco);
		this.cilindradas = cilindradas;
		this.partida = partida;
		this.taxa = taxa;
	}
	
	public Integer getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	
	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", partida=" + partida + ", taxa=" + taxa + ", getCilindradas()="
				+ getCilindradas() + ", getPartida()=" + getPartida() + ", getTaxa()=" + getTaxa()
				+ ", calcularPrecoVenda()=" + calcularPrecoVenda() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getAnoFabricacao()=" + getAnoFabricacao() + ", getPreco()=" + getPreco()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
	@Override
	public double calcularPrecoVenda() {
		return (super.getPreco() + getTaxa());
	}
	
	
	@Override
	public void imprimirInformacoes() {
		
		System.out.println(toString());
		
		/*
		System.out.println("Moto: " + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()
		+ "\nAno Fabricação: " + getAnoFabricacao() + "\nPreço: " + getPreco() + "\nCilindradas: " 
		+ getCilindradas() + "\nPartida: " + getPartida() + "\nTaxa: " + getTaxa());*/
		
		
	}

	
	
	
}
