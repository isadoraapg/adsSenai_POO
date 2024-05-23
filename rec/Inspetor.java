package br.com.senai.rec;

public class Inspetor extends Funcionario {

	private String areaAtuacao;
	private Double adicionalInsalubridade;
	
	public Inspetor(String nome, Integer idade, String genero, Integer matricula, Double salarioBase,
			String areaAtuacao, Double adicionalInsalubridade) {
		super(nome, idade, genero, matricula, salarioBase);
		this.areaAtuacao = areaAtuacao;
		this.adicionalInsalubridade = adicionalInsalubridade;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public Double getAdicionalInsalubridade() {
		return adicionalInsalubridade;
	}

	public void setAdicionalInsalubridade(Double adicionalInsalubridade) {
		this.adicionalInsalubridade = adicionalInsalubridade;
	}


	@Override
	public String toString() {
		return super.toString() + "\nCargo: Inspetor \nÁrea Atuação: " + areaAtuacao + "\nAdicional Insalubridade: " + adicionalInsalubridade;
	}

	@Override
	public double calcularSalario() {
		//SALARIO BASE + ADICIONAL INSALUBRIDADE
		return getSalarioBase() + getAdicionalInsalubridade();
	
	}

}
