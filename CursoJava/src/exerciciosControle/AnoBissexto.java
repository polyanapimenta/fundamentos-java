package exerciciosControle;

import java.util.Scanner;

/*
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 * 
 * divisível por 4, resto igual a zero
 * não pode ser divisível por 100, resto diferente de 0
 * pode ser que seja divisível por 400 
 * 
 * situações de exemplo:
 * 
 * Primeira situação: Se o ano de 2015 ou 2016 for uma divisão exata em relação a 4, deveremos verificar, em seguida, se não é divisível por 100. Se não for, o ano será bissexto;
 * Segunda situação: Se o ano de 2015 ou 2016 não for divisível por 4, então deveremos verificar se ele é divisível por 400. Se também não for divisível, o ano de 2015 não será bissexto;
 * Terceira situação: Se o ano de 2015 ou 2016 não for divisível por 4, então devemos verificar se ele é divisível por 400. Caso seja, o ano de 2015 é bissexto.
 */

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		
		ano = scanner.nextInt();
		
		if (ano % 4 == 0) {
			if(ano % 100 != 0) {
				System.out.printf("O ano %d é bissexto", ano);
			} else {
				System.out.printf("O ano %d NÃO é bissexto", ano);
			}
		} else {
			if (ano % 400 == 0) {
				System.out.printf("O ano %d é bissexto", ano);
			} else {
				System.out.printf("O ano %d NÃO é bissexto", ano);
			}
		}
		scanner.close();
	}
}
