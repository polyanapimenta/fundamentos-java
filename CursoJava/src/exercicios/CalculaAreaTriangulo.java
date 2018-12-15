package exercicios;

import javax.swing.JOptionPane;

public class CalculaAreaTriangulo {
	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Insira o valor da base: ");
		String altura = JOptionPane.showInputDialog("Insira o valor da altura: ");
		
		// formula area = base * altura / 2
		
		double parseBase = Double.parseDouble(base);
		double parseAltura = Double.parseDouble(altura);
		double area = parseBase * parseAltura / 2;
		
		System.out.println("Área do trinângulo: " +  area + "m²");
	}
}
