package application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) throws HeadlessException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		Date start = sdf.parse(JOptionPane.showInputDialog("Enter start date"));
		Date finish = sdf.parse(JOptionPane.showInputDialog("Enter finish date"));
		String carModel = JOptionPane.showInputDialog("Enter car model");

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		double pricePerHour = Double.valueOf(JOptionPane.showInputDialog("Enter price per hour"));
		double pricePerDay = Double.valueOf(JOptionPane.showInputDialog("Enter price per day"));

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);

		JOptionPane.showMessageDialog(
			null,"BASIC PAYMENT: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()) +
			" \n TAX: " + carRental.getInvoice().getTax()
			+ "\n TOTAL PAYMENT: "+ carRental.getInvoice().getTotalPayment(),
			"INVOICE", JOptionPane.INFORMATION_MESSAGE);

	}
}
