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
		
		numAleatorio = gerador.nextInt();
		
		for (int i = 10; i > 0; i--) {
			numero = scanner.nextInt();
			
			if (numero == numAleatorio) {
				System.out.println("Você adivinhou!");
			} else {
				System.out.printf("\nErrou!\n%dª Tentativa: ", i-1);
			}
		}
		System.out.printf("\n\nVocê não conseguiu adivinhar o número: %d \n:(", numAleatorio);
	}
}
