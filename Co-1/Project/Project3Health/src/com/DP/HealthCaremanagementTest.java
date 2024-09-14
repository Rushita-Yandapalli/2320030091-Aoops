package com.DP;

import static org.junit.jupitor.api.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Test;
class HealthCareManagementTest{
private HealthCareManagement hms;

public void setUp() {
	hms = new HealthCareManagement();
	hms.addPatient("John", 30, "P3341");
	hms.addPatient("Chandler", 28, "P2341");
}


	

	private void addPatient(String string, int i, String string2) {
	// TODO Auto-generated method stub
	
}




	
	public void testAddPatient() {
		Patient patient = (Patient) hms.findPatientById("P3341");
		assertNotNull(patient);
		assertEquals("John", patient.getName());
		assertEquals(30, patient.getAge());
	}
	private void assertEquals(String string, String name) {
		// TODO Auto-generated method stub
		
	}




	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}




	private void assertNotNull(Patient patient) {
		// TODO Auto-generated method stub
		
	}




	public void testScheduledappointment() {
		hms.scheduleAppointments("P4521", "Dr.Smith", "2024-08-20");
		assertEquals(1, hms.getAppointments().get(0));
		Appointment appointment;
		assertEquals("P4521", appointment.getPatientId());
        assertEquals("Dr. Smith", appointment.getDoctorName());
        assertEquals("2024-08-20", appointment.getDate());
	}




	private void assertEquals(int i, Appointment appointment) {
		// TODO Auto-generated method stub
		
	}
	public void testScheduleAppointmentInvalidPatient() {
        hms.scheduleAppointments("P003", "Dr. Smith", "2024-08-20");
    }

    
    public void testGenerateBill() {
        hms.generteBill("P002", 500.0);
        assertEquals(1, hms.getBills().size());
        Billing bill = hms.getBills().get(0);
        assertEquals("P002", bill.getPatientId());
        assertEquals(500.0, bill.getAmount(), 0.0);
    }

    private void assertEquals(double d, double amount, double e) {
		// TODO Auto-generated method stub
		
	}




	
    public void testGenerateBillInvalidPatient() {
        hms.generteBill("P003", 500.0);
    }


}
