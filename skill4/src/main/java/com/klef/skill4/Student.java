package com.klef.skill4;
import org.springframework.stereotype.Component;
@Component
public class Student {
private int studentId;
private String name;
private String course;
private int year;
public void setCourse(String course) {
    this.course = course;
}
public void setYear(int year) {
    this.year = year;
}
public Student(int studentId, String name, String course, int year) {
	this.studentId = studentId;
	this.name = name;
	this.course = course;
	this.year = year;
}
public void display() {
    System.out.println("ID: " + studentId);
    System.out.println("Name: " + name);
    System.out.println("Course: " + course);
    System.out.println("Year: " + year);
}	
}
