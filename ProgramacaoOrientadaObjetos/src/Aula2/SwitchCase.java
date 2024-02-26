package Aula2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma opção: ");
		opcao = sc.nextInt(); 
		
		switch( opcao ) {
		
		case 1:
			System.out.println("Opção 1 escolhida.");
		break;
		
		case 2:
			System.out.println("Opção 2 escolhida.");
		break;
			
		case 3:
			System.out.println("Opção 3 escolhida.");
		break;
		
		default:
			System.out.println("Opção inválida");
		}
		
		
	}

}
