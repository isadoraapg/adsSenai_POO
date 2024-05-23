package br.com.senai.biblioteca;

public class MidiaEletronica extends ItemBiblioteca {

	//atributos
	private String formato;
	private String tamanhoArquivo;
	
	//contrutor
	public MidiaEletronica(Integer id, String titulo, String autor, Integer anoPublicacao, String formato,
			String tamanhoArquivo) {
		super(id, titulo, autor, anoPublicacao);
		this.formato = formato;
		this.tamanhoArquivo = tamanhoArquivo;
	}

	//getters and setters
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(String tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}
	
	
	//métodos específicos
	public void reproduzir() {
		System.out.println("Reproduzindo " + getTitulo() + "...");
	}
	
	public void baixarArquivo() {
		System.out.println("Baixando o arquivo " + getTitulo() + "...");
	}
	
}
