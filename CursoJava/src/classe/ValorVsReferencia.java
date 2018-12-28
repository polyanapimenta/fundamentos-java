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
		final Produto produto = new Produto("Caneta", 1); // com defini��o final n�o pode ser mudado o endere�o onde esta vari�vel aponta (onde foi instanciada) durante a execu��o do programa, j� seus atributs podem ser modificados e alterados. ou seja com final n�o posso instanciar novamente um espa�o vazio da mem�ria para servir para este 'novo objeto' que seria instanciado na linha 17.
		Produto produto2 = produto; // atribui��o por referencia end. de mem�ria do objeto produto (tudo que for alterado em produto2 ser� alterado em produto)
		produto2.nome = "Lap�s"; // se na defini��o da classe Produto a palavra final estivesse assim: 'final String nome = "Caderno";' significa que este valor definido como nome do produto n�o pode ser alterado em nenhum momento, sendo um valor constante default para o atributo
		//produto = new Produto(); // uma nova isnt�ncia, novo espa�o alocado na mem�ria foi atribu�do ao produto, para o novo objeto instanciado, um espa�o vazio, nulo
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
		
		
	}
}
