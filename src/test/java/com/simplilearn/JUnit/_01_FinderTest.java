package com.simplilearn.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class _01_FinderTest {

	_01_Finder finder;

	@BeforeAll
	void initialize() {

		/*
		 * The method with @BeforeAll are executed ONLY one time before the tests
		 * 
		 * For instance: If our tests uses a DB, we can create the connection here. If
		 * our tests uses a file, we can open the file here.
		 */

		System.out.println("@BeforeAll: Finder Initialized");
		finder = new _01_Finder();
	}

	@Test
	void testFindMaxPositive() {
		int[] arr = { 1, 3, 4, 2 };

		Assertions.assertEquals(4, finder.findMax(arr));
		Assertions.assertNotEquals(Integer.MIN_VALUE, finder.findMax(arr));
	}
	
	@Test
	void testFindMaxNegative() {
		int[] arr = { -12, -1, -3, -4, -2 };

		Assertions.assertEquals(-1, finder.findMax(arr));
		Assertions.assertNotEquals(Integer.MIN_VALUE, finder.findMax(arr));
	}
	
	@Test
	void testFindMaxMixedNumbers() {
		int[] arr = { -12, 7, -3, 0, -2 };

		Assertions.assertEquals(7, finder.findMax(arr));
		Assertions.assertNotEquals(Integer.MIN_VALUE, finder.findMax(arr));
	}
}
