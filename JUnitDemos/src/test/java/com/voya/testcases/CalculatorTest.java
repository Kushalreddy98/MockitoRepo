package com.voya.testcases;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all test cases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("called after each test case");
	}

	@Test
	@Disabled
	void testSum() {
		int actual=calculator.sum(10, 20);
		assertEquals(30, actual,"Output should be 30");
	}
	@Test
	@Tag("Second")
	void testProduct() {
		int actualProduct=calculator.product(10, 20);
		assertEquals(200, actualProduct,"Output should be 200");
	}
	
	@Test
	@Tag("Simple")
	void testGreet() {
		String actual=calculator.greet("kushal");
		assertEquals("welcome KUSHAL",actual,"Output is welcome KUSHAL");
	}
	@Test
	@Tag("First")
	void testShowCourses() {
		List<String> expected=Arrays.asList("Angular","CSS","Html","Java","Spring");
		List<String> courseInput=Arrays.asList("Angular","CSS","Html","Java","Spring");
		List<String> actual=calculator.showCourses(courseInput);
		assertEquals(expected, actual);
	}


}
