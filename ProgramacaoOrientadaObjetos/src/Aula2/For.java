package Aula2;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valor;
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o valor da tabuada: ");
		
		valor = leitor.nextInt();
			
		//i++ ---> i = i + 1
		
		for (int i = 1; i <= 10; i++) {
		System.out.println(valor + " x " + i + " = " + (valor*i));
		}
		
	}

}
