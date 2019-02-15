package medicalApplication.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

public class AllergeyTest {
	private Allergey allergey;
	//add array for list of allergies
	private ArrayList<Class> allergies;

	
	@Before
	public void Before() {
		this.allergey = new Allergey("Peanuts");

	}
	
	
	@Test
	public void testgetName() {
		assertTrue(allergey.getName().equals("Peanuts"));
	}

}
