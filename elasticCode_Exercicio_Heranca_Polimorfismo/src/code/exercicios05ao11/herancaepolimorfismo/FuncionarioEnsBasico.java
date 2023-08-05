package code.exercicios05ao11.herancaepolimorfismo;

public class FuncionarioEnsBasico extends Funcionario {
	private String escola;
	
	public FuncionarioEnsBasico(String nome, String codigoFuncional, String escola) {
		super(nome, codigoFuncional);
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public double RendaAcresimo() {
		double acresimoTotal = super.getRendaBasica() + (super.getRendaBasica() * (10.0 / 100));
		return acresimoTotal;
	}
}

