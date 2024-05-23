package br.com.senai.rec;

public class Professor extends Funcionario {
	
	private String disciplina;
	private Integer cargaHoraria;
	private Double valorHoraAula;

	
	public Professor(String nome, Integer idade, String genero, Integer matricula, Double salarioBase,
			String disciplina, Integer cargaHoraria, Double valorHoraAula) {
		super(nome, idade, genero, matricula, salarioBase);
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
		this.valorHoraAula = valorHoraAula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(Double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	

	@Override
	public String toString() {
		return super.toString() + "\nCargo: Professor\nDisciplina: " + disciplina + "\nCarga Horária: " + cargaHoraria + "h \nValor Hora Aula: " + valorHoraAula;
	}

	@Override
	public double calcularSalario() {
		//SALARIO BASE + (CARGA HORARIA * VALOR HORA-AULA)
		return getSalarioBase() + (getCargaHoraria() * getValorHoraAula());
	}
}
