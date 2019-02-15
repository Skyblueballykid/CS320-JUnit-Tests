package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.MedicalRecord;

//this needs a second import from the patient class, is that a bug?
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.PatientHistory;

public class MedicalRecordTest {
	
	private Patient patient;
	private PatientHistory history;
	
	@Before
	public void before() {
		this.patient = new Patient("Randy", "sick");
		
	}

	@Test
	public void testGetPatient() {
	
	assertTrue(patient.getName().equals("Randy"));
	}
	
	@Test
	public void testGetHistory() {
		
	//assertTrue(patient.getHistory().equals("sick"));
	}
	
}

