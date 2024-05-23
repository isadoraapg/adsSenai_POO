package Trabalho2;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Double preco;
	
	
	public Veiculo(String marca, String modelo, Integer anoFabricacao, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", preco="
				+ preco + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAnoFabricacao()="
				+ getAnoFabricacao() + ", getPreco()=" + getPreco() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	public abstract double calcularPrecoVenda();
	

	public void imprimirInformacoes() {
		toString();
	}
	
	
	
	
}
