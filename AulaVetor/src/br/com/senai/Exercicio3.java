package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		//Leia um vetor com 20 elementos. A seguir, troque o primeiro elemento com o ultimo.

		int[] vetor = new int[20];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os 20 elementos do vetor: "));
		}

		System.out.println("Vetor original:");
		for (int num : vetor) {
			System.out.print(num + " ");
		}

		int tmp = vetor[0];
		vetor[0] = vetor[vetor.length - 1];
		vetor[vetor.length - 1] = tmp;

		System.out.println("\nVetor com o primeiro e último elementos trocados:");
		for (int num : vetor) {
			System.out.print(num + " ");
		}
	}
}