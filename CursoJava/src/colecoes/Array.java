package colecoes;

public class Array {

	public static void main(String[] args) {
		double[] notasJoao = { 7.0, 8.7, 6.2, 4.9, 9.7 };

		double[] notasPedro = new double[5]; // forma chamando o construtor, é obrigatório informar o tamanho do array,
												// por ser fixo e não poder variar, este tamanho não muda uma vez que
												// foi criado o array
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;

		double totalJoao = 0;
		// for each percorre o indice do começo ao fim, varredura padrap (double dado: arrayAPercorrer)
		for (double nota: notasJoao) {
			totalJoao += nota;
		}
		
//		for (int i = 0; i < notasJoao.length; i++) {
//			totalJoao += notasJoao[i];
//		}

		double totalPedro = 0;
		for (double nota: notasPedro) {
			totalPedro += nota; // não precisa informar indice, pq ele já tem
		}
		
//		for (int i = 0; i < notasPedro.length; i++) {
//			totalPedro += notasPedro[i];
//		}

		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
	}
}
