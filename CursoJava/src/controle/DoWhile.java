package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaNotas = 0;
		double nota = 0;
		
		int numeroNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			if (nota <= 10 && nota > 0) {
				somaNotas += nota;
				numeroNotas++;
			}
		} while (nota != -1);
		
		scanner.close();
		System.out.printf("A m�dia �: %.2f", somaNotas / numeroNotas);
	}
}
