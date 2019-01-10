package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Polyana"); // append anexa uma determinada String ao String Builder
		sb.append(",").append("Maria"); // pode concatenar uma chamada de appenda atr�s da outra, sem problema esse
										// encadeamento
		sb.append(",").append("Pedro"); // essa concatena��o pelo String Builder � bem mais otimizada, e n� vai gerar
										// aquele monte de String no pool de String

		// � um objeto mut�vel, ou seja, qualquer modifica��o j� modifica a String
		// original, n�o precisa explicitamente de atribui��o como na String que �
		// imut�vel:
		//sb.reverse();

		System.out.println(sb.toString());

		System.out.println(sb.substring(1, 3)); // por�m nem todo m�todo ir� modificar a String original
		System.out.println(sb.toString()); // pega todas as concatena��es que foi feita a partir do String Builder e
											// converte em uma unica String
	}
}
