package org.sap.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	   @Test
	   public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine--",str);
	   }
}
