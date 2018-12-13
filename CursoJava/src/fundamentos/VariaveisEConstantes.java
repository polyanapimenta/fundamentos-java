package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raioCircunferencia = 4.5;
		final double PI = 3.1416; //para defini��o de constantes
		double area = PI * raioCircunferencia * raioCircunferencia;
		
		System.out.println("�rea � " + area + " m2."); // impress�o concatenada
		System.out.printf("�rea � %f m2.\n", area); //impress�o formatada (leva em conta a configura��o de idioma do pc, ou seja, portugu�s ele trocou o . por v�rgula ,)
		System.out.printf("�rea � %.2f m2", area); // delimitando casas decimais
	}
}
