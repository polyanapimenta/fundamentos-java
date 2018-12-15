package exercicios;

import javax.swing.JOptionPane;

public class ConversaoFahrenheitCelsius {
	public static void main(String[] args) {
		String temperaturaF = JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit: ");
		float temperaturaC;
		
		// Fórmula	(0 °F − 32) × 5/9 = -17,78 °C

		temperaturaC = (Float.parseFloat(temperaturaF) - 32) * 5/9;
		System.out.println("Conversão equivalente: ");
		System.out.println(temperaturaF + "°F = " + temperaturaC + "°C");
	}
}
