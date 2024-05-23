package Trabalho;

public class Main {

	public static void main(String[] args) {
		
		ServicoCrud servico = new ServicoCrud();
				
		
        Funcionarios regular = new FuncionarioRegular("Fulano", 28, 1000.0, 100.0);
        Funcionarios gerente = new Gerente("Ciclano", 34, 1500.0, 200.0);
        Funcionarios diretor = new Diretor("Beltrano", 52, 3000.0, 500.0);
        
        servico.verificarSalario(regular);
        servico.verificarSalario(gerente);
        servico.verificarSalario(diretor);
             
	}
}