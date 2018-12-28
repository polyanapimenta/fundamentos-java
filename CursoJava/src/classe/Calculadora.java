package classe;

public class Calculadora {
	private double resultado;
	
	// metodo com entrada e saída
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// metodo sem saída
	void acrescentar(double a) {
		resultado += a;
	}
	
	// metodo sem entrada
	double obterResultado() {
		return resultado;
	}
	
	// metodo não recebe entrada nem tem saída
	void limpar() {
		resultado = 0;
	}
	
}
