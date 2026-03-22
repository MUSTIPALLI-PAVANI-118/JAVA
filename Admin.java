package admin;

import student.Student;
import course.Course;

public class Admin {
    public void showDetails(Student s, Course c) {
        System.out.println("Admin Accessing Details:");
        s.displayStudent();
        c.displayCourse();
    }
}


