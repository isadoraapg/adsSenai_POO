package Trabalho2.Correcao;

public class Moto extends Veiculo {
	
	private Integer cilindradas;
	
	private String tipoDepartida;
	
	public Moto(String marca, String modelo, Integer anoDeFabricacao, Double preco, Integer cilindradas,
			String tipoDepartida) {
		super(marca, modelo, anoDeFabricacao, preco);
		this.cilindradas = cilindradas;
		this.tipoDepartida = tipoDepartida;
	}

	@Override
	public void calcularPrecoVenda(double taxa) {
		System.out.println(super.getPreco() + taxa);
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipoDepartida() {
		return tipoDepartida;
	}

	public void setTipoDepartida(String tipoDepartida) {
		this.tipoDepartida = tipoDepartida;
	}
	

}
