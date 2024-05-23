package br.com.senai.biblioteca;

public class Main {	
	
	private static Biblioteca biblioteca = new Biblioteca();
	private static Livro livro = new Livro(1, "A Paciente Silenciosa", "Alex Michaelides", 2019, "Suspense", 367);
	private static Revista revista = new Revista(2, "Veja", "Vários Autores", 2024, 213, 1);
	private static MidiaEletronica midia = new MidiaEletronica(3, "Java Programming", "John Doe", 2020, "PDF", "10mb");
	private static Usuario usuario = new Usuario(1, "Fulano", "fulano@email.com", "Rua blablabla");
	
	public static void main(String[] args) {
		
        adicionarDados(biblioteca);
        listarItensDisponiveis(biblioteca);
        gerarCatalogoCompleto(biblioteca);
        adicionarUsuario(biblioteca);
        listarUsusarios(biblioteca);
        
        
        emprestarItem(usuario, biblioteca);
        devolverItem(usuario, biblioteca);
        
        reproduzirMidiaEletronica(midia);
        baixarMidiaEletronica(midia);
        
        verificarDisponibilidade(revista);
        editarEdicao(revista);
        
        calcularPrecoVenda(livro);
        informacoesDetalhadas(livro);
        
	}	
	
	private static void adicionarDados(Biblioteca biblioteca) {		
        biblioteca.adicionarItem(livro);
        biblioteca.adicionarCatalogo(livro);
        biblioteca.adicionarItem(revista);
        biblioteca.adicionarCatalogo(revista);
        biblioteca.adicionarItem(midia);
        biblioteca.adicionarCatalogo(midia);
	}
	
	//BIBLIOTECA
	private static void listarItensDisponiveis(Biblioteca biblioteca) {
		biblioteca.listarItensDisponiveis();		
	}
	
	private static void gerarCatalogoCompleto(Biblioteca biblioteca) {
		biblioteca.gerarCatalogoCompleto();
	}	
	
	private static void listarUsusarios(Biblioteca biblioteca) {
		biblioteca.listarUsuarios();
	}
	public static void adicionarUsuario(Biblioteca biblioteca) {
		biblioteca.adicionarUsuario(usuario);
	}
	
	//USUARIO
	public static void emprestarItem(Usuario usuario, Biblioteca biblioteca) {
	usuario.emprestarItem(biblioteca.buscarItem(1), biblioteca);
	}
	
	public static void devolverItem(Usuario usuario, Biblioteca biblioteca) {
	usuario.devolverItem(livro, biblioteca);
	System.out.println("Item devolvido: " + livro.getTitulo());
	}
	
	
	//MIDIA ELETRONICA
	private static void reproduzirMidiaEletronica(MidiaEletronica midia) {
		midia.reproduzir();
	}
	private static void baixarMidiaEletronica(MidiaEletronica midia) {
		midia.baixarArquivo();
	}
	
	//REVISTA
	private static void verificarDisponibilidade(Revista revista) {
		revista.verificarDisponibilidade(revista, biblioteca);
	}
	private static void editarEdicao(Revista revista) {
		revista.editarEdicao(10, 68);
	}
	
	//LIVRO
	private static void calcularPrecoVenda(Livro livro) {
		livro.calcularPrecoVenda();
	}
	private static void informacoesDetalhadas(Livro livro) {
		livro.informacoesDetalhadas();
	}
}