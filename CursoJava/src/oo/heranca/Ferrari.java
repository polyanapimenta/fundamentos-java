package oo.heranca;

public class Ferrari extends Carro {

	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}

	// sobrescrita de metodo, alterar um comportamento que herdei de um método, e ainda sim
	// usar partes de comportamentos da classe Pai, a forma de como acessar  metodos da classe
	// pai é usando 'super', é a unica diferença entre acessar um metodo da classe pai ou da sua própria classe
	public void acelerar() {
		super.acelerarMais(20); // deixando explicito que estou acessando/referenciando um metodo da classe pai, mas como a classe Ferrari não tem um método com o nome acelerarMais() o super pode ser omitido
	}
	

}
