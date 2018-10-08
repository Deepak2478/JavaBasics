package org.sap.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.deep.PermutationString;
import com.sap.training6.Person;

public class JunitTestExample {

	private ArrayList testList;

	@BeforeClass

	public static void onceExecutedBeforeAll() {

		System.out.println("@BeforeClass: onceExecutedBeforeAll");

	}

	@Before

	public void executedBeforeEach() {

		testList = new ArrayList();

		System.out.println("@Before: executedBeforeEach");

	}

	@Test(expected = Exception.class)

	public void EmptyCollection() throws Exception {

		assertTrue(testList.isEmpty());
		throw new Exception();
		//System.out.println("@Test: EmptyArrayList");
		

	}

	@Test

	public void OneItemCollection() {

		testList.add("oneItem");

		assertEquals(1, testList.size());

		System.out.println("@Test: OneItemArrayList");

	}

}
