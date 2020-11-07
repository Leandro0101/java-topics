package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 3, 9);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Leandro", "José", "Vitor");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
