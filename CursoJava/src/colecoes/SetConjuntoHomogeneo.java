package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class SetConjuntoHomogeneo {

	public static void main(String[] args) {
		//definindo conjunto tipo String, nota��o generics <> para definir o tipo de dado armazenado
		//Set<String> aprovados = new HashSet<>(); //HashSet() n�o respeita a ordem de inser��o
		//Set<String> aprovados = new LinkedHashSet<>(); // LinkedHashSet() respeita a ordem de inser��o
		Set<String> aprovados = new TreeSet<>(); // estrutura ordenada por padr�o, se for String, a ordena��o ser� alfab�tica, numero em ordem crescente.
		//aprovados.add(1); //The method add(String) in the type Set<String> is not applicable for the arguments (int)
		
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		
		// varrendo o conjunto de aprovados
		for(String nome: aprovados) {
			System.out.println(nome); //obs. ordem alfab�tica e de inser��o n�o s�o respeitados
		}
		
		
	}
}
