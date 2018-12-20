package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nota = 0;
		double somaNotas = 0;
		int numeroNotas = 0;

		while (nota != -1) {

			nota = scanner.nextDouble();

			if (nota <= 10 && nota >= 0) {
				somaNotas += nota;
				numeroNotas++;
			}
		}
		scanner.close();
		System.out.printf("A média é %.2f", somaNotas/numeroNotas);
	}
}
