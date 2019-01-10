package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // LinkedList � uma fila, e pode ser usado com List tmb

		// uma vez ordenado a fila pega sempre o conseito FIFO, primeiro a entrar,
		// primeiro a sair, a forma de ordena��o altera o numero de chegada do dado,
		// podendo ter sido inserido primeiro e poder ser o �ltimo a sair

		fila.offer("Maria"); // offer � a mesma coisa que o add, com a diferen�a na hora da inser��o por
								// quest�o de algum erro, o offer vai retornar um false, e o add vai retornar um
								// erro
		fila.offer("Jo�o");
		fila.add("Pedro");

		System.out.println("Peek/Element.. "); // consulta qual � o primeiro elemento da fila, sem remove-lo e ir�
												// retornar o elemento, tendo uma diferen�a quando a fila est� vazia, o
												// peek vai retornar nulo e o Element vai retornar um erro dizendo que
												// n�o tem elenento na fila
		System.out.println(fila.peek()); // n�o removem o dado da fila
		System.out.println(fila.element());

		System.out.println("Poll/Remove.. "); // ambos removem o dado da lista, e mostra o valor do dado removido,
												// sempre � removido o primeiro dado da fila, no m�todo poll() quando a
												// fila est� vazia ele retorna null, j� o remove() retorna um erro
												// dizendo que n�o exite dado na fila para ser removido
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna null para fila vazia
		// System.out.println(fila.remove());

		System.out.println(fila.peek()); // retorna null para fila vazia
		// System.out.println(fila.element());
	}
}
