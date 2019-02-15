package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;

public class DoctorTest {
	private Doctor doctor;
	
	@Before
	public void before() {
		this.doctor = new Doctor("Mark", "123");
	}
	
	@Test
	public void testGetDocName() {
		assertTrue(doctor.getName().equals("Mark"));
	}
	
	@Test
	public void testGetDocID() {
		assertTrue(doctor.getId().equals("123"));
	}

	
}

