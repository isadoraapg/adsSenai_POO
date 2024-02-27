package br.com.senai;

import javax.swing.JOptionPane;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite seu valor: "));
		
		if(estoque>=100) {
			System.out.println("Produto com quantidade suficiente");
		}else if(estoque < 100 && estoque > 50){
			System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
		}else {
			System.out.println("ATENÇÃO! Faça um novo pedido.");
		}
		
		
		
	}

}
