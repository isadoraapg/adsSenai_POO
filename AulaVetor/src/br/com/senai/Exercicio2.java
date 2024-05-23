package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		//Solicite ao usuario a leitura de um vetor de n numeros e em seguida calcule a soma dos vetores, elemento a elemento e apresente na tela.

		Integer n = Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));

		Integer[] vetor1 = new Integer[n];
		Integer[] vetor2 = new Integer[n];
		Integer[] soma = new Integer[n];

		for (int i = 0; i < n; i++) {
			vetor1[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os elementos do primeiro vetor: "));
		}

		for (int i = 0; i < n; i++) {
			vetor2[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os elementos do segundo vetor: "));
		}

		System.out.println("A soma dos vetores é: ");
		for (int i = 0; i < n; i++) {
			soma[i] = vetor1[i] + vetor2[i];
			System.out.println(soma[i]);
		}



		//somar elementos de um vetor só:
		Integer tamanhoDoVetor = Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		Integer[] vetor = new Integer[tamanhoDoVetor];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite os numeros do vetor:"));
		}

		int soma1 = 0;
		for (int i = 0; i < soma.length; i++) {
			soma1 += vetor[i];
		}
		System.out.println(soma1);
	}
}