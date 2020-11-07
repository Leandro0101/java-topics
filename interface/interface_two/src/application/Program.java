package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date contractDate = sdf.parse(JOptionPane.showInputDialog("Enter contract date"));
		double contractValue = Double.valueOf(JOptionPane.showInputDialog("Enter contract value"));
		int installmentsNumber = Integer.valueOf(JOptionPane.showInputDialog("How many installments?"));
		int contractNumber = Integer.valueOf(JOptionPane.showInputDialog("Enter contract number"));
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		OnlinePaymentService onlinePaymentService = new PaypalService();
		ContractService contractService = new ContractService(onlinePaymentService);
		contractService.processContract(contract, installmentsNumber);
		
		int i = 1;
		for(Installment installment : contract.getInstallments()) {
			JOptionPane.showMessageDialog(null, "DUE DATE: "+sdf.format(installment.getDueDate())+" \n INSTALLMENT VALUE: R$"+installment.getAmount(), "Parcela "+i, JOptionPane.INFORMATION_MESSAGE);
			i++;
		}
	}
}