package oo.heranca;

public class TestDrive {

	public static void main(String[] args) {
		Carro c = new Civic();
		// civic n�o alterou nada que recebeu do pai como heran�a:
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());

		c = new Ferrari();
		// velocidade 20, pois em Ferari foi sobrescrito o comportamento (metodo)
		// acelerar, dei uma
		// implementa��o mais robusta, mais r�pida
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
	}
}
