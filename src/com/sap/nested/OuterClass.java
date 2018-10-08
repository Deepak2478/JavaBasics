package com.sap.nested;

import java.lang.reflect.InvocationTargetException;

import com.sap.training6.Person;

public class OuterClass {
	
	private int x =10;
	
	class InnerClass{
	    public void getX(){
	    	System.out.println("x is :"+x);
	    }	
	}
	static class InnerStaticClass{
		public void getValX()
		{
			System.out.println("x from static is :"+new OuterClass().x);
		}
	}
	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		OuterClass outerClass = new OuterClass();
		InnerClass innerClass = outerClass.new InnerClass();
		
		OuterClass outClass = new OuterClass(){
			public void test()
			{
				System.out.println("dummy text");
			}
		};
		outClass.getClass().getMethod("test").invoke(outClass);
		
		 OuterClass class1 = new OuterClass();
		
		//
		OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
		innerStaticClass.getValX();
		
		Person person = new Person(""){
			public void test(){
				
			}
		};
	}

}
