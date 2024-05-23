package Trabalho;

public abstract class Funcionarios {

	private String nome;
	private Integer idade;
	private Double salario;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionarios [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	
	public Funcionarios(String nome, Integer idade, Double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	
	//uma classe abstrata nao pode ser instanciada 
	public abstract double calcularSalario();
	
}
