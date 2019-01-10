package oo.encapsulamento.casa1;

public class Sogra {

	protected String segredoDeFamilia = "Temos uma conta na sui�a";

	public static void main(String[] args) {
		Sogra euMesma = new Sogra();
		System.out.println(euMesma.segredoDeFamilia);

		Sogro meuMarido = new Sogro();
		System.out.println(meuMarido.gostaDeCerveja);

		// n�o tem acesso a atributos default de outro pacote
		// Filha filhinha = new Filha();
		// System.out.println(filhinha.segredoDoCasal);

		// n�o consegue acessar nada dele, pq � privado
		// Genro genrinho = new Genro();
		// System.out.println(genrinho.segredo);
	}
}
