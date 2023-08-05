package code.exercicios05ao11.herancaepolimorfismo;

public class Empresa07 {

	public static void main(String[] args) {
        //Instanciando os objetos de cada classe para utilizar os metodos.
		FuncionarioEnsBasico funciB = new FuncionarioEnsBasico(null, null, null);
		FuncionarioEnsMedio funciM = new FuncionarioEnsMedio(null, null, null);
		FuncionarioGraduacao funciG = new FuncionarioGraduacao(null, null, null);
		
		// Criando Array de 10 funcionarios do Tipo Funcionario.
		Funcionario[] funcionario = new Funcionario[10];

		funcionario[0] = new FuncionarioEnsBasico("Joao", "FB335687", "Escola Primaria!");
		funcionario[1] = new FuncionarioEnsBasico("Elena", "FB345689", "Escola Avanco !");
		funcionario[2] = new FuncionarioEnsBasico("Paulo", "FB355684", "Escola PNN!");
		funcionario[3] = new FuncionarioEnsBasico("Julio", "FB3800689", "Escola Padroes!");
		funcionario[4] = new FuncionarioEnsMedio("Jhona", "FB335600", "Escola Zezo");
		funcionario[5] = new FuncionarioEnsMedio("Jhoson", "FB340089", "Escola Primaria!");
		funcionario[6] = new FuncionarioEnsMedio("Nina", "FB305684", "Escola Fatec!");
		funcionario[7] = new FuncionarioEnsMedio("Ronaldo", "FB3889000", "Escola Padroes!");
		funcionario[8] = new FuncionarioGraduacao("Mizael", "FU90997", "Universidade Unifacs!");
		funcionario[9] = new FuncionarioGraduacao("Roberta", "FU986654", "Universidade Estacio!");
        
		//Variaveis para guardar a aquantidade de funcionarios de cada nivel
		int qtdeFucionarioBasico = 0;
		int qtdeFucionarioMedio = 0;
		int qtdeFucionarioGrad = 0;
		double custoTotal = 0.0;

		//for para verificar  se o objeto funci é instancia da classe e incrementar a quantidade.
		for (Funcionario funci : funcionario) {
			if (funci instanceof FuncionarioEnsBasico) {
				qtdeFucionarioBasico++;
			} else if (funci instanceof FuncionarioEnsMedio) {
				qtdeFucionarioMedio++;
			} else if (funci instanceof FuncionarioGraduacao) {
				qtdeFucionarioGrad++;

			}

		}
          //Atribuindo a variavel custoTotal a soma dos salarios dos 10 funcionarios de cada nivel.
		custoTotal = (funciB.RendaAcresimo() * qtdeFucionarioBasico) + (funciM.RendaAcresimo() * qtdeFucionarioMedio)
				+ (funciG.RendaAcresimo() * qtdeFucionarioGrad);

		System.out.println("- Custo Total Dos Funcionarios por Nivel - : " + custoTotal);
		System.out.println("Custo de Funcionarios Ensino Basico: $" + (funciB.RendaAcresimo() * qtdeFucionarioBasico));
		System.out.println("Custo de Funcionarios Ensino Medio: $" + (funciM.RendaAcresimo() * qtdeFucionarioMedio));
		System.out.println("Custo de Funcionarios Com Graduacao: $" + (funciG.RendaAcresimo() * qtdeFucionarioGrad));
		

	}

}
