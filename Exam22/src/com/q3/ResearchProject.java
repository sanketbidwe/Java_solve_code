package com.q3;

public class ResearchProject extends Project {
	
	private int innovationScore;
	 private int resourceUtilization;
	 private int successRate;
	 private boolean rateCalculated = false;

	 public ResearchProject(String projectName, String projectManager, int innovationScore, int resourceUtilization) {
	     super(projectName, projectManager);
	     this.innovationScore = innovationScore;
	     this.resourceUtilization = resourceUtilization;
	 }

	 @Override
	 public synchronized int getSuccessRate() {
	     successRate = (innovationScore + resourceUtilization) / 2;
	     rateCalculated = true;
	     notify(); 
	     return successRate;
	 }

	 public synchronized boolean isSuccessful() {
	     while (!rateCalculated) {
	         try {
	             wait();
	         } catch (InterruptedException e) {
	             System.out.println("Thread interrupted.");
	         }
	     }
	     return successRate >= 70;
	 }
	
	


}
