package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovado = new ArrayList<>(); // List<> e ArrayList<>() polimosrfismo -> por questões da herança

		aprovado.add("João");
		aprovado.add("Pedro");
		aprovado.add("Maria");
		aprovado.add("Rafael");

		System.out.println("Get..");
		System.out.println(aprovado.get(1)); // estrutura indexada

		System.out.println("Add..");
		System.out.println(aprovado.add("Maria")); // aceita repetições

		System.out.println("Size.. " + aprovado.size());

		System.out.println("Remove.. ");
		System.out.println(aprovado.remove("maria")); // é case sensitive
		System.out.println(aprovado.remove("Maria")); // vai removar uma das marias e não as duas, vai remover a
														// primeira Maria inserida na lista, a última permanece
		System.out.println("Size.. " + aprovado.size());

		for (String nome : aprovado) {
			System.out.println(nome);
		}
	}
}
