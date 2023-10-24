package com.simplilearn.JUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
public class _02_CheckerTest {

	_02_Checker checker;

	@BeforeAll
	void initialize() {

		checker = new _02_Checker();
	}

	@Order(1)
	@ParameterizedTest(name = "{index} - {0} is a palindrome")
	@ValueSource(strings = { "12321", "pop", "noon", "racecar" })
	void testPalindrome(String word) {

		assertTrue(checker.isPalindrome(word));
	}

	@Order(2)
	@ParameterizedTest(name = "{index} - {0} is a palindrome")
	@ValueSource(strings = { "hello", "java", "learn" })
	void testNotPalindrome(String word) {

		assertFalse(checker.isPalindrome(word));
	}
}
