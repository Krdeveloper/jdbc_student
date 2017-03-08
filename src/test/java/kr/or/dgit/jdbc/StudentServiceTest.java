package kr.or.dgit.jdbc;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.service.StudentService;


public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testInsertStudent() {
		Student insStudent = new Student(3, "김두환", "kdh@test.co.kr", new Date());
		int res = studentService.insertStudent(insStudent);
		Assert.assertEquals(1, res);
	}

}
