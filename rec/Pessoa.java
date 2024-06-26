package br.com.senai.rec;

public abstract class Pessoa {

	private String nome;
	private Integer idade;
	private String genero;
	
	public Pessoa(String nome, Integer idade, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nGenero: " + genero;
	}


	
	
}
