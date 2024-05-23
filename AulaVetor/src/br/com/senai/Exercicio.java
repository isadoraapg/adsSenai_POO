package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {

		//Leia um vetor de 10 elementos e em seguida ache a posiçao do elemento m(dado pelo usuario) no vetor. Caso o elemento não exista no vetor
		//informe ao usuario


		Integer[] vetor = new Integer[10];  

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os 10 elementos do vetor:"));
		}

		Integer elemento = Integer.valueOf(JOptionPane.showInputDialog("Digite o elemento que deseja encontrar no vetor:"));


		System.out.println(vetor[elemento]);

		 
// 		Como fiz: 
//		int posicao = -1;
//		for (int i = 0; i < vetor.length; i++) {
//			if (vetor[i] == elemento) {
//				posicao = i;
//				break;
//			}
//		}
//
//		if (posicao != -1) {
//			System.out.println("O elemento " + elemento + " está na posição " + posicao + " do vetor.");
//		} else {
//			System.out.println("O elemento " + elemento + " não foi encontrado no vetor.");
//		}

	}
}
