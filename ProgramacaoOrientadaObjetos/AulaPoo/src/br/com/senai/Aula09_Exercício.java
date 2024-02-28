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
		int totalAngela = 0;
		int totalGean = 0;
		int totalCesar = 0;
		int totalNulo = 0;
		int totalBranco = 0;


		do {
			opcaoMesario = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcão: \n1) Abrir menu de votação. \n2)Encerrar."));
			if(opcaoMesario ==1) {
				opcaoEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção de voto: \nCódigo: 1 \nNome: Angela Pepino \nPartido: PMDB \n\nCódigo: 2 \nNome: Gean da Silva \nPartido: PT \n\nCódigo: 3 \nNome: Cesar Souza Neto \nPartido: DEM \n\nCódigo: 4 \nNome: Voto Nulo \n\nCódigo: 5 \nNome: Voto Branco"));

				switch( opcaoEleitor ) {

				case 1:
					System.out.println("Voto: Angela Pepino - PMDB");
					totalAngela++;
					break;

				case 2:
					System.out.println("Voto: Gean da Silva - PT");
					totalGean++;
					break;

				case 3:
					System.out.println("Voto: Cesar Souza Neto - DEM");
					totalCesar++;
					break;

				case 4:
					System.out.println("Voto Nulo");
					totalNulo++;
					break;

				case 5:
					System.out.println("Voto Branco");
					totalBranco++;
					break;
				default:
					System.out.println("Opção inválida");
				}

			}else if(opcaoMesario != 1 && opcaoMesario!= 2) {
				System.out.println("Opção inválida");
			}
		}while (opcaoMesario != 2);

		System.out.println("\nVOTAÇÃO ENCERRADA.");
		System.out.println("\nVotos Computados:");
		System.out.println("Angela Pepino - PMDB: " + totalAngela);
		System.out.println("Gean da Silva - PT: " + totalGean);
		System.out.println("Cesar Souza Neto - DEM: " + totalCesar);
		System.out.println("Nulo: " + totalNulo);
		System.out.println("Branco: " + totalBranco);

		if(totalAngela > totalGean && totalAngela > totalCesar && totalAngela > totalNulo && totalAngela > totalBranco) {
			System.out.println("\nCandidato(a) mais votado(a): Angela Pepino - PMDB");
		}else if(totalGean > totalAngela && totalGean > totalCesar && totalGean > totalNulo && totalGean > totalBranco) {
			System.out.println("\nCandidato(a) mais votado(a): Gean da Silva - PT");
		}else if(totalCesar > totalAngela && totalCesar > totalGean && totalCesar > totalNulo && totalCesar > totalBranco) {
			System.out.println("\nCandidato(a) mais votado(a): Cesar Souza Neto - DEM");
		}else if(totalNulo > totalAngela && totalNulo > totalCesar && totalNulo > totalGean && totalNulo > totalBranco) {
			System.out.println("\nCandidato(a) mais votado(a): Nulo");
		}else if(totalBranco > totalAngela && totalBranco > totalCesar&& totalBranco > totalNulo && totalBranco > totalGean) {
			System.out.println("\nCandidato(a) mais votado(a): Branco");
		}else {
			System.out.println("Empate. Realizar votação novamente");
		}




	}
}
