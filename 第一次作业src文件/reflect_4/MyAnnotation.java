package reflect_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // ָ��ע��������ʱ�ɼ�
@Target(ElementType.TYPE) // ָ��ע���������
public @interface MyAnnotation {
    String value() default "Ĭ��ֵ";
}

