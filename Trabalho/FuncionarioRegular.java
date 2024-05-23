package Trabalho;

public class FuncionarioRegular extends Funcionarios {

	private Double bonus;

	public FuncionarioRegular(String nome, Integer idade, Double salario, Double bonus) {
		super(nome, idade, salario);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "FuncionarioRegular [bonus=" + bonus + ", getBonus()=" + getBonus() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	@Override
	public double calcularSalario() {
		return getSalario();
	}
	
}
