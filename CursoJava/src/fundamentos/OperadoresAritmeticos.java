package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		//Operadores: + - * / % 
		
		// processado da esquerda para a direita:
		int soma =  num1 + num2 + num3 + 6; 
		System.out.println(soma);
		
		System.out.println(num1 - num2 - num3);
		
		// cuidado com a preced�ncia
		System.out.println(num1 + num3 * num2 / 2); // multiplica��o e divis�o primeiro
		System.out.println((num1 + num3) * num2 / 2);
		
		// Resto da divis�o
		System.out.println(10 % 3); // resto 1 �mpar, resto 0 par
	}
}
