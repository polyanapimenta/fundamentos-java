package oo.heranca;

public class TestDrive {

	public static void main(String[] args) {
		Carro c = new Civic();
		// civic não alterou nada que recebeu do pai como herança:
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());

		c = new Ferrari();
		// velocidade 20, pois em Ferari foi sobrescrito o comportamento (metodo)
		// acelerar, dei uma
		// implementação mais robusta, mais rápida
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
	}
}
