package exerciciosControle;

import java.util.Scanner;

/*
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */

public class NumeroPar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero;
		double teste;
		
		numero = scanner.nextDouble();
		
		if (numero >= 0 && numero <= 10) {
			teste = numero % 2;
			
			if (teste == 0) {
				System.out.println(numero + " é Par!");
			} else {
				System.out.println(numero + " é Ímpar!");
			}
		}
		
		scanner.close();
	}
}
