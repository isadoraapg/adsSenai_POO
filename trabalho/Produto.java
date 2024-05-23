package trabalho;

public class Produto {

	Integer codigo;
	String nome;
	String descricao;
	Integer quantidade;
	Double preco;
	
	@Override
	public String toString() {
	    return "Código: " + codigo + " | Nome: " + nome + " | Descrição: " + descricao + " | Quantidade: " + quantidade + " | Preço Unitário: " + preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}	
}