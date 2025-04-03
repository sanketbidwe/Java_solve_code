package com.multhithreding;

public class EducationInstituteApp {
    public static void main(String[] args) {
        Course[] c1 = {
                new Course(1, "Java", 3000),
                new Course(2, "English", 5000),
                new Course(3, "Math", 7000),
                new Course(4, "Science", 2000),
        };
        Offer[] o = {
                new Offer("Special discount: Get 20% off on all courses!"),
                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };
        EducationInstitute e1 = new EducationInstitute(c1, o);
        Student s1 = new Student("Virat", e1);
        Student s2 = new Student("Dhoni", e1);

        Thread t1 = new Thread(() -> {
            s1.viewCoursesAndFees();
            s1.viewOffers();
            s1.enrollInCourse(1);
        });

        Thread t2 = new Thread(() -> {
            s2.viewCoursesAndFees();
            s2.viewOffers();
            s2.enrollInCourse(3);
        });

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
