package com.sap.exception;

public class MyException extends Exception {
	
	public String str;
	
	public MyException(String str2)
	{
		str = str2;
	}

	@Override
	public String toString() {
		return "MyException [str=" + str + ", toString()=" + super.toString() + "]";
	}
	

}
