package Trabalho;

public class Diretor extends Funcionarios{

	private Double bonusDiretor;

	public Diretor(String nome, Integer idade, Double salario, Double bonusDiretor) {
		super(nome, idade, salario);
		this.bonusDiretor = bonusDiretor;
	}

	public Double getBonusDiretor() {
		return bonusDiretor;
	}

	public void setBonusDiretor(Double bonusDiretor) {
		this.bonusDiretor = bonusDiretor;
	}

	@Override
	public String toString() {
		return "Diretor [bonusDiretor=" + bonusDiretor + ", getBonusDiretor()=" + getBonusDiretor() + ", getNome()="
				+ getNome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public double calcularSalario() {
		return getSalario();
		
	}
}