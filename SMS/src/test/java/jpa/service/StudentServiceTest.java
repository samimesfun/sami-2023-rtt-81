package jpa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Student;

public class StudentServiceTest {

	@Test
	@Order(1)
	public void getStudentByEmail() {
		// Test data
		String email = "hluckham0@google.ru";
		Student expected = new Student();
		expected.setsEmail(email);
		// Method under test
		StudentService studentService = new StudentService();
		// Call method under test
		Student actual = studentService.getStudentByEmail(email);
		// Assertions
		Assertions.assertEquals(expected.getsEmail(), actual.getsEmail());

	}

}
