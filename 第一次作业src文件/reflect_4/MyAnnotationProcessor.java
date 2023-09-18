package reflect_4;

import java.lang.annotation.Annotation;

public class MyAnnotationProcessor {
    public static void processAnnotations(Class<?> clazz) {
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
            String value = annotation.value();
            System.out.println("类 " + clazz.getSimpleName() + " 标注了 @MyAnnotation，值为: " + value);
        } else {
            System.out.println("类 " + clazz.getSimpleName() + " 未标注 @MyAnnotation");
        }
    }

    public static void main(String[] args) {
        // 测试注解处理程序
        processAnnotations(MyClass.class);
        processAnnotations(AnotherClass.class);
    }
}
