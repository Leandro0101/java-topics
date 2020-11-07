package program;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Shape;
import entities.enums.Color;
import entities.Rectangle;
import entities.Circle;

public class Program {
	public static void main(String[] args) {
		int n = Integer.valueOf(JOptionPane.showInputDialog("How many figures?"));
		List<Shape> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			Color color = Color.valueOf(JOptionPane.showInputDialog("Color"));

			String figure = JOptionPane.showInputDialog("What's figure?");

			if (figure.equals("r")) {
				double width = Double.valueOf(JOptionPane.showInputDialog("width:"));
				double height = Double.valueOf(JOptionPane.showInputDialog("height:"));
				list.add(new Rectangle(color, width, height));
			} else {
				double radius = Double.valueOf(JOptionPane.showInputDialog("radius:"));
				list.add(new Circle(color, radius));
			}

		}

		for (Shape shape : list) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", shape.area()));
		}
	}
}
