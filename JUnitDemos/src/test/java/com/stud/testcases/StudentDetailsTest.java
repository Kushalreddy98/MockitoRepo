package com.stud.testcases;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stud.training.StudentDetails;
import com.voya.exception.InvalidNumException;

class StudentDetailsTest {
	StudentDetails studentDetails = null;

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
		studentDetails = new StudentDetails();
		System.out.println("called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		studentDetails = null;
		System.out.println("called after each test case");
	}

	@Test
	@DisplayName("Testing positive marks")
	void testTotalMarks() {
		int actual = studentDetails.totalMarks(10, 20, 30);
		assertEquals(60, actual, "Output should be 60");
	}
	@Test
	@Tag("Negative")
	@DisplayName("Testing Negative marks")
	void testNegativeMarks() throws InvalidNumException{
		assertThrows(InvalidNumException.class,()->studentDetails.totalMarks(102,-32,63));
	}
	
}
