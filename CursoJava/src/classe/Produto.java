package classe;

public class Produto {
	String nome;  // atributo de instância (objeto)
	double preco; // atributo de instância
	static double desconto; // variável de classe, única cópia dentro da classe Produto, o valor é o mesmo para todas as instâncias de objeto
	
	Produto() {
		// construtor vazio padrão
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
