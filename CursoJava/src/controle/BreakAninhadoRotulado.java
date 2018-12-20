package controle;

public class BreakAninhadoRotulado {
	public static void main(String[] args) {
		saiaDoExterno: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break saiaDoExterno;
					/* 
					 * NÃO sai mais do laço mais interno e continua no laço mais externo. 
					 * Agora quando 'j' for 2 o break vai sair do primeiro laço (externo) e vai imprimir 'Fim' 
					 * Com a Rotulaação, indica para o break de qual laço ele quer que expulse, que saia, que não quer mais validar aquela opção.
					 * Sem o rotulo o break sai do laço interno e continua efetuando as interações do laço externo indo pra o interno até atingir 2 e sair dele e atindir 5 vezes o i no laço externo em suas interações 
					 */
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Fim");
	}
}
