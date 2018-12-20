package exerciciosControle;

import java.util.Scanner;

/*
 * 4. Criar um programa que receba um número e diga se ele é um número primo.
 */

public class NumeroPrimoComSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int countDivisores = 0;
		
		numero = sc.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				countDivisores++;
			}
		}
		
		switch(countDivisores) {
		case 0:
			System.out.printf("%d é primo!", numero);
			break;
		default:
			System.out.printf("%d não é primo!", numero);
		}
		sc.close();
	}
}
