package avancado.varargs;

public class Jantar {
	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		Pessoa pessoa = new Pessoa(80.7);
		
		// novo jeito: passando quantos parametros quiser, com uma única chamada, isso se deu por causa do uso do Varargs(quantidade de argumentos variáveis)
		pessoa.comer(arroz, feijao, sorvete);
		
		//pessoa.comer(feijao); jeito antigo
		//pessoa.comer(sorvete);
		
		System.out.println(pessoa.getPeso());
	}
}
