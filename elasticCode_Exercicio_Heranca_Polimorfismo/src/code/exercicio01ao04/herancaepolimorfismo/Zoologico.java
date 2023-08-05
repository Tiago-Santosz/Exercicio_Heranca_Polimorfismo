package code.exercicio01ao04.herancaepolimorfismo;

public class Zoologico {

	public static void main(String[] args) {
		// Array de 10 jaulas do tipo Animal:
		Animal[] jaula = new Animal[10];

		// Adicionando animais da instancia Animal e atribuindo um novo animal para cada
		// jaula:

		jaula[0] = new Cachorro("Rex", 3);
		jaula[1] = new Cavalo("Black horse", 5);
		jaula[2] = new Preguiça("Marcha Lenta", 2);
		jaula[3] = new Cachorro("Bily", 3);
		jaula[4] = new Cavalo("Flash", 1);
		jaula[5] = new Preguiça("Lepo", 3);
		jaula[6] = new Cachorro("Loop", 7);
		jaula[7] = new Cavalo("Alado", 8);
		jaula[8] = new Preguiça("Slow", 1);
		jaula[9] = new Cachorro("Tim-Tim", 10);

		// Percorrendo cada jaula e emitindo o som de cada animal:

		for (int i = 0; i < jaula.length; i++) {
			Animal animal = jaula[i];
			System.out.println("Animal " + (i + 1) + ": " + animal.getNome() + "\nIdade: " + animal.getIdade());
			animal.emitirSom();

			if (animal instanceof Cachorro || animal instanceof Cavalo || animal instanceof Preguiça) {
				animal.corre();
				System.out.println();
			}

		}

	}

}
