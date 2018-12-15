package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação"; 
		// conhecido como atribuição condicional, se verdadeiro resultado recebe aprovado se falso recebe recuperação
		
		System.out.println(resultado);
	}
}
