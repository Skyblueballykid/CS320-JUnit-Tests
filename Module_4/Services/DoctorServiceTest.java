package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;
import medical.com.medicalApplication.services.DoctorService;

public class DoctorServiceTest {
	private static DoctorService reference = new DoctorService();
	private static ArrayList<Doctor> doctors;
	
	//Add a doctor to the list of doctors
	@Test
	public void testAddDoctor() {
	assertEquals(true, DoctorService.getReference().addDoctor("Bob", "12345"));
	}
	
	//Ensure unique doctor IDs
	@Test
	public void testUniqueIDs() {
	assertFalse(!DoctorService.getReference().addDoctor("Mike", "12345"));
	}
	
	//Test getAllDoctors is returning all of the added doctors
	@Test
	public void testgetAllDoctors() {
		assertFalse(DoctorService.getReference().getAllDoctors().isEmpty());
	}

}
