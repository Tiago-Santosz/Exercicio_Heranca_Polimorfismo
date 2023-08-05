package code.exercicio01ao04.herancaepolimorfismo;

public class Program_Animais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex", 7);
		Cavalo horse = new Cavalo("Raio", 3);
		Preguiça preg = new Preguiça("Bad", 5);
		
		
		System.out.println("---Cachorro---");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		dog.emitirSom();
		dog.corre();
		System.out.println("--------------------------");
		System.out.println("---Cavalo---");
		System.out.println("Nome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		horse.emitirSom();
		horse.corre();
		System.out.println("--------------------------");
		System.out.println("---Preguica---");
		System.out.println("Nome: " + preg.getNome());
		System.out.println("Idade: " + preg.getIdade());
		preg.emitirSom();
		preg.subirArvore();

	}

}
