package code.exercicios05ao11.herancaepolimorfismo;

public class Funcionario {
	private String nome;
	private String codigoFuncional;
	private double rendaBasica = 1000.0;
	private Comissao08 comissao;

	public Funcionario(String nome, String codigoFuncional) {
		super();
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
	}

	public Funcionario(String nome, String codigoFuncional, Comissao08 comissao) {
		super();
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.comissao = comissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public double getRendaBasica() {
		return rendaBasica;
	}

	public Comissao08 getComissao() {
		return comissao;
	}

	public void setComissao(Comissao08 comissao) {
		this.comissao = comissao;
	}

	public double rendaTotal() {

		return rendaBasica + comissao.calcularSalarioTotal();
	}

	@Override
	public String toString() {
		String tipoFuncionario = "";
		if (comissao instanceof Gerente08) {
			tipoFuncionario = "Gerente";
		} else if (comissao instanceof Supervisor08) {
			tipoFuncionario = "Supervisor";
		} else if (comissao instanceof Vendedor08) {
			tipoFuncionario = "Vendedor";
		} else {
			tipoFuncionario = "Não identificado";
		}

		return "Nome: " + nome + ", Tipo: " + tipoFuncionario + ", Comissao: $"
				+ (comissao != null ? comissao.calcularSalarioTotal() : "N/A") + ", Salario Total: $" + rendaTotal();
	}

}
