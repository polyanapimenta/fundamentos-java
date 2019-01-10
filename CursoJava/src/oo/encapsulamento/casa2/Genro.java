package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais!";

	public static void main(String[] args) {
		// o que o genro pode acessar nos niveis de visibilidade onde ele est�?

		// consegue acessar a info privada por ser da mesma classe
		Genro euMesmo = new Genro();
		System.out.println("Nunca revelarei que... " + euMesmo.segredo);

		// consegue acessar por ser nivel pacote e estarem dentro do mesmo pacote, se
		// fosse private n�o daria para ver esse atributo
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		// System.out.println(meuAmor.segredoDeFamilia); n�o acessa informa��es herdadas
		// da filha estando em um pacote diferente da origem da informa��o, se estivesse
		// no mesmo pacote da Sogra, teria acesso igual o sogro tem

		// importou o pacote do Sogro e consguiu acessar a informa��o poruqe ela �
		// publica
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);

		// importou o pacote Sogra, mas n�o consigo acessar por ser uma informa��o � do
		// nivel protected, s� poderia acessar essa infroma��o em dois cenarios, se
		// estivesse dentro do mesmo pacote ou se recebesse essa infroma��o por heran�a
		// Sogra sogrinha = new Sogra();
		// System.out.println(sogrinha.segredoDeFamilia);
	}
}
