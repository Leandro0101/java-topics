package application;

import javax.swing.JOptionPane;

import models.entities.AbstractShape;
import models.entities.Circle;
import models.entities.Rectangle;
import models.enums.Color;

public class Program {
	public static void main(String[] args) {
		
		double width = Double.valueOf(JOptionPane.showInputDialog("Enter rectangle width"));
		double height = Double.valueOf(JOptionPane.showInputDialog("Enter rectangle height"));
		double radius = Double.valueOf(JOptionPane.showInputDialog("Enter circle radius"));
		
		AbstractShape circle = new Circle(Color.BLUE, radius);
		AbstractShape rectangle = new Rectangle(Color.GREEN, height, width);
		
		JOptionPane.showMessageDialog(null, "COLOR: "+rectangle.getColor()+" \n AREA: "+rectangle.area(), "Rectangle", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "COLOR: "+circle.getColor()+" \n AREA: "+circle.area(), "Circle", JOptionPane.INFORMATION_MESSAGE);
	}
}
