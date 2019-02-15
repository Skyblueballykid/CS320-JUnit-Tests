package medicalApplication.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.PatientHistory;
import medical.com.medicalApplication.model.Treatment;

public class PatientHistoryTest {
	private Treatment treatments;
	private Medication medications;
	private Allergey allergy;
	
	@Before
	public void before() {
		
		this.treatments = new Treatment("Dec 2, 2018", "Bad", "Bend the knees");
		this.medications = new Medication("Xanax","2", "300mg", "Daily");
		this.allergy = new Allergey("Horses");

	}

	@Test
	public void testAddTreatment() {

	}
	

	@Test
	public void testaddAllergy() {

	
	}
	
	@Test
	public void testAddMedication() {
		
	}
	

}
