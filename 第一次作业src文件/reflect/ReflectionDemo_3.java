package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo_3 {
    public String privateField;

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public void publicMethod() {
        System.out.println("���з���������");
    }

    private void privateMethod() {
        System.out.println("˽�з���������");
    }

    public static void main(String[] args) throws Exception {
        // ����ReflectionDemo_3����
        ReflectionDemo_3 obj = new ReflectionDemo_3();

        // ʹ��setter����ע��˽���ֶε�ֵ
        obj.setPrivateField("�޸ĺ��˽���ֶ�ֵ");

        // ��ȡ��� Class ����
        Class<?> clazz = ReflectionDemo_3.class;

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
        publicMethod.invoke(obj);

        // ʹ�÷������˽�з���
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);
    }
}
