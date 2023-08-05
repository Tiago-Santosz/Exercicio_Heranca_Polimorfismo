package code.exercicios05ao11.herancaepolimorfismo;

public class FuncionarioEnsMedio extends Funcionario {
	private String escola;
	public FuncionarioEnsMedio(String nome, String codigoFuncional, String escola) {
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
		double acresimobasic = super.getRendaBasica() + (super.getRendaBasica() * (10.0/ 100));
		double acrecimoTotal = acresimobasic + (acresimobasic * (50.0 / 100));
		return acrecimoTotal;
	}

}
