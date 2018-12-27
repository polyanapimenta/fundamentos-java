package exerciciosControle;

import java.util.Scanner;

/*
 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */

public class ImpressaoMaiorNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int tmp = 0;
		
		for (int i = 0; i < 10; i++) {
			numero = scanner.nextInt();
			
			if (tmp > numero) {
				continue;
			} else if (numero > tmp) {
				tmp = numero;
			}
		}
		System.out.println("Maior número: " + tmp);
		scanner.close();
	}

}
