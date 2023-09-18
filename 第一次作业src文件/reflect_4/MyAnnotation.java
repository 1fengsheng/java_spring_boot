package reflect_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 指定注解在运行时可见
@Target(ElementType.TYPE) // 指定注解可用于类
public @interface MyAnnotation {
    String value() default "默认值";
}

