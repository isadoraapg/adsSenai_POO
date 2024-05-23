package Trabalho3;


public class Pessoa {

	private Integer id;
	private String nome;
	private int idade;
	private Endereco endereco;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Pessoa(String nome, int idade, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}
	

}