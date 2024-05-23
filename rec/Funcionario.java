package br.com.senai.rec;

public abstract class Funcionario extends Pessoa {
	
	private Integer matricula;
	private Double salarioBase;
	
	
	public Funcionario(String nome, Integer idade, String genero, Integer matricula, Double salarioBase) {
		super(nome, idade, genero);
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	@Override
	public String toString() {
		return super.toString() + "\nMatricula: " + matricula + "\nSalário Base: " + salarioBase;
	}


	public abstract double calcularSalario();
	
}
