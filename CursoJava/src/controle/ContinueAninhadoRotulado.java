package controle;

public class ContinueAninhadoRotulado {
	public static void main(String[] args) {
		continuaNoExterno: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					continue continuaNoExterno;
					/*
					 * o J igual a 2 nunca ser� impresso, ele pula para a pr�xima intera��o N�O MAIS de J (0..1..3..4) at� (j ser igual a 4) MAS sim para a intera��o do la�o externo de i
					 * ai o la�o externo que estava 0 intera-se para 1 .. e o ciclo se repete.. at� que i seja 4 (i < 5) e J seja 1 (j != 2), sai do la�o e imprime 'Fim'
					 */
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Fim");
	}
}
