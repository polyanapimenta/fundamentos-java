package exerciciosGerais;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Candy {
	public static void main(String[] args) {
		Set<Integer> semDocesRepetidos = new TreeSet<>();
		int[] arrayDoces = new int[geraNumPar()];
		int totalDoces;
		int docesMary;
		
		System.out.print("Array com todos os doces: ");
		
		for (int N : arrayDoces) {
			N = geraNumPar();
			System.out.print(N + ",");
			semDocesRepetidos.add(N);
		}

		totalDoces = arrayDoces.length;
		docesMary = semDocesRepetidos.size();

		System.out.println("\nQtd. total de doces: " + totalDoces);

		if ((totalDoces / 2) > docesMary) {
			System.out.printf("\n---\nMary pode comer %d tipos diferentes de doces\n---\n", docesMary);

			for (int doces : semDocesRepetidos) {
				System.out.print(doces + ",");
			}

		} else {
			System.out.printf("\n---\nMary pode comer %d tipos diferentes de doces\n---", totalDoces / 2);
		}
	}

	public static int geraNumPar() {
		Random gerador = new Random();
		int numero;
		boolean sair = false;

		do {
			numero = gerador.nextInt(10);

			if (numero == 0)
				sair = false;
			else if (numero == 1)
				sair = false;
			else if (numero % 2 != 0)
				sair = false;
			else
				sair = true;
		} while (!sair);
		return numero;
	}
}
