package controle;

public class BreakAninhado {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break; // sai do la�o mais interno e continua no la�o mais externo ai dps vai para a linha do println, quer dizer que o break n�o leva ele diretamente para a linha debaixo no plintln e sim pro primeiro la�o for
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Fim");
	}
}
