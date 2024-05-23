package Trabalho2;

public class Carro extends Veiculo {


	private Integer numPortas;
	private Double capPortaMalas;
	private Double taxa;


	public Carro(String marca, String modelo, Integer anoFabricacao, Double preco, Integer numPortas,
			Double capPortaMalas, Double taxa) {
		super(marca, modelo, anoFabricacao, preco);
		this.numPortas = numPortas;
		this.capPortaMalas = capPortaMalas;
		this.taxa = taxa;
	}
	
	
	public Integer getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(Integer numPortas) {
		this.numPortas = numPortas;
	}
	public Double getCapPortaMalas() {
		return capPortaMalas;
	}
	public void setCapPortaMalas(Double capPortaMalas) {
		this.capPortaMalas = capPortaMalas;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	
	@Override
	public String toString() {
		return "Carro [numPortas=" + numPortas + ", capPortaMalas=" + capPortaMalas + ", taxa=" + taxa + "]";
	}
	
	
	
	
	@Override
	public double calcularPrecoVenda() {
		return (super.getPreco() + getTaxa());
	}
	
	
	@Override
	public void imprimirInformacoes() {
		System.out.println(toString());
		
		/*System.out.println("Carro: " + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()
		+ "\nAno Fabricação: " + getAnoFabricacao() + "\nPreço: " + getPreco() + "\nPortas: " 
		+ getNumPortas() + "\nCapacidade Porta-malas: " + getCapPortaMalas() + "\nTaxa: " + getTaxa());
		*/
		
	}

	
	
	
	
}
