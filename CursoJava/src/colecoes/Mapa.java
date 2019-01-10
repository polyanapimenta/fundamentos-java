package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		// Map é uma estrutura que pode ser listada apenas as chaves, ou apenas os
		// valores, ou ambos ao mesmo tempo
		Map<Integer, String> aprovados = new HashMap<>(); // tipo relacionado a chave, tipo relacionado ao valor

		aprovados.put(1, "Pedro"); // put serve tanto para adicionar um novo registro quanto para substituir um
									// existente
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");

		// 3 formas de obter um dado com Map:
		System.out.println(aprovados.keySet()); // mistura de set com list, as chaves são organizadas por um set,
												// retorna apenas a coluna com as chaves
		System.out.println(aprovados.values()); // retorna apenas a coluna com os valores
		System.out.println(aprovados.entrySet()); // retorna chave e valor respectivo

		aprovados.put(3, "Beatriz"); // atualizar um registro já existente
		System.out.println(aprovados.get(3)); // retorna um elemento pelo seu valor de chave, não é ordenação por índice
		System.out.println(aprovados.containsKey(4)); // possui um contain para cada coluna, o containsKey (lista das chaves) e o containsValue (lista dos valores), o contains verifica se um valor específico existe
		System.out.println(aprovados.containsValue("Bia")); // o valor de registro bia não existe pois foi atualizado para Beatriz
		
		System.out.println("Chave..");
		for(Integer codigo: aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		System.out.println("Valores..");
		for(String nome: aprovados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chave/Valor..");
		//Entry é um tipo específico do map para agrupar chave com seu valor
		for(Entry<Integer, String> registro: aprovados.entrySet()) {
			//System.out.println(registro);
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}
}
