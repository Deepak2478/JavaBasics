package com.sap.training5;

public class Square extends Rectangle{

	public Square(String color, double size) {
		super(color, size, size);
	}

	@Override
	public void setLength(double length) {
		super.setHeight(length);
		super.setLength(length);
	}

	@Override
	public void setHeight(double height) {
		super.setLength(height);
		super.setHeight(height);
	}
	
}
