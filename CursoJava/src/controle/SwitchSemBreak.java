package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		
		// uma vez que entra no case, sai executando todos os outros
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 'Bassai-Dai/Jion/Kandu-Dai'");
		case "marrom":
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yodan'");
		case "laranja":
			System.out.println("Sei fazer o 'Heian Sandan'");
		case "vermelha":
		case "vermelho":
			System.out.println("Sei fazer o 'Heian Nidan'");
		case "amarela":
		case "amarelo":
			System.out.println("Sei fazer o 'Heian Shodan'");
		default:
			System.out.println("Não sei nada");
		}
	}
}
