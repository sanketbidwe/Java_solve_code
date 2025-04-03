package com.q4;

class Sports {
 
 private String sportName;
 private int teamSize;
 private String sportType;


 public Sports() {
     this.sportName = "Unknown";
     this.teamSize = 0;
     this.sportType = "Unknown";
 }


 public Sports(String sportName, int teamSize) {
     this.sportName = sportName;
     if (teamSize > 0) {
         this.teamSize = teamSize;
     } else {
         this.teamSize = 0;
         System.out.println("Error: Team size must be positive.");
     }
     this.sportType = "Unknown";
 }

 
 public Sports(String sportName, int teamSize, String sportType) {
     this.sportName = sportName;
     if (teamSize > 0) {
         this.teamSize = teamSize;
     } else {
         this.teamSize = 0;
         System.out.println("Error: Team size must be positive.");
     }
     this.sportType = sportType;
 }

 public void displayInfo() {
     System.out.println("Sport Name: " + sportName);
     System.out.println("Team Size: " + teamSize);
     System.out.println("Sport Type: " + sportType);
 }
}


public class ELC {
 public static void main(String[] args) {
    
     Sports football = new Sports("Football", 11);
     football.displayInfo();

     System.out.println("---------------------");

     
     Sports volleyball = new Sports("Volleyball", -1);
     volleyball.displayInfo();
 }
}
