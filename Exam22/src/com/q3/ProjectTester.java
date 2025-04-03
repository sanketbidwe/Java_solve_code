package com.q3;

public class ProjectTester {
	 public static void main(String[] args) {
	     
	     DevelopmentProject devProject = new DevelopmentProject("Project A", "John", 90, 80, 95);
	     ResearchProject resProject = new ResearchProject("Project B", "Sarah", 85, 75);


	     Thread devCalculation = new Thread(() -> {
	         System.out.println("Development Project: " + devProject.projectName);
	         int successRate = devProject.getSuccessRate();
	         System.out.println("Success Rate: " + successRate);
	     });

	     Thread resCalculation = new Thread(() -> {
	         System.out.println("Research Project: " + resProject.projectName);
	         int successRate = resProject.getSuccessRate();
	         System.out.println("Success Rate: " + successRate);
	     });

	     Thread devSuccessCheck = new Thread(() -> {
	         boolean isSuccessful = devProject.isSuccessful();
	         System.out.println("Successful: " + (isSuccessful ? "Yes" : "No"));
	     });

	     Thread resSuccessCheck = new Thread(() -> {
	         boolean isSuccessful = resProject.isSuccessful();
	         System.out.println("Successful: " + (isSuccessful ? "Yes" : "No"));
	     });

	  
	     devCalculation.start();
	     resCalculation.start();
	     devSuccessCheck.start();
	     resSuccessCheck.start();


	     try {
	         devCalculation.join();
	         resCalculation.join();
	         devSuccessCheck.join();
	         resSuccessCheck.join();
	     } catch (InterruptedException e) {
	         System.out.println("Thread interrupted.");
	     }

	  
	     System.out.println("Total Number of Projects: " + Project.getTotalNoOfproject());
	 }
	}
