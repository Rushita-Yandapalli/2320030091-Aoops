package com.DP;
import java.util.ArrayList;
import java.util.List;

public class Patient {
private String name;
private int age;
private String id;
public Patient(String name, int age, String id) {
	this.name = name;
	this.age = age;
	this.id = id;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
}
