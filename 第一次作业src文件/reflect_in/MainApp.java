package reflect_in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 初始化Spring容器并加载配置
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取学生实例
        Student student = (Student) context.getBean("student");

        // 使用控制反转的学生对象
        student.enroll();
        student.study();
    }
}

