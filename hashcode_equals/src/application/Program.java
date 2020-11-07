package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		Client c1 = new Client("Leandro", "leandro@gmail.com");
		Client c2 = new Client("Leandro", "leandro@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//true
		System.out.println(c1 == c2); //false
	}
}
