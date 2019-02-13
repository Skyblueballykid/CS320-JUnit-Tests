package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Treatment;

public class TreatmentTest {
	private Treatment treatment;

	@Before
	public void before() {
		this.treatment = new Treatment("January 2, 2019", "bad", "Bending");
	}
	
	@Test
	public void testTreatmentDate() {
		assertTrue(treatment.getTreatmentDate().equals("January 2, 2019"));
	}
	
	@Test
	public void testTreatmentDiagnosis() {
		assertTrue(treatment.getDiagnose().equals("bad"));
	}
	
	@Test
	public void testTreatmentDescription() {
		assertTrue(treatment.getDescription().equals("Bending"));
	}

}
