package classe;

public class ValorVsReferencia {
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		final Produto produto = new Produto("Caneta", 1); // com definição final não pode ser mudado o endereço onde esta variável aponta (onde foi instanciada) durante a execução do programa, já seus atributs podem ser modificados e alterados. ou seja com final não posso instanciar novamente um espaço vazio da memória para servir para este 'novo objeto' que seria instanciado na linha 17.
		Produto produto2 = produto; // atribuição por referencia end. de memória do objeto produto (tudo que for alterado em produto2 será alterado em produto)
		produto2.nome = "Lapís"; // se na definição da classe Produto a palavra final estivesse assim: 'final String nome = "Caderno";' significa que este valor definido como nome do produto não pode ser alterado em nenhum momento, sendo um valor constante default para o atributo
		//produto = new Produto(); // uma nova isntância, novo espaço alocado na memória foi atribuído ao produto, para o novo objeto instanciado, um espaço vazio, nulo
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
		
		
	}
}
