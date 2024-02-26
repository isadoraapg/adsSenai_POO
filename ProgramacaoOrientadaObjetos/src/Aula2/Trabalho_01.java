package Aula2;
import java.util.Scanner;
public class Trabalho_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcao;
		int n1;
		int n2;
		double resultado;
		Scanner leitor = new Scanner(System.in);
		
		//String opcao = JOptionPane.showInputDialog("Digite a operação");
		
		do {
				
			System.out.println("Digite o valor de N1: ");
			n1 = leitor.nextInt();
			
			System.out.println("Digite o valor de N2: ");
			n2 = leitor.nextInt();
		
			System.out.println("Digite a operação: ");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Sair");
			opcao=leitor.nextInt(); 
			
			if( opcao == 1 ) {
				resultado = n1 + n2;
				System.out.println("\nRESULTADO: " + n1 + " + " + n2 + " = " + resultado);
			}
			else if( opcao == 2 ){
				resultado = n1 - n2;
				System.out.println("\nRESULTADO: " + n1 + " - " + n2 + " = " + resultado);
			}
			else if( opcao == 3){
				resultado = n1 * n2;
				System.out.println("\nRESULTADO: " + n1 + " * " + n2 + " = " + resultado);
			}
			else if( opcao == 4 ) {
				resultado = n1 / n2;
				System.out.println("\nRESULTADO: " + n1 + " / " + n2 + " = " + resultado);
			}
			else {
				System.out.println("Fim");
			}
			System.out.println("-----");
		}while( opcao != 0 );
		
		leitor.close();
	}

}
