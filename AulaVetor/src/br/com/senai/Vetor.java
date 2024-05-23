package br.com.senai;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] vetorDeNomes = new String[5];
		
		vetorDeNomes[0] = JOptionPane.showInputDialog("Nome:");
		vetorDeNomes[1] = "João";
		vetorDeNomes[2] = "Fátima";
		vetorDeNomes[3] = "Francisco";
		vetorDeNomes[4] = "Fernanda";
		System.out.println(vetorDeNomes);
		
		//ou:
		
		String[] vetorDeNome = {"Maria", "João", "Fátima", "Francisco", "Fernanda"};
		System.out.println(vetorDeNome);
	}

}
