package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recupera��o"; 
		// conhecido como atribui��o condicional, se verdadeiro resultado recebe aprovado se falso recebe recupera��o
		
		System.out.println(resultado);
	}
}
