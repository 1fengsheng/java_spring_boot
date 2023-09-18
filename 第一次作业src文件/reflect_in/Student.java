package reflect_in;

public class Student {
    private String name;
    private int studentId;
    private Course course;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void enroll() {
        System.out.println(name + " 已成功报名课程: " + course.getCourseName());
    }

    public void study() {
        System.out.println(name + " 正在学习 " + course.getCourseName() + " 课程");
    }
}

