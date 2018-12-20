package exerciciosControle;

import java.util.Scanner;

/*
 * 7. Criar um programa que enquanto estiver recebendo números positivos, 
 * imprime no console a soma dos números inseridos, 
 * caso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 */

public class SomaNumerosPositivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int somaNumeros = 0;
		
		do {
			numero = sc.nextInt();
			somaNumeros += numero;
			
			if (numero > 0) 
				System.out.println("Soma dos números: " + somaNumeros);
		} while (numero > 0);
		
		//System.out.printf("Numero negativo: %d", numero);
		System.out.println("Fim do programa!");
	}
}
