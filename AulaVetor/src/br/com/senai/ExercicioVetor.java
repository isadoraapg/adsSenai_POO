package br.com.senai;

import javax.swing.JOptionPane;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inicializar um vetor de 5 posiçoes
		int[] vetor = new int[5];
		
		
		//pedir ao usuario digitar e jogar os numeros na tela
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite um número: "));
			System.out.println(vetor[i]);
		}
		
		//printar quantos numeros negativos foram digitados
		int numerosNegativos = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				numerosNegativos++;
			}
		}
		System.out.println("A quantidade de números negativos é: " + numerosNegativos);
	}

}
