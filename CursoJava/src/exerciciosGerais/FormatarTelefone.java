package exerciciosGerais;

public class FormatarTelefone {
	public static void main(String[] args) {
		String telefone = "00-44 48 5555 8361";
		char[] formatado;
		int i = 0;
		int inc = 2;
		
		telefone = telefone.replace(" ", "");
		telefone = telefone.replace("-", "");
		formatado = telefone.toCharArray();
		
		for (char numero: formatado) {

			System.out.print(numero);
			
			if(i == inc) {
				System.out.print("-");
			} 
			i++;
			if (i > inc) {
				inc += 3;
			}
		}
	}
}
