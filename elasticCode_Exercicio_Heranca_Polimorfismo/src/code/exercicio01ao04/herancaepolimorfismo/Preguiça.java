package code.exercicio01ao04.herancaepolimorfismo;


public class Preguiça extends Animal {

	public Preguiça(String nome, int idade) {
		super(nome, idade);
		
	}
 public void emitirSom () {
	 System.out.println("O bicho preguica esta rosnando!");
 }
 
 public void subirArvore() {
	 System.out.println("Bicho preguica transita pelas arvores");
 }
}