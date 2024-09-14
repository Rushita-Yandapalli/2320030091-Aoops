package com.DP;
import java.util.List;
import java.util.ArrayList;


public class HealthCareManagement {
private List<Patient> patients = new ArrayList<>();
private List<Appointment> appointments = new ArrayList<>();
private List<Billing> bills = new ArrayList<>();

public void addPatient(String name, int age, String id) {
	patients.add(new Patient(name,age,id));
}
public void scheduleAppointments(String patientId, String doctorName, String date) throws Exception {
	if(findPatientById(patientId) != null) {
		appointments.add(new Appointment(patientId, doctorName, date));
		
	}
	else {
		throw new Exception("Patient not found");
	}
}
Object findPatientById(String patientId) {
	// TODO Auto-generated method stub
	return null;
}
public void generteBill(String patientId, double amount) throws Exception {
	if (findPatientById(patientId) != null) {
		bills.add(new Billing(patientId, amount, patientId));
	}
	else {
		throw new Exception("Patient not found");
	}
}
public Patient findPatientById1(String id) {
	for(Patient patient : patients) {
		if(patient.getId().equals(id)) {
			return patient;
		}
	}
	return null;
}
public List<Appointment> getAppointments(){
	return appointments;
}
public List<Billing> getBills(){
	return bills;
}

}
