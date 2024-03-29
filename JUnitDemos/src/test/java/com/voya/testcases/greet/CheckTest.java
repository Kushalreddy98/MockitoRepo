package com.voya.testcases.greet;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckTest {

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

		System.out.println("called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {

		System.out.println("called after each test case");
	}

	@Test
	@DisplayName("Testing  null")
	void testNull() {
		List<String> myList = null;
		assertNull(myList);
	}

	@Test
	@DisplayName("Testing  null")
	void testNotNull() {
		List<String> myList = new ArrayList<String>();
		assertNotNull(myList);
	}

	@Test
	@DisplayName("Testing String null")
	void testSame() {
		String username = "Kushal";
		String nusername = "Kushal";
		assertSame(username, nusername);
	}

}
