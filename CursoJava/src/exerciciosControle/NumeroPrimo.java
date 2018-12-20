package exerciciosControle;

import java.util.Scanner;

/*
 * 4. Criar um programa que receba um número e diga se ele é um número primo.
 * 
 * Primos: números naturais que têm apenas dois divisores diferentes: o 1 e ele mesmo, ex: 2
 */

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int countDivisores = 0;
		
		numero = scanner.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				countDivisores++;
			}
			
			if (countDivisores > 0) {
				System.out.printf("%d Não é um número primo", numero);
				break;
			}
		}
		
		if (countDivisores == 0 ) {
			System.out.printf("%d É um número primo", numero);
		}
		scanner.close();
	}
}
