package com.sap.training5;

public class Rectangle extends Shape {

	private double length, height;

	public Rectangle(String color, double length, double height) {
		super(color);
		this.length = length;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return length * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * length + 2 * height;
	}
	
	@Override
	public String toString(){
		return String.format("A %s rectangle with length %f and height %f", color, length, height);  
	}

}