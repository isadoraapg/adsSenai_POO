package ExercEnderecoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private int codigo;

	private String nome;

	private int idade;

	private List<Endereco> endereco = new ArrayList<Endereco>();

	
	
	
	public Pessoa(int codigo, String nome, int idade, List<Endereco> endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}





}