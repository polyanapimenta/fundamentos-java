package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovado = new ArrayList<>(); // List<> e ArrayList<>() polimosrfismo -> por quest�es da heran�a

		aprovado.add("Jo�o");
		aprovado.add("Pedro");
		aprovado.add("Maria");
		aprovado.add("Rafael");

		System.out.println("Get..");
		System.out.println(aprovado.get(1)); // estrutura indexada

		System.out.println("Add..");
		System.out.println(aprovado.add("Maria")); // aceita repeti��es

		System.out.println("Size.. " + aprovado.size());

		System.out.println("Remove.. ");
		System.out.println(aprovado.remove("maria")); // � case sensitive
		System.out.println(aprovado.remove("Maria")); // vai removar uma das marias e n�o as duas, vai remover a
														// primeira Maria inserida na lista, a �ltima permanece
		System.out.println("Size.. " + aprovado.size());

		for (String nome : aprovado) {
			System.out.println(nome);
		}
	}
}
