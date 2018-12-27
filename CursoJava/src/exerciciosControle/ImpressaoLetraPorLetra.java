package exerciciosControle;

import java.util.Scanner;

/*
 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */

public class ImpressaoLetraPorLetra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palavra;
		
		palavra = scanner.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		scanner.close();
	}
}
