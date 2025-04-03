package com.Enum;



import com.que1.DevelopmentProject;
import com.que1.Project;
import com.que1.ResearchProject;

abstract class Project {
 protected String projectName;
 protected String projectManager;
 protected static int totalNoOfProjects = 0;

 public synchronized static void incrementTotalNoOfProjects() {
     totalNoOfProjects++;
 }

 public abstract int getSuccessRate();

 public static int getTotalNoOfProjects() {
     return totalNoOfProjects;
 }

 public Project() {
     incrementTotalNoOfProjects();
 }

 public Project(String projectName, String projectManager) {
     this.projectName = projectName;
     this.projectManager = projectManager;
     incrementTotalNoOfProjects();
 }
}

class DevelopmentProject extends Project {
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

class ResearchProject extends Project {
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

  
     System.out.println("Total Number of Projects: " + Project.getTotalNoOfProjects());
 }
}