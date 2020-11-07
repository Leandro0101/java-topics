package program;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		int n = Integer.valueOf(JOptionPane.showInputDialog("How many?"));

		for (int i = 1; i <= n; i++) {

			JOptionPane.showMessageDialog(null, "Employee " + n + " data:");

			String name = JOptionPane.showInputDialog("name:");
			int hours = Integer.valueOf(JOptionPane.showInputDialog("How many hours?"));
			double valuePerHour = Double.valueOf(JOptionPane.showInputDialog("How many per hour?"));
			String select = JOptionPane.showInputDialog("Outsourced? y/n");

			if (select.equals("y")) {
				double additionalCharge = Double.valueOf(JOptionPane.showInputDialog("Additional charge:"));

				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		for(Employee employee : list ) {
			JOptionPane.showMessageDialog(null, "Name: "+employee.getName()+ " \n Payment: "+employee.payment());
		}

	}

}
