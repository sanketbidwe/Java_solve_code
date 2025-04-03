package com.prog1;

public class MainCourse {

	public static void main(String[] args)
	{
		Video video =new Video("java",25);
		Article article=new Article("python","xyz");
		Quiz quiz=new Quiz(".Net",35);
		
		
		CourseManager c=new CourseManager();
		c.processMultipleContents(video,article,quiz);


	}

}
