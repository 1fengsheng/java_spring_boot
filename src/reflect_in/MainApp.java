package reflect_in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // ��ʼ��Spring��������������
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // ��ȡѧ��ʵ��
        Student student = (Student) context.getBean("student");

        // ʹ�ÿ��Ʒ�ת��ѧ������
        student.enroll();
        student.study();
    }
}

