package br.com.senai;

public class Venda {
	
	private int id;
	private int qtd;
	private Produto itensVenda;
	private String dataVenda;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Produto getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(Produto itensVenda) {
		this.itensVenda = itensVenda;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
		
}
