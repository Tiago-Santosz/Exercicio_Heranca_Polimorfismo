package code.exercicios05ao11.herancaepolimorfismo;


public class Program_Funcionarios {

	public static void main(String[] args) {
		Funcionario funci = new Funcionario("Marcus", "F6630015");
		FuncionarioEnsBasico funciB = new FuncionarioEnsBasico("Joao", "FB335687", "Escolar Primaria!");
		FuncionarioEnsMedio funciM = new FuncionarioEnsMedio("Pedro", "FM345867", "Colegio Evolucao");
		FuncionarioGraduacao funciG = new FuncionarioGraduacao("Marcela", "FG9033257", "Universidade Estacio!");

		System.out.println("---Funcionarios sem escolaridade---");
		System.out.println("Nome: " + funci.getNome());
		System.out.println("Codigo Funcional: " + funci.getCodigoFuncional());
		System.out.println("Renda: " + funci.getRendaBasica());
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("---Funcionarios Com Ensino Basico---");
		System.out.println("Nome: " + funciB.getNome());
		System.out.println("Codigo Funcional: " + funciB.getCodigoFuncional());
		System.out.println("Ensino Basico: " + funciB.getEscola());
		System.out.println("Renda: " + funciB.RendaAcresimo());
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("---Funcionarios Com Ensino Medio---");
		System.out.println("Nome: " + funciM.getNome());
		System.out.println("Codigo Funcional: " + funciM.getCodigoFuncional());
		System.out.println("Ensino Medio: " + funciM.getEscola());
		System.out.println("Renda: " + funciM.RendaAcresimo());
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("---Funcionarios Com Graduacao---");
		System.out.println("Nome: " + funciG.getNome());
		System.out.println("Codigo Funcional: " + funciG.getCodigoFuncional());
		System.out.println("Universidade: " + funciG.getUniversidade());
		System.out.println("Renda: " + funciG.RendaAcresimo());
		System.out.println("-----------------------------------");

	}

}
