package br.com.senai.biblioteca;

import java.util.ArrayList;

public class Usuario {
	
	//atributos
	private Integer idUsuario;
	private String nome;
	private String email;
	private String endereco;
	
	//lista que vai armazenar os itens emprestados
	private ArrayList<ItemBiblioteca> itensEmprestados;
	
	//construtor
	public Usuario(Integer idUsuario, String nome, String email, String endereco) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.itensEmprestados = new ArrayList<>();
	}

	//getters and setters
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList<ItemBiblioteca> getItensEmprestados() {
		return itensEmprestados;
	}
	
	public void setItensEmprestados(ArrayList<ItemBiblioteca> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}
	
	//métodos específicos
	public void emprestarItem(ItemBiblioteca item, Biblioteca biblioteca) {
		if(biblioteca.buscarItem(item.getId()) != null){ //se o id for != de null, ou seja, se existir
			if(!itensEmprestados.contains(item)) {  //verifica se o item NAO ta contido na lista, 
				itensEmprestados.add(item);
				biblioteca.removerItem(item);
				System.out.println("Item emprestado: " + item.getTitulo());
			}else {
				System.out.println("Item não disponível.");
			}
		}else {
			System.out.println("Item não existe.");
		}
	}

	public void devolverItem(ItemBiblioteca item, Biblioteca biblioteca) {
		if(itensEmprestados.contains(item)) {
			itensEmprestados.remove(item);
			biblioteca.adicionarItem(item);
		}else {
			System.out.println("Usuário não possui item.");
		}
      
	}
}
