package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {
	
	public static void main(String[] args) {
		Set conjuntoHeterogeneo = new HashSet(); // isso é possivel devido ao polimorfismo: HashSet conjunto = new HashSet();
		
		conjuntoHeterogeneo.add('a'); // retorna verdadeiro ou false, true para adicionado com sucesso 
		conjuntoHeterogeneo.add("texto");
		conjuntoHeterogeneo.add(1);
		conjuntoHeterogeneo.add(3.14);
		conjuntoHeterogeneo.add(false);
		
		for(Object valor: conjuntoHeterogeneo) {
			System.out.println(valor);
		}
		System.out.println("\n------\n");
		
		System.out.println("Add.. ");
		System.out.println(conjuntoHeterogeneo.add(1)); // teoria do conjunto: não add elemento repetido, logo retorno false de não foi inserido este valor novamente porque já existe
		System.out.println(conjuntoHeterogeneo.add(10)); // true add com sucesso pois 0 não existe dentro do conjunto
		
		System.out.println("Size.. " + conjuntoHeterogeneo.size());
		
		System.out.println("Remove.. ");
		System.out.println(conjuntoHeterogeneo.remove("a")); // String sempre é delimitado com aspas duplas "", char sempre é delimitado por aspas simples '', mesmo o conteúdo sendo identico, strings são diferentes de char, por isso o retorno é false, remoção mal sucedida
		System.out.println(conjuntoHeterogeneo.remove('a'));
		
		System.out.println("Size.. " + conjuntoHeterogeneo.size()); // 5 elementos, o elemento 'a' foi removido
		System.out.println("Contains.. " + conjuntoHeterogeneo.contains('a')); // verificar se um elemento está ou não dentro de um conjunto
		System.out.println(conjuntoHeterogeneo.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//união de dois conjuntos seria uma soma:
		//conjuntoHeterogeneo.addAll(nums); // add dentro do conjunto heterogeneo os elementos que estão no conjunto nums
		// intersecção entre dois conjuntos, seria uma subtração, só sobra os numeros comuns entre um conjunto e outro o resto é descartado
		conjuntoHeterogeneo.retainAll(nums);
		
		System.out.println("Size... ");
		System.out.println(conjuntoHeterogeneo.size());
		
		// limpando o conjunto
		conjuntoHeterogeneo.clear();
		System.out.println(conjuntoHeterogeneo.isEmpty()); //verificando se o conjunto está vazio
	}
}
