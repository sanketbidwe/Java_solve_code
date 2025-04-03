package com.prog1;

class CourseManager 
{

	public void processContent(CourseContent courseContent)
	{
	    if(courseContent ==null)
	    {
	    	System.err.println("Invalid Data");
	    }
		else if(courseContent instanceof CourseContent)
		{
			System.out.println(courseContent.toString());
		}else
		{
			System.err.println("Invalid Data");
		}
	}
	public void processMultipleContents(CourseContent...contents)
	{
		for(CourseContent courseContent: contents)
		{
			if(courseContent==null)
			{
				System.err.println("Inavalid content");
			}
			else
			{
				System.out.println(courseContent);
			}
			
		}
	}

}
