package api;

public class ExplorandoMath {
	
	public static void main(String[] args) {
		//na classe Math possui vários métodos statics ouseja, não precisamos criar uma instancia de Math para poder utiliza-los
		
		// sin, cos, tag, log..
		
		// todos métodos statics
		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 3)); // exponenciação 2^8
		System.out.println(Math.abs(-10.5));// retorna somente valores positivos
		System.out.println(Math.min(70, 7)); // retorna o menor valor para positivos e negativos
		System.out.println(Math.max(70, 7)); // retorna o maior valor para positivos e negativos
		System.out.println(Math.ceil(6.55)); // arredondamento de valor
		System.out.println(Math.floor(6.55)); // truncamento de valor
		System.out.println(Math.random()); // gera numeros aleatorios entre 0 e 1
	}
}
