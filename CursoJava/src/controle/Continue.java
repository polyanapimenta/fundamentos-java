package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
				// System.out.println(i); c�digo inacess�vel, est� linha nunca seria impressa no console
				/*
				 * no caso s� o valor dois ele barra para n�o imprimir no console
				 * os outros ele continua interando at� que o la�o n�o seja mais verdade 
				 */
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
}
