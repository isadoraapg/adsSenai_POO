package Trabalho;

public class Gerente extends Funcionarios{

	private Double bonusGerente;

	public Gerente(String nome, Integer idade, Double salario, Double bonusGerente) {
		super(nome, idade, salario);
		this.bonusGerente = bonusGerente;
	}

	@Override
	public String toString() {
		return "Gerente [bonusGerente=" + bonusGerente + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getSalario()=" + getSalario() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public Double getBonusGerente() {
		return bonusGerente;
	}

	public void setBonusGerente(Double bonusGerente) {
		this.bonusGerente = bonusGerente;
	}

	@Override
	public double calcularSalario() {
		return getSalario();
	}

}