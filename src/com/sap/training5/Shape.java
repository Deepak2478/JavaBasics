package com.sap.training5;

abstract public class Shape {
	
	protected String color;
	
	public Shape(String color){
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	abstract public double getArea();
	abstract public double getPerimeter();
	
	@Override
	public String toString(){
		return String.format("A %s shape that is %s", color);  
	}

}