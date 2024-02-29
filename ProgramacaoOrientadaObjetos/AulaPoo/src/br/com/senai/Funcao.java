package br.com.senai;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	double n1 = 2;
	//	double n2 = 1;
		
	//	calcularMedia(n1, n2);
		calcularMedia("Fulano", 1, 2);
		calcularMedia("Ciclano", 3, 6);
		calcularMedia("Junior", 10, 8);
		calcularMedia("Claudio", 9, 5);
		
	}
	
	public static void calcularMedia (String name, double n1, double n2) {
		double media = (n1 + n2)/2;
		
		if(media >=6 ) {
			System.out.println("O aluno " + name + " foi aprovado com média " + media);
			
		}else {
			System.out.println("O aluno " + name + " foi reprovado com média " + media);
		}
		
		
	}

	

	
	
	
}
