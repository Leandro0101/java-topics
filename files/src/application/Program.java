package application;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		int n = Integer.valueOf(JOptionPane.showInputDialog("How many products?"));
		
		Product product = new Product();
		
		for(int i = 1; i <= n; i++) {
			String name = JOptionPane.showInputDialog("Enter product "+i+" name: ");
			double price = Double.valueOf(JOptionPane.showInputDialog("Enter product "+i+" price: "));
			int quantity = Integer.valueOf(JOptionPane.showInputDialog("Enter product "+i+" quantity: "));
			product.setName(name);
			product.setPrice(price);
			product.setQuantity(quantity);
			product.addProductInList();
			JOptionPane.showMessageDialog(null, "Product "+i+" added!");
		}
		
		for(String item : product.getList()) {
			System.out.println(item);
		}
	}

}
