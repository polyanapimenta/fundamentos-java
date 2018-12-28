package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acer 15' 8GB";
		produto1.preco = 2300;
		
		Produto produto2 = new Produto("Caneta BIC 4 cores", 4.50);
		
		Produto.desconto = 0.15; // acessando o desconto da classe Produto e não da instancia do produto1 (produto1.desconto = 0.15)
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}
}
