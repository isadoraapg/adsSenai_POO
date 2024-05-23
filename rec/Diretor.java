package br.com.senai.rec;

public class Diretor extends Funcionario {

	private String setor;
	private Double bonus;
	
	public Diretor(String nome, Integer idade, String genero, Integer matricula, Double salarioBase, String setor,
			Double bonus) {
		super(nome, idade, genero, matricula, salarioBase);
		this.setor = setor;
		this.bonus = bonus;
	}


	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCargo: Diretor \nSetor: " + setor + "\nBônus: " + bonus;
	}

	@Override
	public double calcularSalario() {
		//SALARIO BASE + BONUS
		return getSalarioBase() + getBonus();
	}

}
