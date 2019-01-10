package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//LIFO - ultimo a chegar, primeiro a sair, o critério de ordenação pode influenciar
		//Stack<String> pilha = new Stack<>();
		Deque<String> pilha = new ArrayDeque<>(); // implementa as funcionalidade de uma pilha e de uma fila, tem as duas funcionalidades, tem os métodos pull e pop, métodos relacionados a fila e pilha
		
		pilha.push("O pequeno príncipe"); // colocar um elemento na pilha
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("peek.."); // pegar um elemento da pilha, sem remover o elemento da pilha
		System.out.println(pilha.peek());
		
		System.out.println("pop.."); // mostra o elemento da pilha e remove
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop()); // quando não existe elemento na pilha, ele retorna um erro informando que a pilha se encontra vazia, e não dá para mostrar nem remover
		
		System.out.println(pilha.poll()); // informa null para fila vazia
	}
}
