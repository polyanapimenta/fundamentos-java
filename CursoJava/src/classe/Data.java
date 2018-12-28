package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data () {
		this(1, 1, 2017); // representa um construtor
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia; // representa um objeto atual em execu��o
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano); //n�o precisa referenciar com this pq o m�todo que est� chamando j� est� se referenciando a vari�vel da inst�ncia, n�o h� ocorrencia de conflito de vari�veis
	}
}
