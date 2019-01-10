package oo.heranca;

public class Carro {
	// final nota��o de constante mai�scula seguido de _
	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidadeAtual = 0;

	// metodo final � uma constante, n�o pode ser modificado pelas classes filhas
	protected final void acelerarMais(int velocidade) {
		if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += velocidade;
		}
	}

	protected final void frearMais(int velocidade) {
		if (velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= velocidade;
		}
	}

	// cada vez que chamar o metodo acelerar, ele vai chamar o acelerarMais()
	// metodos protected, foram desenhados para serem usados pelas classes filhas
	// que herda de Carro, mesmo ela estando em pacote diferente a classe filha ter�
	// acesso aos metodos. Esses dois m�todos n�o s�o pensados para quem vai usar a
	// classe Carro, pq quem vai usar a classe Carro n�o vai estar no mesmo pacote
	// que carro, nem vai herdar de Carro, por isso n�o possuindo acesso e
	// visibilidade a esses dois metodos protected
	
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void frear() {
		frearMais(5);
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
