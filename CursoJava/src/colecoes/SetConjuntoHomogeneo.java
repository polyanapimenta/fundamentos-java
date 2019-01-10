package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class SetConjuntoHomogeneo {

	public static void main(String[] args) {
		//definindo conjunto tipo String, notação generics <> para definir o tipo de dado armazenado
		//Set<String> aprovados = new HashSet<>(); //HashSet() não respeita a ordem de inserção
		//Set<String> aprovados = new LinkedHashSet<>(); // LinkedHashSet() respeita a ordem de inserção
		Set<String> aprovados = new TreeSet<>(); // estrutura ordenada por padrão, se for String, a ordenação será alfabética, numero em ordem crescente.
		//aprovados.add(1); //The method add(String) in the type Set<String> is not applicable for the arguments (int)
		
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		
		// varrendo o conjunto de aprovados
		for(String nome: aprovados) {
			System.out.println(nome); //obs. ordem alfabética e de inserção não são respeitados
		}
		
		
	}
}
