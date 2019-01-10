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
		// condi��o de parada
		if (numero <= 1) {
			return 1;
		}
		// logica: fatorial de 6 � 6 * o fatorial de 5, o de 5 � 5 x o fatorial de 4,
		// assim sucessivamente at� chagar na condi��o de parada que � o fatorial de 1,
		// grando toda a multiplica��o entre esses numeros, gerando oresultado do
		// fatorial
		return numero * fatorial(numero - 1);
	}
}
