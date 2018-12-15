package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;  // (-1) operador negativo em um n�mero � un�rio (opera em cima de um �nico operando)
		int num2 = 2;
		
		// Incremento e decremento (diferen�a est� na precedencia)
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		System.out.println("num1: " + num1 + "\nnum2: " + num2);
		System.out.println(++num1 == num2--); // p�ssimo c�digo, dif�cil leitura (tem que ficar raciocinando sobre o que est� acontecendo)
		
		// pr� fixada = incremento antes da compara��o
		// p�s fixado = decremento depois da opera��o de compara��o
		
		System.out.println("num1: " + num1 + "\nnum2: " + num2);
		
		// Complemento bin�rio (inverter cada um dos bits de um inteiro)
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50)); // invertendo dig�tos bin�rios
		
		// nega��o
		System.out.println(!true);
	}
}
