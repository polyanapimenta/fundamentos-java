package classe;

public class Produto {
	String nome;  // atributo de inst�ncia (objeto)
	double preco; // atributo de inst�ncia
	static double desconto; // vari�vel de classe, �nica c�pia dentro da classe Produto, o valor � o mesmo para todas as inst�ncias de objeto
	
	Produto() {
		// construtor vazio padr�o
	}
	
	Produto(String nome, double preco) {
		// outro construtor
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco - (preco * desconto);
	}
}
