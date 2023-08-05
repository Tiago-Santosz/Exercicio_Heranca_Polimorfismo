package code.exercicios05ao11.herancaepolimorfismo;

public class FuncionarioGraduacao extends Funcionario {
	private String Universidade;

	public FuncionarioGraduacao(String nome, String codigoFuncional, String universidade) {
		super(nome, codigoFuncional);
		Universidade = universidade;
	}


	public String getUniversidade() {
		return Universidade;
	}

	public void setUniversidade(String universidade) {
		Universidade = universidade;
	}

	public double RendaAcresimo() {
		double acresimobasic = super.getRendaBasica() + (super.getRendaBasica() * (10.0/ 100));
		double acrecimoMidium = acresimobasic + (acresimobasic * (50.0 / 100));
		double acrecimoTotal = acrecimoMidium + acrecimoMidium;
		return acrecimoTotal;
	}
}
