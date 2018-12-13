package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		
		System.out.printf("%b %b\n", bo1, bo2);
		
		//tipo primitivo caractere (todo caractere tem um inteiro associado)
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		
		System.out.printf("%c %c %c\n", c1, c2, c3);
		System.out.println(c1 + 0);
		//tipos primitivos inteiros
		
		byte b = 127; //(-129 e 128 estoura a capacidade da variável)
		short s = 32767;
		int i = 2_147_483_647; //underline é apenas para facilitar a leitura do número
		long l = 9_223_372_036_854_775_807L; // qualquer literal por padrão é um numero inteiro, para dizer que é um numero long tem que deixar explicito com 'L' no final
		
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		System.out.printf(Integer.toBinaryString(b)+ "\n"); // o primeiro bit (mais significativo) é zerado por ser positivo 
		System.out.printf(Integer.toBinaryString(s)+ "\n");
		System.out.printf(Integer.toBinaryString(i)+ "\n");
		System.out.printf(Long.toBinaryString(l)+ "\n");
		
		//tipos primitivos reais (ponto flutuante)
		float f = 3.1416F; //tem que deixar explicito que o número é um float, por padrão é um double
		double d = 2.45;
		System.out.printf("%f %f", f, d);
	}
}
