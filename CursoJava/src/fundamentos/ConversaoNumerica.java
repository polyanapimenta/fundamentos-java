package fundamentos;

public class ConversaoNumerica {
	public static void main(String[] args) {
		// Convers�o expl�cita (cast), entre par�nteses � o tipo de dado que ser� convertido
		float f = (float) 0.1;
		System.out.println(f);
		
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// convers�o impl�cita, convers�o autom�tica
		int i2 = 'a'; //pq char implicitamente possui valor inteiro associado a ele que s�o o valor de c�digo da tabela
		System.out.println(i2);
		
		double d = 1001; // transforma para decimal
		System.out.println(d);
	}
}
