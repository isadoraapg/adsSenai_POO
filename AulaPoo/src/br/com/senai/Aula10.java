package br.com.senai;

import javax.swing.JOptionPane;

public class Aula10 {
	
	//FAÇA UMA FUNÇÃO DENTRO DO EXERCÍCIO 09:

	
	int opcaoMesario = 0;
	int opcaoEleitor = 0;
	int totalAngela = 0;
	int totalGean = 0;
	int totalCesar = 0;
	int totalNulo = 0;
	int totalBranco = 0;
	
	
	public void Urna() {
		
		do {
			opcaoMesario = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcão: \n1) Abrir menu de votação. \n2)Encerrar."));
			  Votacao();
		}while (opcaoMesario != 2);
		
		System.out.println("\nVOTAÇÃO ENCERRADA.");
		System.out.println("\nVotos Computados:");
		System.out.println("Angela Pepino - PMDB: " + totalAngela);
		System.out.println("Gean da Silva - PT: " + totalGean);
		System.out.println("Cesar Souza Neto - DEM: " + totalCesar);
		System.out.println("Nulo: " + totalNulo);
		System.out.println("Branco: " + totalBranco);
	}
	
	
	public void Votacao() {
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
	}
		
	
	
	
		
		
	
	
	
	
	
	

}
