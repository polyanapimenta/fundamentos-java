package colecoes;

public class Endereco {

	String logradouro;
	int numero;
	String complemento;

	Endereco(String logradouro, int numero, String complemento) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	// hashCode ele gera um numero extamente o mesmo para os dados baseados nos
	// valores: de logradouro, numero e complemento e que ele seja o mais diferente
	// possivel um dos outros uma "indexacao" "atribuicao" "classificacao" única
	// aquele dado

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + numero;
		return result;
	}

	// o equals vai fazer diversas comparacoes e testes para saber se o complemento
	// é igual ao outro complemento, se o logradouro é igual ao outro, irá
	// compararar cada um dos dados de tal forma que se eles forem iguais o
	// resultados vai ser true ou false caso haja algum dado desses dentro dessas 3
	// comparacoes que não batem ou não sejam iguais.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
