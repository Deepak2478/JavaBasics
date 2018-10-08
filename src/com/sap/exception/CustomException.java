package com.sap.exception;

public class CustomException extends Exception {
	
	String str1;
	public CustomException(String str)
	{
		str1 = str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" ----"+this.str1;
	}
	

}
