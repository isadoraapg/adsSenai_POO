package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio_funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criar um algoritmo para calcular a media de n alunos (3 notas)
		
		Integer aluno = Integer.valueOf(JOptionPane.showInputDialog("Digite quantos alunos tem na sala: "));
		
		for(int i = 0; i < aluno; i++) {
			double n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 1: "));
			double n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 2: "));
			double n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 3: "));
			
			System.out.println(calcularMedia(n1, n2, n3));
			
		}
	}
		
		
	public static double calcularMedia (double n1, double n2, double n3) {
		
		return (n1 + n2 + n3)/3;
			
	}
			
	}


