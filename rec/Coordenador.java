package br.com.senai.rec;

public class Coordenador extends Funcionario {

	private String areaCoordenacao;
	private Double gratificacao;
	
	public Coordenador(String nome, Integer idade, String genero, Integer matricula, Double salarioBase,
			String areaCoordenacao, Double gratificacao) {
		super(nome, idade, genero, matricula, salarioBase);
		this.areaCoordenacao = areaCoordenacao;
		this.gratificacao = gratificacao;
	}

	public String getAreaCoordenacao() {
		return areaCoordenacao;
	}

	public void setAreaCoordenacao(String areaCoordenacao) {
		this.areaCoordenacao = areaCoordenacao;
	}

	public Double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCargo: Coordenador \nÁrea Coordenação: " + areaCoordenacao + "\nGratificacao: " + gratificacao;
	}

	@Override
	public double calcularSalario() {
		//SALARIO BASE + GRATIFICACAO
		return getSalarioBase() + getGratificacao();
	}
	
	
}
