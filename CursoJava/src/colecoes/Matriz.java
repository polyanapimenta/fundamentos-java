package colecoes;

public class Matriz {
	public static void main(String[] args) {
		//declaração literal matriz (array) de duas dimensões 2x2
		
		double[][] notasJoao = {{7.7, 8.6}, {6.2, 9.7}};
		
		// outro jeito: declaração manual no new double[2][] o 2 referencia o array externo que tera 2 quantidades, dentro dessas duas quantidades terão cada um array com n qauntidades que não precisa informar nesta declaração, apenas quando for inserir os dados
		double[][] notasPedro = new double[2][];
		notasPedro[0] = new double [2]; //agr sim, quando for delcarar o array, declarando a qtd que terá o array interno da coluna 0
		notasPedro[1] = new double [2];
		
		notasPedro[0][0] = 7.7; //atribuindo valor na posição do array
		notasPedro[0][1] = 8.6;
		
		notasPedro[1][0] = 6.2;
		notasPedro[1][1] = 9.7;
		
		// calculando média das notas
		double totalJoao = 0;
		int qtdNotasJoao = 0;
		
		// duas interações, no laço externo (duas dimensoes do array) e no laço interno (os dados dentro do array)
		for (int i = 0; i < notasJoao.length; i++) {
			for (int j = 0; j < notasJoao[i].length; j++) {
				totalJoao += notasJoao[i][j];
				qtdNotasJoao++;
			}
		}
		
		double totalPedro = 0;
		double qtdNotasPedro = 0;
		
		// usando for each
		for (double[] notasParciais: notasPedro) { // interar sobre o array externo
			for (double nota: notasParciais) { // interar sobre o array interno
				totalPedro += nota;
				qtdNotasPedro++;
			}
		}
		
		System.out.println(totalJoao / qtdNotasJoao);
		System.out.println(totalPedro / qtdNotasPedro);
	}
}
