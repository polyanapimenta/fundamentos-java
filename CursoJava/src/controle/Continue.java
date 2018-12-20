package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
				// System.out.println(i); código inacessível, está linha nunca seria impressa no console
				/*
				 * no caso só o valor dois ele barra para não imprimir no console
				 * os outros ele continua interando até que o laço não seja mais verdade 
				 */
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
}
