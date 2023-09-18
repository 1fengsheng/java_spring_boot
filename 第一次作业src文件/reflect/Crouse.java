package reflect;

import java.util.ArrayList;
import java.util.List;

public class Crouse {
    private String courseName;
    private int courseId;
    private List<Student> enrolledStudents;

    public Crouse(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void listEnrolledStudents() {
        System.out.println("报名 " + courseName + " 课程的学生有：");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

