package oo.heranca;

public class Ferrari extends Carro {

	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}

	// sobrescrita de metodo, alterar um comportamento que herdei de um m�todo, e ainda sim
	// usar partes de comportamentos da classe Pai, a forma de como acessar  metodos da classe
	// pai � usando 'super', � a unica diferen�a entre acessar um metodo da classe pai ou da sua pr�pria classe
	public void acelerar() {
		super.acelerarMais(20); // deixando explicito que estou acessando/referenciando um metodo da classe pai, mas como a classe Ferrari n�o tem um m�todo com o nome acelerarMais() o super pode ser omitido
	}
	

}
