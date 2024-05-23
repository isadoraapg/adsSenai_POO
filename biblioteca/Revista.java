package br.com.senai.biblioteca;

public class Revista extends ItemBiblioteca {

	//atributos
	private Integer volume;
	private Integer edicao;

	//construtor
	public Revista(Integer id, String titulo, String autor, Integer anoPublicacao, Integer volume, Integer edicao) {
		super(id, titulo, autor, anoPublicacao);
		this.volume = volume;
		this.edicao = edicao;
	}

	//getters and setters
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Integer getEdicao() {
		return edicao;
	}
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}


	//métodos específicos
	public void verificarDisponibilidade(ItemBiblioteca item, Biblioteca biblioteca) {		
		if(biblioteca.buscarItem(item.getId()) != null){	
				System.out.println("Revista disponivel.");			
		}else {
			System.out.println("Revista não disponível.");
		}
	}

	public void editarEdicao(Integer novoVolume, Integer novaEdicao) {
	    this.setVolume(novoVolume);
	    this.setEdicao(novaEdicao);
	    System.out.println("Revista " + this.getTitulo() + " editada:\nNovo volume: " + novoVolume + "\nNova edição: " + novaEdicao);
	}
}
