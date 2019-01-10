package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// dizer que a filha tem uma rela��o de heran�a, n�o posso herdar de mais de uma classe ao mesmo tempo, java aceita mais de uma heran�a apenas beseado em interface
public class Filha extends Sogra {
	// tipo default inplicito
	String segredoDoCasal = "Meu marido ganhou uma promo��o";

	public static void main(String[] args) {
		// nivel default a propria calsse tem acesso
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem que.. " + euMesma.segredoDoCasal);

		// n�o consegue acessar essa informa��o privada, apenas a propria classe tem
		// acesso sobre essa informa��o, error: The field Genro.segredo is not visible
		// Genro meuAmor = new Genro();
		// System.out.println(meuAmor.segredo);

		// informa��o publica da classe de um outro pacote, totalmente visivel
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);

		// atributos de nivel privado de sogra a filha n�o tem acesso, de nivel pacote
		// ou default a filha n�o tem acesso por estar em outro pacote, mas atributos
		// protected s�o passados por heran�a, ent�o quando um atributo � passado por
		// heran�a n�o � preciso criar uma instancia de Sogra para poder acessar aquele
		// atributo protected, esse atributo ap�s extendido � classe Sogra ele j�
		// pertence a classe Filha, podendo acess�-lo com o obj da classe filha
		// Sogra mamae = new Sogra();
		// System.out.println(mamae.segredoDeFamilia);
		
		System.out.println(euMesma.segredoDeFamilia);
		
		
	}
}
