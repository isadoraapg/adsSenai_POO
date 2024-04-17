package br.com.senai;

import javax.swing.JOptionPane;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcão: \n1) Cadastrar Aluno \n2)Cadastrar Professor \n9)Sair do Programa"));
			if(opcao ==1) {
				System.out.println("Cadastrar Aluno");
			}
			if(opcao == 2) {
				System.out.println("Cadastrar Professor");
			}
		}while (opcao != 9);
		
		System.out.println("Programa finalizado.");
		
		
	}

}
