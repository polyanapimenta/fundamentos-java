package exercicios;

import javax.swing.JOptionPane;

public class ConversaoCelsiusFahrenheit {
	public static void main(String[] args) {
		String temperaturaC = JOptionPane.showInputDialog("Insira a temperatura em Celsius");
		float temperaturaF;
		
		// F�rmula	(0 �C � 9/5) + 32 = 32 �F
		
		temperaturaF = Float.parseFloat(temperaturaC) * 9/5 + 32;
		System.out.println("Convers�o equivalente:");
		System.out.println(temperaturaC + "�C = " + temperaturaF + "�F");
	}
}
