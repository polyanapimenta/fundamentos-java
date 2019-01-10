package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// dizer que a filha tem uma relação de herança, não posso herdar de mais de uma classe ao mesmo tempo, java aceita mais de uma herança apenas beseado em interface
public class Filha extends Sogra {
	// tipo default inplicito
	String segredoDoCasal = "Meu marido ganhou uma promoção";

	public static void main(String[] args) {
		// nivel default a propria calsse tem acesso
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem que.. " + euMesma.segredoDoCasal);

		// não consegue acessar essa informação privada, apenas a propria classe tem
		// acesso sobre essa informação, error: The field Genro.segredo is not visible
		// Genro meuAmor = new Genro();
		// System.out.println(meuAmor.segredo);

		// informação publica da classe de um outro pacote, totalmente visivel
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);

		// atributos de nivel privado de sogra a filha não tem acesso, de nivel pacote
		// ou default a filha não tem acesso por estar em outro pacote, mas atributos
		// protected são passados por herança, então quando um atributo é passado por
		// herança não é preciso criar uma instancia de Sogra para poder acessar aquele
		// atributo protected, esse atributo após extendido à classe Sogra ele já
		// pertence a classe Filha, podendo acessá-lo com o obj da classe filha
		// Sogra mamae = new Sogra();
		// System.out.println(mamae.segredoDeFamilia);
		
		System.out.println(euMesma.segredoDeFamilia);
		
		
	}
}
