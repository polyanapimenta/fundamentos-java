package classe;

public class Desafio {
	
	int a = 2;
	
	public static void main(String[] args) {
		// Desafio: acessar e imprimir o valor de a no console
		
		Desafio desafio = new Desafio(); // se a vari�vel n�o � est�tica (static), ela � um atributo da inst�ncia de um objeto, logo temos que instanciar um objeto dessa classe para poder acessar esse atributo 
		System.out.println(desafio.a);
	}
}
