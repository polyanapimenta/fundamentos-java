package controle;

public class BreakAninhadoRotulado {
	public static void main(String[] args) {
		saiaDoExterno: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break saiaDoExterno;
					/* 
					 * N�O sai mais do la�o mais interno e continua no la�o mais externo. 
					 * Agora quando 'j' for 2 o break vai sair do primeiro la�o (externo) e vai imprimir 'Fim' 
					 * Com a Rotulaa��o, indica para o break de qual la�o ele quer que expulse, que saia, que n�o quer mais validar aquela op��o.
					 * Sem o rotulo o break sai do la�o interno e continua efetuando as intera��es do la�o externo indo pra o interno at� atingir 2 e sair dele e atindir 5 vezes o i no la�o externo em suas intera��es 
					 */
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Fim");
	}
}
