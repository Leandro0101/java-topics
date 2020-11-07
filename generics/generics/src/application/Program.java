package application;

import javax.swing.JOptionPane;

import services.PrintService;

public class Program {
	public static void main(String[] args) {
		int n = Integer.valueOf(JOptionPane.showInputDialog("Enter number quantity"));
		PrintService printService = new PrintService(); 
		for(int i = 0; i < n; i++) {
			i++;
			printService.addValue(Integer.valueOf(JOptionPane.showInputDialog("Enter value"+i)));
			i--;
		}
		
		printService.print();
		
	}
}
