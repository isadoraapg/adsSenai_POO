package br.com.senai.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	//atributos
	private List<ItemBiblioteca> listaItensDisponiveis;
	private List<Usuario> listaUsuarios;
	private List<ItemBiblioteca> catalogoCompleto;
	
	//construtor
	public Biblioteca() {
		this.listaItensDisponiveis = new ArrayList<ItemBiblioteca>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.catalogoCompleto = new ArrayList<ItemBiblioteca>();
	}
	
	//métodos específicos
	 public void adicionarItem(ItemBiblioteca item) {
	        listaItensDisponiveis.add(item);
	        System.out.println("\n '" + item.getTitulo() + "' foi adicionado a itens disponíveis.");
	    }
	 
	 public void adicionarCatalogo(ItemBiblioteca item){
		 catalogoCompleto.add(item);
		 System.out.println("\n '" + item.getTitulo() + "' foi adicionado ao catálogo.");
	 }
	 
	 public void adicionarUsuario(Usuario usuario) {
		 listaUsuarios.add(usuario);
		 System.out.println("\n '" + usuario.getNome() + "' foi adicionado");
	 }

	 public void removerItem(ItemBiblioteca item) {
	        listaItensDisponiveis.remove(item);
	        catalogoCompleto.remove(item);
	        System.out.println("\n '" + item.getTitulo() + "' foi removido.");
	    }
	 
	 public ItemBiblioteca buscarItem(Integer id) {
	        for (ItemBiblioteca item : listaItensDisponiveis) {
	            if (item.getId().equals(id)) {
	            	return item;
	            }
	        }
	        return null;
	    }
	 
	 public void listarItensDisponiveis() {
		 System.out.println("\nItens Disponíveis: ");
	        for (ItemBiblioteca item : listaItensDisponiveis) {
	            System.out.println("Id: " + item.getId() + "\nTítulo: " + item.getTitulo());
	        }
	    }
	 
	 public void listarUsuarios() {
	        for (Usuario usuario : listaUsuarios) {
	            System.out.println(usuario.getNome());
	        }
	    }
	 
	 public void gerarCatalogoCompleto() {
		 System.out.println("\nCatálogo: ");
	        for (ItemBiblioteca item : catalogoCompleto) {
	            System.out.println(item.getTitulo() + " - " + item.getClass().getSimpleName());
	        }
	    }
	


}
