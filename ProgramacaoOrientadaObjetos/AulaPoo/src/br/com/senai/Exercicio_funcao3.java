package br.com.senai;

import java.util.Scanner;

public class Exercicio_funcao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//faça um programa que le 3 valores e os envia para uma função que retorna por parametro o maior deles
		
		double valor1;
		double valor2;
		double valor3;
		Scanner leitorDoTeclado = new Scanner (System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = leitorDoTeclado.nextDouble();
		System.out.println("Digite o valor 2: ");
		valor2 = leitorDoTeclado.nextDouble();
		System.out.println("Digite o valor 3: ");
		valor3 = leitorDoTeclado.nextDouble();
	
		verificarMaior(valor1, valor2, valor3);
		
		leitorDoTeclado.close();
	}

	
	public static void verificarMaior(double valor1, double valor2, double valor3) {
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("Valor 1 é o maior.");
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("Valor 2 é o maior.");
		}
		else {
			System.out.println("Valor 3 é o maior.");
		}		
		
	}
	
}
