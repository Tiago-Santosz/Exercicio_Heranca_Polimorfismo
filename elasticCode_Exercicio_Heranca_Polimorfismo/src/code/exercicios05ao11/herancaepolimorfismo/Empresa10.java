package code.exercicios05ao11.herancaepolimorfismo;

public class Empresa10 {

	public static void main(String[] args) {

		// Instanciando os objetos para armazena-los nas variaveis de Comissao08.
		Comissao08 comissaoGerente = new Gerente08();
		Comissao08 comissaoSupervisor = new Supervisor08();
		Comissao08 comissaoVendedor = new Vendedor08();
		Funcionario funci = new Funcionario(null, null, null);
		// Criando Array de 10 funcionarios do Tipo Funcionario .
		Funcionario[] funcionario = new Funcionario[10];

		funcionario[0] = new Funcionario("Marcos", "GG900", comissaoGerente);
		funcionario[1] = new Funcionario("Tiago", "QAP1099", comissaoSupervisor);
		funcionario[2] = new Funcionario("Rodrigo", "QSL90880", comissaoSupervisor);
		funcionario[3] = new Funcionario("Ellen", "V099999", comissaoVendedor);
		funcionario[4] = new Funcionario("Afonso", "V088888", comissaoVendedor);
		funcionario[5] = new Funcionario("Fabio", "V0977799", comissaoVendedor);
		funcionario[6] = new Funcionario("Robert", "M33330", comissaoVendedor);
		funcionario[7] = new Funcionario("Milton", "E30000", comissaoVendedor);
		funcionario[8] = new Funcionario("Milena", "E45090", comissaoVendedor);
		funcionario[9] = new Funcionario("Nelson", "O78888", comissaoVendedor);

		// Variaveis para guardar a aquantidade de funcionarios de cada profissão.
		int qtdeGerentes = 0;
		int qtdeSupervisores = 0;
		int qtdeVendedores = 0;
		double custoTotal = 0;

		// for para verificar se o objeto funcionario é instancia das classes de
		// profissões e incrementar a quantidade.
		for (int i = 0; i < funcionario.length; i++) {
			if (funcionario[i].getComissao() instanceof Gerente08) {
				qtdeGerentes++;
			} else if (funcionario[i].getComissao() instanceof Supervisor08) {
				qtdeSupervisores++;
			} else if (funcionario[i].getComissao() instanceof Vendedor08) {
				qtdeVendedores++;
			}
		}

		// Atribuindo a variavel custoTotal a soma dos salarios dos 10 funcionarios de
		// cada profissão.
		custoTotal = ((funci.getRendaBasica() + comissaoGerente.calcularSalarioTotal()) * qtdeGerentes)
				+ ((funci.getRendaBasica() + comissaoSupervisor.calcularSalarioTotal()) * qtdeSupervisores)
				+ ((funci.getRendaBasica() + comissaoVendedor.calcularSalarioTotal()) * qtdeVendedores);

		System.out.println("- Custo Total Dos Funcionarios por Profissao - $: " + custoTotal);
		System.out.println("Custo de Funcionarios Gerentes: $"
				+ ((funci.getRendaBasica() + comissaoGerente.calcularSalarioTotal()) * qtdeGerentes));
		System.out.println("Custo de Funcionarios Supervisores: $"
				+ ((funci.getRendaBasica() + comissaoSupervisor.calcularSalarioTotal()) * qtdeSupervisores));
		System.out.println("Custo de Funcionarios Vendedores: $"
				+ ((funci.getRendaBasica() + comissaoVendedor.calcularSalarioTotal()) * qtdeVendedores));
		System.out.println("------------------------------------------------------");
		System.out.println();
		for (Funcionario func : funcionario) {
			System.out.println(func);
		}

	}
}
