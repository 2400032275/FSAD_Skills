package com.klef.skill5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	    private int id;
	    private String name;
	    private String gender;
	    @Autowired
	    private Certification certification;
	    public Student() {
	        this.id = 32687;
	        this.name = "Keerthi";
	        this.gender = "Female";
	    }
	    public void displayStudent() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println("Gender: " + gender);
	        System.out.println("\n--- Certification Details ---");
	        certification.displayCertification();
	    }
}
