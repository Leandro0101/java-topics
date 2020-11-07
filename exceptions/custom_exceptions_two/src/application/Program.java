package application;

import javax.swing.JOptionPane;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {
	public static void main(String[] args) {
		
		try {
		int accountNumber = Integer.valueOf(JOptionPane.showInputDialog("Enter account number"));
		String holder = JOptionPane.showInputDialog("Enter the holder");
		double initialBalance = Double.valueOf(JOptionPane.showInputDialog("Enter the initial balance"));
		double withDrawLimit = Double.valueOf(JOptionPane.showInputDialog("Enter the withdraw limit"));
		
		Account account = new Account(accountNumber, holder, initialBalance, withDrawLimit);
		
		double withDrawValue = Double.valueOf(JOptionPane.showInputDialog("Enter the withdraw value"));
		account.withDraw(withDrawValue);
		
		JOptionPane.showMessageDialog(null, "New balance: "+account.getBalance());
		}
		catch(AccountException e) {
			JOptionPane.showMessageDialog(null, e);	
		}
		
	}
}
