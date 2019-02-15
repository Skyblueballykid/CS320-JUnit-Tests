package medicalApplication.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllergeyTest.class, DoctorTest.class, EmployeeTest.class, MedicalRecordTest.class,
		PatientHistoryTest.class, PatientTest.class, TreatmentTest.class })
public class AllTests {

}
