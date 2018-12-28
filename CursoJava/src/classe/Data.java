package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data () {
		this(1, 1, 2017); // representa um construtor
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia; // representa um objeto atual em execução
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano); //não precisa referenciar com this pq o método que está chamando já está se referenciando a variável da instância, não há ocorrencia de conflito de variáveis
	}
}
