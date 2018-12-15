package exercicios;

import javax.swing.JOptionPane;

public class CalculoIMC {
	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Informe seu peso (kg): ");;
		String altura  = JOptionPane.showInputDialog("Informe sua altura (m): ");;
		double imc;
	
		float parsePeso = Float.parseFloat(peso);
		float parseAltura = Float.parseFloat(altura);
		
		// formula: peso / (altura * altura);
		imc = parsePeso / Math.pow(parseAltura, 2); 
		
		System.out.println("Calculo IMC: ");
		System.out.printf("Peso: %.2f kg\nAltura: %.2f m\nIMC: %.2f", parsePeso, parseAltura, imc);
	}
}
