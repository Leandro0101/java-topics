package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	private final String path = "C:\\Users\\leand\\Documents\\products.txt";
	private String[] lists;

	public Product() {
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Nome: " + name + ", Preço: R$ " + String.format("%.2f", price) + ", Quantidade: " + quantity;
	}

	public void addProductInList() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(this.toString());
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> getList() {
		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
