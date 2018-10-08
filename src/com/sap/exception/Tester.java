package com.sap.exception;

public class Tester {
	public static void main(String args[]) 
	{
		try {
			throw new MyException("custom");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			//e.printStackTrace();
		}
	}

}
