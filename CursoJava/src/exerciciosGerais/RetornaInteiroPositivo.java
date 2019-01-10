package exerciciosGerais;

import java.util.Arrays;
import java.util.Random;

public class RetornaInteiroPositivo {
	public static void main(String[] args) {
		Random gerador = new Random();
		int tamanho;

		do {
			tamanho = gerador.nextInt(15);
		} while (tamanho == 0);

		int[] a = new int[tamanho];
		int menorNum;
		System.out.println("Array de inteiro(s) gerado:");
		for (int i = 0; i < a.length; i++) {
			do {
				a[i] = gerador.nextInt(100);
			} while (a[i] == 0);

			System.out.print(a[i] + ", ");
		}

		System.out.println("\n\nOrdenando o Array:");
		Arrays.sort(a);
	
		for (int numero : a) {
			System.out.print(numero + ", ");
		}

		menorNum = a[0];
		
		do {
			menorNum += 1;
		} while (Arrays.binarySearch(a, menorNum) > -1);

		System.out.println("\n\nMenor numero positivo que nao ocorre no array: " + menorNum);
	}
}

/*
 * Dado um array A de N inteiros, retorna o menor inteiro positivo (maior que 0)
 * que não ocorre em A. Por exemplo, dado A = [1, 3, 6, 4, 1, 2], a função deve
 * retornar 5. [1, 2, 3, 4, 6,] Dado A = [1, 2, 3], a função deve retornar 4.
 * Dado A = [−1, −3], a função deve retornar 1.
 */
