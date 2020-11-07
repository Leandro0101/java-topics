package application;

import javax.swing.JOptionPane;

//import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {
	public static void main(String[] args) {
		double amount = Double.valueOf(JOptionPane.showInputDialog("Enter loan amount"));
		int months = Integer.valueOf(JOptionPane.showInputDialog("Enter months amount"));
		
//		InterestService interestService = new BrazilInterestService(1.0);
		InterestService interestService = new UsaInterestService(2.0);
		
		JOptionPane.showMessageDialog(null, String.format("%.2f", interestService.payment(amount, months)));
	}
}
