package exercicios;

import javax.swing.JOptionPane;

public class CalculaQuadradoCubo {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Insira um número: ");
		double quadrado;
		double cubo;
		
		double parseNum = Double.parseDouble(num1);
		
		quadrado = Math.pow(parseNum, 2);
		cubo = Math.pow(parseNum, 3);
		
		System.out.printf("Quadrado de %.0f => %.0f\n", parseNum, quadrado);
		System.out.printf("Cubo de %.0f => %.0f", parseNum, cubo);
	}
}
