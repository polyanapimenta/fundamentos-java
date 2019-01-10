package avancado;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatorialFor(6));
		System.out.println(fatorial(6));
	}

	private static int fatorialFor(int numero) {
		int fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		return fatorial;
	}

	// usando Recursividade
	private static int fatorial(int numero) {
		// condição de parada
		if (numero <= 1) {
			return 1;
		}
		// logica: fatorial de 6 é 6 * o fatorial de 5, o de 5 é 5 x o fatorial de 4,
		// assim sucessivamente até chagar na condição de parada que é o fatorial de 1,
		// grando toda a multiplicação entre esses numeros, gerando oresultado do
		// fatorial
		return numero * fatorial(numero - 1);
	}
}
