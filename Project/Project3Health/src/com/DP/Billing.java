package com.DP;

public class Billing {
private String patientId;
private double amount;
public Billing(String PatientId, double amount, String patientId) {
	this.patientId = patientId;
	this.amount = amount;
}
public String getPatientId() {
	return patientId;
}
public double getAmount() {
	return amount;
}
}
