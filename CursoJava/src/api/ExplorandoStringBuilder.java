package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Polyana"); // append anexa uma determinada String ao String Builder
		sb.append(",").append("Maria"); // pode concatenar uma chamada de appenda atrás da outra, sem problema esse
										// encadeamento
		sb.append(",").append("Pedro"); // essa concatenação pelo String Builder é bem mais otimizada, e nõ vai gerar
										// aquele monte de String no pool de String

		// É um objeto mutável, ou seja, qualquer modificação já modifica a String
		// original, não precisa explicitamente de atribuição como na String que é
		// imutável:
		//sb.reverse();

		System.out.println(sb.toString());

		System.out.println(sb.substring(1, 3)); // porém nem todo método irá modificar a String original
		System.out.println(sb.toString()); // pega todas as concatenações que foi feita a partir do String Builder e
											// converte em uma unica String
	}
}
