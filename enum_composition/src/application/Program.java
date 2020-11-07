package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Department department = new Department(JOptionPane.showInputDialog("Type your department"));

		String workerName = JOptionPane.showInputDialog("Type your name");

		WorkerLevel workerLevel = WorkerLevel.valueOf(JOptionPane.showInputDialog("Type your level"));

		Double workerBaseSalary = Double.valueOf(JOptionPane.showInputDialog("Type your base salary"));

		Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, department);
		
		//testando o stringbuilder
		
		System.out.println(worker);

		int n = Integer.valueOf(JOptionPane.showInputDialog("How many contracts to this worker?"));

		
		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, i + "º contract");

			String date = JOptionPane.showInputDialog("Date:");

			Date dateContract = sdf.parse(date);

			Double valuePerHour = Double.valueOf(JOptionPane.showInputDialog("Value per hour"));

			int hours = Integer.valueOf(JOptionPane.showInputDialog("How many hours?"));

			HourContract contract = new HourContract(dateContract, valuePerHour, hours);

			worker.addContract(contract);
		}

		JOptionPane.showMessageDialog(null, "Ente year and month to calculate  income (MM/yyyy)");

		String yearAndMonth = JOptionPane.showInputDialog("Data");

		int month = Integer.valueOf(yearAndMonth.substring(0, 2));

		int year = Integer.valueOf(yearAndMonth.substring(3));

		JOptionPane.showMessageDialog(null, "Name: " + worker.getName() + "\n Department: "
				+ worker.getDepartment().getName() + "\n Income: " + worker.income(year, month));

	}

}
