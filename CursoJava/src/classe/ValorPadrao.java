package classe;

public class ValorPadrao {
	
	static boolean a; // para vari�veis de classe e de instancia, n�o precisam ser inicializadas, o java atribui valor padr�o 0, false, e null
	
	public static void main(String[] args) {
		System.out.println(a);
		
		int b = 0; // uma vari�vel local tem que ser inicializada expl�cita! se n�o ocorre o erro 'The local variable b may not have been initialized'
		Object c = null;
		System.out.println(c);
	}
}
