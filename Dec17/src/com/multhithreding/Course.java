package com.multhithreding;

public class Course {
    private int courseId;
    private String courseName;
    private double courseFee;

    public Course(int courseId, String courseName, double courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
    }
}