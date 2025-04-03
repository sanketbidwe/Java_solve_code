package com.multhithreding;

public class EducationInstitute {
    private Course[] courses;
    private Offer[] offers;

    public EducationInstitute(Course[] courses, Offer[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName) {
        String courseName = "";
        for (Course c : courses) {
            if (courseId == c.getCourseId()) {
                courseName = c.getCourseName();
            }
        }
        if (!courseName.isEmpty()) {
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Invalid Course Id...");
        }
    }
}