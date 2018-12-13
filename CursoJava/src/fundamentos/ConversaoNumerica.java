package fundamentos;

public class ConversaoNumerica {
	public static void main(String[] args) {
		// Conversão explícita (cast), entre parênteses é o tipo de dado que será convertido
		float f = (float) 0.1;
		System.out.println(f);
		
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// conversão implícita, conversão automática
		int i2 = 'a'; //pq char implicitamente possui valor inteiro associado a ele que são o valor de código da tabela
		System.out.println(i2);
		
		double d = 1001; // transforma para decimal
		System.out.println(d);
	}
}
