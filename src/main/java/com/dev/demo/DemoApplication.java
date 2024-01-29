package com.dev.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication 

	
	implements CommandLineRunner { 
	    // Method 1 
	    // run() method for springBootApplication to execute 
	    @Override
	    public void run(String args[]) throws Exception 
	    { 
	        // Print statement when method is called 
	        System.out.println("HEllo world"); 
	    } 
	  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
