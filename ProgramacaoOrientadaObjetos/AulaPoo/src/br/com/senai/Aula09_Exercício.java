package br.com.senai;

import javax.swing.JOptionPane;

public class Aula09_Exercício {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa onde cada eleitor digita seu voto via teclado um a um e registre/contabilize o total de votos de 
		//cada prefeito, o numero de votos branco, nulos, bem como o total de eleitores que compareceram as urnas.
		//O mesario antes da votação de cada eleitor, prepara o sistema digitando a opção (1). Após a preparação, o sistema
		//deve apresentar a lista de candidatos onde o eleitor ira digitar o codigo do prefeito que deseja votar.
		//Codigo:1 || Nome: Angela Pepino || Partido: PMDB
		//Codigo:2 || Nome: Gean da Silva || Partido: PT
		//Codigo:3 || Nome: Cesar Souza Neto || Partido: DEM
		//Codigo: 4 || Nome: Voto Nulo
		//Codigo: 5 || Nome: Voto em Branco

		//Critérios de avaliação:
		//Identação, Oragnização, Apresentação do código, Execução do programa, Perguntas, Refazer uma parte, Funcionalidades.
		
		
		int opcaoMesario = 0;
		int opcaoEleitor = 0;
		
		do {
			opcaoMesario = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcão: \n1) Abrir menu de votação. \n2)Sair."));
			if(opcaoMesario ==1) {
				do {
					opcaoEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção de voto: \nCódigo: 1 \nNome: Angela Pepino \nPartido: PMDB \n\nCódigo: 2 \nNome: Gean da Silva \nPartido: PT \n\nCódigo: 3 \nNome: Cesar Souza Neto \nPartido: DEM \n\nCódigo: 4 \nNome: Voto Nulo \n\nCódigo: 5 \nNome: Voto Branco"));
												
							switch( opcaoEleitor ) {
							
							case 1:
								System.out.println("Você votou na candidata: Angela Pepino - PMDB");
							break;
							
							case 2:
								System.out.println("Você votou no candidato: Gean da Silva - PT");
							break;
								
							case 3:
								System.out.println("Você votou no candidato: Cesar Souza Neto - DEM");
							break;
							
							case 4:
								System.out.println("Você votou NULO");
							break;
							
							case 5:
								System.out.println("Você votou BRANCO");
							break;
							default:
								System.out.println("Opção inválida");
							}
				}while (opcaoEleitor != 1); //verificar 
				
		}}while (opcaoMesario != 2);
		
		System.out.println("Programa finalizado.");
		
		
		
		
	}
		}
	
