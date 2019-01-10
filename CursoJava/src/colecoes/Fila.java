package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // LinkedList é uma fila, e pode ser usado com List tmb

		// uma vez ordenado a fila pega sempre o conseito FIFO, primeiro a entrar,
		// primeiro a sair, a forma de ordenação altera o numero de chegada do dado,
		// podendo ter sido inserido primeiro e poder ser o último a sair

		fila.offer("Maria"); // offer é a mesma coisa que o add, com a diferença na hora da inserção por
								// questão de algum erro, o offer vai retornar um false, e o add vai retornar um
								// erro
		fila.offer("João");
		fila.add("Pedro");

		System.out.println("Peek/Element.. "); // consulta qual é o primeiro elemento da fila, sem remove-lo e irá
												// retornar o elemento, tendo uma diferença quando a fila está vazia, o
												// peek vai retornar nulo e o Element vai retornar um erro dizendo que
												// não tem elenento na fila
		System.out.println(fila.peek()); // não removem o dado da fila
		System.out.println(fila.element());

		System.out.println("Poll/Remove.. "); // ambos removem o dado da lista, e mostra o valor do dado removido,
												// sempre é removido o primeiro dado da fila, no método poll() quando a
												// fila está vazia ele retorna null, já o remove() retorna um erro
												// dizendo que não exite dado na fila para ser removido
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna null para fila vazia
		// System.out.println(fila.remove());

		System.out.println(fila.peek()); // retorna null para fila vazia
		// System.out.println(fila.element());
	}
}
