package br.com.senai;

import java.util.Scanner;

public class Exercicio_funcao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Faça uma funcao q verifique o sinal de um numero inteiro, retornando -1 se o numero for negativo e 1 se o numero for positivo
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		System.out.println(verificarPositivo(0));
		
		sc.close();
	}

	
	public static int verificarPositivo (int n) {
				
		if (n >= 0) {
			System.out.println("(1) O número é positivo");
			return 1;
		}else {
			System.out.println("(-1) O número é negativo");
			return -1;
		}
		
		
	}
}
