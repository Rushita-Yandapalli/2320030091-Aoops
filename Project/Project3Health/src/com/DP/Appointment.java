package com.DP;
class Appointment {
private String PatientId;
private String doctorName;
private String date;
public Appointment(String patientId, String doctorName, String date) {
	this.PatientId = patientId;
	this.doctorName = doctorName;
	this.date = date;
}
public String getPatientId() {
	return PatientId;
}
public String getDoctorName() {
	return doctorName;
}
public String getDate() {
	return date;
}

}
