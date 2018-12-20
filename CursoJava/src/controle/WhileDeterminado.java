package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double somaNota = 0;
		double nota = 0;
		int indice = 0;
		
		while (indice < 3) {
			nota = scanner.nextDouble();
			somaNota += nota;
			indice++;
		}
		
		scanner.close();
		System.out.printf("A média é: %.2f", somaNota/3);
	}
}
