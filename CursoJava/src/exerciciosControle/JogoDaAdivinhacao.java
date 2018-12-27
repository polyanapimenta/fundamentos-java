package exerciciosControle;

import java.util.Random;
import java.util.Scanner;

/*
 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
 * Armazene um numero aleatório em uma variável. 
 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
 * e imprima se o número inserido é maior ou menor do que o número armazenado.
 */

public class JogoDaAdivinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();
		int numAleatorio;
		int numero;
		
		numAleatorio = gerador.nextInt(101);
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println("Informe um número de 0-100: ");
			numero = scanner.nextInt();
			
			if (i == 1 && numero != numAleatorio) {
				System.out.printf("\n\nVocê não conseguiu adivinhar o número: %d \n:(\n", numAleatorio);
			} else if (numero == numAleatorio) {
				System.out.println("\nVOCÊ ADIVINHOU!!");
				break;
			} else if (numero > numAleatorio) {
				System.out.println("DICA! Seu número é MAIOR que o número secreto!");
			} else if (numero < numAleatorio) {
				System.out.println("DICA! Seu número é MENOR que o número secreto!");
			} 
			System.out.printf("\nRestam %d Tentativa(s) \n", i-1);
		}
		
		scanner.close();
	}
}
