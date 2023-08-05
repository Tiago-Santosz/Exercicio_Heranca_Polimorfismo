package code.exercicio01ao04.herancaepolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom() {
		System.out.println("Cavalo elinchando");
	}
	
	public void corre () {
		System.out.println(" O cavalo e um animal veloz!");
	}
}
