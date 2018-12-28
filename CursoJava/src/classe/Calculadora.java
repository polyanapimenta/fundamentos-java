package classe;

public class Calculadora {
	private double resultado;
	
	// metodo com entrada e sa�da
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// metodo sem sa�da
	void acrescentar(double a) {
		resultado += a;
	}
	
	// metodo sem entrada
	double obterResultado() {
		return resultado;
	}
	
	// metodo n�o recebe entrada nem tem sa�da
	void limpar() {
		resultado = 0;
	}
	
}
