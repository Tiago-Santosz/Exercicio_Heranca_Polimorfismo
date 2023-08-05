package code.exercicio01ao04.herancaepolimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}

	public void emitirSom() {
		
		System.out.println("- Cachorro latindo...(au au)");
	}
	
	public void corre() {
		System.out.println("- O Cachorro corre bastante!");
	}
}