package reflect;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Crouse> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Crouse course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " 已成功报名课程: " + course.getCourseName());
    }

    public void listEnrolledCourses() {
        System.out.println(name + " 已报名的课程：");
        for (Crouse course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }

	public String getName() {
		return name;
	}
}

