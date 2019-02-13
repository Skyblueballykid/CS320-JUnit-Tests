package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.services.MedicalRescordService;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;

public class MedicalRescordServiceTest {
	private Patient patient = new Patient("Tom", "123");
	MedicalRecord medicalRecord = new MedicalRecord(patient);

	
	//Add a patient
	@Test
	public void testAddPatient() {
	assertEquals(true, MedicalRescordService.getReference().addPatient("Tom", "123"));
	}
	
	//Add medical record to patient
	@Test
	public void testAddPatientRecord() {
	
	//assertEquals(true, MedicalRescordService.getReference().getMedicalRecord("123"));
	}
	
	//To create a medical record you must create a patient history with a minimum of 1 treatments, a minimum of 1 medication and a minimum of 1 allergy
	@Test
	public void testMinimums() {


	}
	
	//You should not be able to assign a medication to a patient until that patient has a treatment
	@Test
	public void testAddMedication() {

	}

}
