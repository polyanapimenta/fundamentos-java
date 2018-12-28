package classe;

public class ValorPadrao {
	
	static boolean a; // para variáveis de classe e de instancia, não precisam ser inicializadas, o java atribui valor padrão 0, false, e null
	
	public static void main(String[] args) {
		System.out.println(a);
		
		int b = 0; // uma variável local tem que ser inicializada explícita! se não ocorre o erro 'The local variable b may not have been initialized'
		Object c = null;
		System.out.println(c);
	}
}
