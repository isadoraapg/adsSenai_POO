package Trabalho2.Correcao;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private Integer anoDeFabricacao;
	private Double preco;
	
	public abstract void calcularPrecoVenda(double taxa);
	
	public void imprimirInformacoes() {
		System.out.println(toString());
	}
	
	public Veiculo(String marca, String modelo, Integer anoDeFabricacao, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
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
	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", anoDeFabricacao=" + anoDeFabricacao + ", preco="
				+ preco + "]";
	}
	
}
