package br.com.senai.biblioteca;

public class Livro extends ItemBiblioteca {

	//atributos
	private String genero;
	private Integer numPaginas;
	
	//construtor
	public Livro(Integer id, String titulo, String autor, Integer anoPublicacao, String genero, Integer numPaginas) {
		super(id, titulo, autor, anoPublicacao);
		this.genero = genero;
		this.numPaginas = numPaginas;
	}
	
	//getters and setters
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	//to string para utilizar no método informacoesDetalhadas
	@Override
	public String toString() {
		return "Livro [genero=" + genero + ", numPaginas=" + numPaginas + ", getGenero()=" + getGenero()
				+ ", getNumPaginas()=" + getNumPaginas() + ", getId()=" + getId() + ", getTitulo()=" + getTitulo()
				+ ", getAutor()=" + getAutor() + ", getAnoPublicacao()=" + getAnoPublicacao() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	//métodos específicos
	public double calcularPrecoVenda() {
		return numPaginas * 0.09;
	}
	
	public void informacoesDetalhadas() {
		System.out.println(toString());
	}

}
