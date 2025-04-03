package com.q3;

   public class DevelopmentProject extends Project {
		private int requirementsMet;
		 private int bugsResolved;
		 private int onTimeDelivery;
		 private int successRate;
		 private boolean rateCalculated = false;

		 public DevelopmentProject(String projectName, String projectManager, int requirementsMet, int bugsResolved, int onTimeDelivery) {
		     super(projectName, projectManager);
		     this.requirementsMet = requirementsMet;
		     this.bugsResolved = bugsResolved;
		     this.onTimeDelivery = onTimeDelivery;
		 }

		 @Override
		 public synchronized int getSuccessRate() {
		     successRate = (requirementsMet + bugsResolved + onTimeDelivery) / 3;
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



