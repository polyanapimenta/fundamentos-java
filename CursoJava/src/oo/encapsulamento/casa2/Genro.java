package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais!";

	public static void main(String[] args) {
		// o que o genro pode acessar nos niveis de visibilidade onde ele está?

		// consegue acessar a info privada por ser da mesma classe
		Genro euMesmo = new Genro();
		System.out.println("Nunca revelarei que... " + euMesmo.segredo);

		// consegue acessar por ser nivel pacote e estarem dentro do mesmo pacote, se
		// fosse private não daria para ver esse atributo
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		// System.out.println(meuAmor.segredoDeFamilia); não acessa informações herdadas
		// da filha estando em um pacote diferente da origem da informação, se estivesse
		// no mesmo pacote da Sogra, teria acesso igual o sogro tem

		// importou o pacote do Sogro e consguiu acessar a informação poruqe ela é
		// publica
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);

		// importou o pacote Sogra, mas não consigo acessar por ser uma informação é do
		// nivel protected, só poderia acessar essa infromação em dois cenarios, se
		// estivesse dentro do mesmo pacote ou se recebesse essa infromação por herança
		// Sogra sogrinha = new Sogra();
		// System.out.println(sogrinha.segredoDeFamilia);
	}
}
