package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			int numberRoom = Integer.valueOf(JOptionPane.showInputDialog("Enter the room number"));
			Date checkIn = sdf.parse(JOptionPane.showInputDialog("Enter check-in date"));
			Date checkOut = sdf.parse(JOptionPane.showInputDialog("Enter check-out date"));
			Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
			
			JOptionPane.showMessageDialog(null, "Reservation: " + reservation);
			JOptionPane.showMessageDialog(null, "Enter data to update the reservation");

			checkIn = sdf.parse(JOptionPane.showInputDialog("Enter check-in date"));
			checkOut = sdf.parse(JOptionPane.showInputDialog("Enter check-out date"));

			reservation.updateDates(checkIn, checkOut);		
			JOptionPane.showMessageDialog(null, "Reservation: " + reservation);
	
		}
		catch(ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid date format");
		}
		catch(DomainException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}

}
