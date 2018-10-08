package com.sap.training5;


/**
 * Shapes
 */
public class Application {

	
	public static void main(String[] args) {
		Shape greenCricle = new Circle("green", 2.1);
		Shape redRectangle = new Rectangle("red", 0.4, 0.9);
		Shape blueSquare = new Square("blue", 2.0);
		
		// Print information about our circle
		System.out.println(greenCricle);
		System.out.println("The area is " + greenCricle.getArea());
		System.out.println("The perimeter is " + greenCricle.getPerimeter());
		System.out.println();
		
		// Print information about our rectangle
		System.out.println(redRectangle);
		System.out.println("The area is " + redRectangle.getArea());
		System.out.println("The perimeter is "+ redRectangle.getPerimeter());
		System.out.println();
		
		// Print information about our square
		System.out.println(blueSquare);
		System.out.println("The area is " + blueSquare.getArea());
		System.out.println("The perimeter is " + blueSquare.getPerimeter());
		System.out.println();
	
	}

}