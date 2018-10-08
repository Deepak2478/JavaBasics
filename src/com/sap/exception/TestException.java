package com.sap.exception;

public class TestException {
	public static void main(String args[])
	{
		try {
			throw new CustomException("custom exception");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
