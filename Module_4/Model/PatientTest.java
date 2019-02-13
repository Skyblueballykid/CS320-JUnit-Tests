package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Patient;

public class PatientTest {
	private Patient patient;
	
	@Before
	public void before() {
		this.patient = new Patient("John", "123456");
	}
	

	@Test
	public void testGetPatientName() {
		assertTrue(patient.getName().equals("John"));
	}
	
	@Test
	public void testGetPatientId() {
		assertTrue(patient.getId().equals("123456"));
	}

}
