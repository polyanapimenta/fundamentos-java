package oo.encapsulamento.casa1;

import oo.encapsulamento.casa2.Filha;
import oo.encapsulamento.casa2.Genro;

public class Sogro {

	public boolean gostaDeCerveja = true;

	public static void main(String[] args) {
		
		// public acessa em qualquer lugar e por qualquer classe
		Sogro euMesmo = new Sogro();
		System.out.println(euMesmo.gostaDeCerveja);
		
		// parece que quando estamos no mesmo pacote, acessamos informacoes protegidas de outras classes do mesmo pacote
		Sogra esposa = new Sogra();
		System.out.println(esposa.segredoDeFamilia);
		
		Filha meuAnjo = new Filha();
		System.out.println(meuAnjo.segredoDeFamilia); // acessa as informa��es herdadas da filha
		//System.out.println(meuAnjo.segredoDoCasal); n�o disponivel por estar em outri pacote
		
		// n�o acessa nada privado dele
		// Genro infeliz = new Genro();
		// System.out.println(infeliz.segredo);
	}
}
