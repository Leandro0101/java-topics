package models.entities;

import models.enums.Color;

public class Rectangle extends AbstractShape {

	private Double height;
	private Double width;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}

}
