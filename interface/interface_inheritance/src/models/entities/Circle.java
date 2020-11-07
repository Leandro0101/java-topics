package models.entities;

import models.enums.Color;

public class Circle extends AbstractShape {
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * 3.14;
	}

}
