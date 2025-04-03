package com.q3;

public abstract class Project {
	protected String projectName;
	protected String projectManager;
	protected static int totalNoOfProjects = 0;
	
	public synchronized static void incrementTotalNoOfProjects()
	{
	     totalNoOfProjects++;
	}
	public abstract int getSuccessRate();
	
	public static int getTotalNoOfproject()
	{
		return totalNoOfProjects++;
	}
	
	public Project()
	{
	     incrementTotalNoOfProjects();
	 }

	 public Project(String projectName, String projectManager) {
	     this.projectName = projectName;
	     this.projectManager = projectManager;
	     incrementTotalNoOfProjects();
	 }

}
