package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//utilizando Wrapper
		int num2 = 20000;
		System.out.println(Integer.toString(num2).length());
		
		//concatenando o numero com uma String vazia = uma string
		System.out.println(("" + num2).length());
		
		Long num3 = 345555L;
		System.out.println(num3.toString().length());
		
		long num4 = 6788403L;
		System.out.println(Long.toString(num4).length());
		
		
	}
}
