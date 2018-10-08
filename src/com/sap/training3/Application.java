package com.sap.training3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input[] = in.nextLine().split(" ");
		// Read parameters
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		String op = input[2];
		
		// Execute operation
		switch (op) {
		case "ADD":
			add(a, b);
			break;
		case "SUB":
			substract(a, b);
			break;
		case "MTP":
		case "MLP":
			multiply(a, b);
			break;
		case "DIV":
			divide(a, b);
			break;
		default:
			System.out.println("Please choose a valid operation");
		}
	}

	private static void add(int a, int b) {
		int result = a +b;
		System.out.println("The result is "+result);
	}
	
	private static void substract(int a, int b) {
		int result = a  - b;
		System.out.println("The result is "+result);
	}
	

	private static void multiply(int a, int b) {
		int result = a;
		for (int i = 0; i < b; i++) {
			result+=a;
		}
		System.out.println("The result is "+result);
	}
	
	private static void divide(int a, int b) {
		int result = 0;
		while(b < a){
			a = a - b;
			result++;
		}
		System.out.println("The result is "+ result + " left "+a);
	}

}

