package com.sap.training5;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.exp(radius);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString(){
		return String.format("A %s circle with radius %f", color, radius);  
	}

}
