package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "email@mariagmail.com");
		cookies.put("phone", "85894834");

		cookies.remove("email");
		cookies.put("phone", "999999");
		
		System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
		System.out.println("Phone number: "+cookies.get("phone"));
		System.out.println("Email: "+cookies.get("email")); //null
		System.out.println("Size: "+cookies.size());

		System.out.println("ALL COOKIES: ");

		for (String key : cookies.keySet()) {
			System.out.println(key+": "+cookies.get(key));
		}
	}
}
