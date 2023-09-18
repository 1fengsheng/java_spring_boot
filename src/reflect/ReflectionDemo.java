package reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    private String privateField = "˽���ֶεĳ�ʼֵ";

    public void publicMethod() {
        System.out.println("���з���������");
    }

    private void privateMethod() {
        System.out.println("˽�з���������");
    }

    public static void main(String[] args) throws Exception {
        // ��ȡ��� Class ����
        Class<?> clazz = ReflectionDemo.class;

        // ��ȡ�������
        System.out.println("������ƣ�" + clazz.getName());

        // ��ȡ����ֶ���Ϣ
        System.out.println("����ֶ���Ϣ��");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("�ֶ����ƣ�" + field.getName() + ", ���ͣ�" + field.getType());
        }

        // ��ȡ��ķ�����Ϣ
        System.out.println("��ķ�����Ϣ��");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("�������ƣ�" + method.getName() + ", �������ͣ�" + method.getReturnType());
        }

        // ʹ�÷�����ù��з���
        Method publicMethod = clazz.getMethod("publicMethod");
        ReflectionDemo obj = new ReflectionDemo();
        publicMethod.invoke(obj);
    }
}
