package com.klef.skill5;
import org.springframework.stereotype.Component;
@Component
public class Certification {
	  private int id;
	    private String name;
	    private String dateOfCompletion;
	    public Certification() {
	        this.id = 101;
	        this.name = "Java Full Stack";
	        this.dateOfCompletion = "2026-03-01";
	    }
	    public void displayCertification() {
	        System.out.println("Certification ID: " + id);
	        System.out.println("Certification Name: " + name);
	        System.out.println("Completion Date: " + dateOfCompletion);
	    }
}
