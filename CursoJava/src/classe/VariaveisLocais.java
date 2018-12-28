package classe;

public class VariaveisLocais {
	
	int a = 2;
	int a1 = 8; // vari�vel de inst�ncia, do objeto
	
	void teste1() {
		
		System.out.println(a + b);
		//System.out.println(a1);
		
		int a1 = 4; // vari�vel de escopo, apenas vis�vel dentro deste m�todo
		/*
		 * obs.: dentro de m�todos, a execu��o � sequ�ncial (serial), ent�o a ordem de declara��o � fundamental, ou seja se eu printar a vari�vel a1 antes de te-la declarado dentro do m�todo, ela n�o estar� dispon�vel para uso, vai constar como se ela n�o existisse, ou como n�o tivesse sido declarada ainda
		 */
		
		if(a1> 3) {
			int a2 = 1;
		}
		//System.out.println(a2); // vari�vel a2 n�o existe fora do escopo de declara��o do bloco if
	}
	int b = 3; // vari�vel de inst�ncia n�o tem problema serem declaradas depois dos m�todos, mas por padr�o elas s�o declaradas no in�cio, o java vai fazer o carregamento das vari�veis da classe primeiro, por quest�o disso nao ocorre erro
	
	/*
	 * visibilidade � sempre do escopo mais abrangente (maior) para o menor (espec�fico), o contr�rio n�o � verdadeiro
	 */
	void teste2() {
		int a1 = 7; // vari�vel de escopo local, pode criar outra vari�vel com o mesmo nome, n�o haver� nenhum conflito pois est�o em m�todos diferentes
		System.out.println(a1); // refer�ncia a vari�vel do escopo local, declarada dentro do m�todo
		System.out.println(this.a1); // referencia a vari�vel do escopo do objeto (vari�vel de inst�ncia), delcarada na classe
		
		for (int j = 0; j < 10; j++) {
			// vari�vel j criada no escopo do for n�o est� dispon�vel fora dele!
		}
		
		int i = 0;
		for (; i < 10; i++) {
			
		}
		
		System.out.println(i + " como a vari�vel i foi delarada fora do escopo for ela pode ser vis�vel e utilizada aqui!");
	}
}
