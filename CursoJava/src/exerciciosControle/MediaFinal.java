package exerciciosControle;

import java.util.Scanner;

/*
 * 3. Criar um programa que receba duas notas parciais, calcular a média final. 
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
 * caso contrário imprime no console "Reprovado".
 */

public class MediaFinal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double somaNotas = 0;
		double media;

		for (int i = 0; i < 2; i++) {
			nota = scanner.nextDouble();
			somaNotas += nota;
		}
		media = somaNotas / 2;
		System.out.printf("Média final: %.2f\n", media);

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media < 7) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		scanner.close();
	}
}
