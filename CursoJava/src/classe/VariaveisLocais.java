package classe;

public class VariaveisLocais {
	
	int a = 2;
	int a1 = 8; // variável de instância, do objeto
	
	void teste1() {
		
		System.out.println(a + b);
		//System.out.println(a1);
		
		int a1 = 4; // variável de escopo, apenas visível dentro deste método
		/*
		 * obs.: dentro de métodos, a execução é sequêncial (serial), então a ordem de declaração é fundamental, ou seja se eu printar a variável a1 antes de te-la declarado dentro do método, ela não estará disponível para uso, vai constar como se ela não existisse, ou como não tivesse sido declarada ainda
		 */
		
		if(a1> 3) {
			int a2 = 1;
		}
		//System.out.println(a2); // variável a2 não existe fora do escopo de declaração do bloco if
	}
	int b = 3; // variável de instância não tem problema serem declaradas depois dos métodos, mas por padrão elas são declaradas no início, o java vai fazer o carregamento das variáveis da classe primeiro, por questão disso nao ocorre erro
	
	/*
	 * visibilidade é sempre do escopo mais abrangente (maior) para o menor (específico), o contrário não é verdadeiro
	 */
	void teste2() {
		int a1 = 7; // variável de escopo local, pode criar outra variável com o mesmo nome, não haverá nenhum conflito pois estão em métodos diferentes
		System.out.println(a1); // referência a variável do escopo local, declarada dentro do método
		System.out.println(this.a1); // referencia a variável do escopo do objeto (variável de instância), delcarada na classe
		
		for (int j = 0; j < 10; j++) {
			// variável j criada no escopo do for não está disponível fora dele!
		}
		
		int i = 0;
		for (; i < 10; i++) {
			
		}
		
		System.out.println(i + " como a variável i foi delarada fora do escopo for ela pode ser visível e utilizada aqui!");
	}
}
