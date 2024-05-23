package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros. A seguir conte quantos valores pares existem no vetor.

		int[] vetor = new int[20];
		int countPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os 20 elementos do vetor:"));
			if (vetor[i] % 2 == 0) {
				countPares++;
			}
		}

		System.out.println("Valores pares no vetor: " + countPares);
	}
}