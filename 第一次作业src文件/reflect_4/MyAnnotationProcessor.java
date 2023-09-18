package reflect_4;

import java.lang.annotation.Annotation;

public class MyAnnotationProcessor {
    public static void processAnnotations(Class<?> clazz) {
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
            String value = annotation.value();
            System.out.println("�� " + clazz.getSimpleName() + " ��ע�� @MyAnnotation��ֵΪ: " + value);
        } else {
            System.out.println("�� " + clazz.getSimpleName() + " δ��ע @MyAnnotation");
        }
    }

    public static void main(String[] args) {
        // ����ע�⴦�����
        processAnnotations(MyClass.class);
        processAnnotations(AnotherClass.class);
    }
}
