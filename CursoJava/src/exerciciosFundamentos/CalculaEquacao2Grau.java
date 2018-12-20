package exerciciosFundamentos;

import java.util.Scanner;

public class CalculaEquacao2Grau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0\n");
		
		System.out.println("Digite o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = scanner.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = scanner.nextInt();
		
		int delta = (int) Math.pow(b, 2) - (4 * a * c);
		
		System.out.println("\n A: " + a + "\n B: " + b + "\n C: " + c);
		System.out.printf("\nEqua��o: %dx� + %dx + %d = 0\n", a, b, c);
		System.out.println("Delta: " + delta);
		
		// calculando as ra�zes
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("\n\nRa�zes:\nO x1 �: %.2f", x1);
		//System.out.printf("\n\nO x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 �: %.2f", x2);
		//System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
		
		scanner.close();
	}
}
