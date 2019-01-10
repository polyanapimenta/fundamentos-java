package exerciciosGerais;

import java.util.Arrays;

public class BuscaOrdenadaArray {
	public static void main(String[] args) {
		String[] arr = { "java", "champ", "you" };
		// � obrigat�rio a ordena��o do array para buscar algo com o binarySearch()
		Arrays.sort(arr);

		for (String nome : arr) {
			System.out.println(nome);
		}

		/*
		 * Par�metros: a - a matriz a ser pesquisada. key - o valor a ser pesquisado.
		 */
		// retorna -1 se o que foi buscado n�o existir no array
		System.out.print(Arrays.binarySearch(arr, "You")); // n�o cont�m no array
		System.out.println("\n");

		// retorna o indice correspondente a posi��o do item encontrado no array
		System.out.print(Arrays.binarySearch(arr, "you")); // cont�m no array
	}
}
