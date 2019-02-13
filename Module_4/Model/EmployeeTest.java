package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Employee;

public class EmployeeTest {
	private Employee employee;
	
	@Before
	public void before() {
		this.employee = new Employee("Texas Steve", "123");
		
	}

	@Test
	public void testGetName() {
		assertTrue(employee.getName().equals("Texas Steve"));
	}
	
	@Test
	public void testGetId() {
		assertTrue(employee.getId().equals("123"));
	}
	
	@Test
	public void testGetPassword() {
		assertTrue(employee.getPassword().equals("Open"));
	}

}