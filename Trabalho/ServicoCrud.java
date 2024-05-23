package Trabalho;

public class ServicoCrud {

	
	public void verificarSalario(Funcionarios f) {
		
		//System.out.println(f.calcularSalario() + );
		
		double salarioTotal = f.calcularSalario();
        
        // Verifica o tipo do funcionário e adiciona o bônus correspondente
        if (f instanceof FuncionarioRegular) {
            FuncionarioRegular regular = (FuncionarioRegular) f;
            salarioTotal += regular.getBonus();
        } else if (f instanceof Gerente) {
            Gerente gerente = (Gerente) f;
            salarioTotal += gerente.getBonusGerente();
        } else if (f instanceof Diretor) {
            Diretor diretor = (Diretor) f;
            salarioTotal += diretor.getBonusDiretor();
        }
        
        System.out.println("Salário total de " + f.getNome() + ": " + salarioTotal);
    		
	}
}
