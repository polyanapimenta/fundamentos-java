package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raioCircunferencia = 4.5;
		final double PI = 3.1416; //para definição de constantes
		double area = PI * raioCircunferencia * raioCircunferencia;
		
		System.out.println("Área é " + area + " m2."); // impressão concatenada
		System.out.printf("Área é %f m2.\n", area); //impressão formatada (leva em conta a configuração de idioma do pc, ou seja, português ele trocou o . por vírgula ,)
		System.out.printf("Área é %.2f m2", area); // delimitando casas decimais
	}
}
