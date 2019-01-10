package exerciciosGerais;

import java.util.Arrays;

public class BuscaOrdenadaArray {
	public static void main(String[] args) {
		String[] arr = { "java", "champ", "you" };
		// é obrigatório a ordenação do array para buscar algo com o binarySearch()
		Arrays.sort(arr);

		for (String nome : arr) {
			System.out.println(nome);
		}

		/*
		 * Parâmetros: a - a matriz a ser pesquisada. key - o valor a ser pesquisado.
		 */
		// retorna -1 se o que foi buscado não existir no array
		System.out.print(Arrays.binarySearch(arr, "You")); // não contém no array
		System.out.println("\n");

		// retorna o indice correspondente a posição do item encontrado no array
		System.out.print(Arrays.binarySearch(arr, "you")); // contém no array
	}
}
