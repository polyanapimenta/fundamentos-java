package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;  // (-1) operador negativo em um número é unário (opera em cima de um único operando)
		int num2 = 2;
		
		// Incremento e decremento (diferença está na precedencia)
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		System.out.println("num1: " + num1 + "\nnum2: " + num2);
		System.out.println(++num1 == num2--); // péssimo código, difícil leitura (tem que ficar raciocinando sobre o que está acontecendo)
		
		// pré fixada = incremento antes da comparação
		// pós fixado = decremento depois da operação de comparação
		
		System.out.println("num1: " + num1 + "\nnum2: " + num2);
		
		// Complemento binário (inverter cada um dos bits de um inteiro)
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50)); // invertendo digítos binários
		
		// negação
		System.out.println(!true);
	}
}
