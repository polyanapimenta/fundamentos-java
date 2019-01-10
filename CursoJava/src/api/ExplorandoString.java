package api;

public class ExplorandoString {
	
	public static void main(String[] args) {
		String nome = new String("Polyana"); // não é recomendado esta forma
		nome = "Poly" + "ana";
		
		// alguns metodos importantes
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 4)); // pega uma parte da string a partir de um indice
		System.out.println(nome.indexOf('y')); // retorna o indice que esta letra se encontra
		System.out.println(nome.charAt(6)); // retorna o caractere correspondente ao indice 6
		System.out.println(nome.equalsIgnoreCase("polyana")); // vai fazer uma comparacao sem levar em consideração as letras em maiúsculo
		System.out.println(nome.startsWith("Pol")); // verifica se a String começa com determinado trecho
		System.out.println(nome.isEmpty()); // verifica se a String está vazia
		System.out.println(nome.concat(" é legal!").concat("!"));
		
		// após a execução de muitos métodos, a String permanesce imutável, permanesce a mesma
		System.out.println(nome);
		nome = nome.toUpperCase().substring(0, 4).concat(" é legal!");
		System.out.println(nome);
	}
}
