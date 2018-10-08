package com.sap.nested;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class MyOuter {

	private int x=6;
	//non static inner class can access private members of outer class
	class Inner{
		public void seeOuter()
		{
			System.out.println("Output is : "+x);
		}
	}
	//static clases donot have the direct access to the members of enclosing class	
	static class TestStatic{
		public void seeOuter()
		{
			System.out.println("Static block output is : "+new MyOuter().x);
		}
	}
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		MyOuter outer = new MyOuter();
		MyOuter.Inner inner = outer.new Inner(){
			public void test()
			{
				System.out.println("print something");
			}
		};
		// for invoking the inner class
		inner.seeOuter();
		//for invoking the anonymous class of the inner class
		inner.getClass().getDeclaredMethod("test").invoke(inner);
		//for invoking the static inner class
		MyOuter.TestStatic staticClassObj = new MyOuter.TestStatic();
		staticClassObj.seeOuter();
		
		
		/*1. An object of a Non-static inner class is associated with an instance/object of its Outer Class (ie enclosing class).

		2. The entire body of a Non-static inner class is Not within a static scope, and therefore you can't have static members in there.

		3. Instance variables and methods in the non-static inner class are relative to an instance of the enclosing class, so being related to an object, static won't hold true for them (ie inner class),

		4. When we create an Instance of non-static inner class, we Need an Object of Outer enclosing class. The innernon-static class has an implicit reference to it outer enclosing class
		*/
	}
	
}
