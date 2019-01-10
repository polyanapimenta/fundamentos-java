package avancado.varargs;

public class Pessoa {
	/**
	 * Peso em Kg.
	 */
	private double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	// polimorfismo est�tico � diferente de sobrescrita, o conceito � sobrecarga de
	// metodo, metodo com o mesmo nome em mais de um m�todo com parametros
	// diferentes

//	public void comer(Arroz arroz) {
//		this.peso += arroz.getPeso();
//	}
//
//	public void comer(Feijao feijao) {
//		this.peso += feijao.getPeso();
//	}

	// com o polimorfismo estatico, cada vez que eu criar uma nova comida teria que
	// incluir um metodo est�tico para ela ser reconhecida no Jantar
	// exemplo se adicionasse o sorvete, sem add o metodo abaixo, sorvete n�o
	// estaria disponivel para uso (para ser comido) por pessoa:

//	public void comer (Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}

	// tornando esse polimorfismo est�tico em polimorfismo din�mico, aterando se o
	// tipo para Comida em Geral para poder ser qualquer tipo de comida, tudo por
	// causa da heran�a dos alimentos em Comida, vantagem: escrever menos codigo:

	// usando Varargs: ... consigo passar a quantidade de comidas que eu queira para
	// esse m�todo
	public void comer(Comida... comidas) {
		for (Comida c : comidas) {
			this.peso += c.getPeso();
		}
	}
}
