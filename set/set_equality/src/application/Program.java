package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1900.00));
		set.add(new Product("Tablet", 1200.00));
		
		Product prod = new Product("Notebook", 1900.00);
		 
		System.out.println(set.contains(prod));
		
		
	}
}
