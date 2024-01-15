package com.Student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
int id ;
String name;
int fees;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
}
