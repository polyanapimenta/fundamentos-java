package colecoes;

public class EnderecoTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");

		System.out.println(endereco1 == endereco2);
		// nessa comparação o resultado é falso, pq estou fazendo uma comparacao entre
		// enderecos de memoria, duas intancias com enderecos de memoria diferentes,
		// dois objs diferentes, sempre comparacoes entre == é feito uma comparacao de
		// enderecos de memoria e nao de valores

		System.out.println(endereco1.equals(endereco2));

		// falso, pq, dentro da classe endereco nao foi implementado um metodo equals, e
		// vai acabar assumindo o metodo equals que esta na classe Object, toda classe
		// java herda dessa classe Objects, sendo assim, ele vai fazer uma comparacao de
		// memoria:

//		public boolean equals(Object obj) {
//	        return (this == obj);
//	    }

		// para comparar os valores, teria que implementar o meu metodo equals dentro da
		// minha classe Enderecos, ou automaticamente pelo eclipse, generate hasCode()
		// and equals() com ALT+SHIFT+S

		// após a implementacao do hashCode() e do equals() autogerado pelo eclipse,
		// conseguimos obter uma comparacao entre os valores de um objeto, retornando
		// true, sim esses endereco1 e endereco2 sao iguais
	}
}
