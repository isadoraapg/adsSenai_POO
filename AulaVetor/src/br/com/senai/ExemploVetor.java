package br.com.senai;

import java.util.Random;

public class ExemploVetor {

	public static void main(String[] args) {
		
		//inicialização do vetor
		String[] vetorDeNomes = new String[50];
		
		//popular o vetor
		for (int i = 0; i < vetorDeNomes.length; i++) {
			vetorDeNomes[i] = "Numero " + new Random().nextInt(1000); //gera numeros aleatorios 
		}

		//escrever os dados do vetor
		for (int i = 0; i < vetorDeNomes.length; i++) {
			if(vetorDeNomes[i].equalsIgnoreCase("Numero 50")) {  //se tiver "Numero 50", ele vai imprimir
				System.out.println(vetorDeNomes[i]);
				
			}
		}
	}

}
