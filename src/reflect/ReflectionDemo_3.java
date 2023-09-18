package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo_3 {
    public String privateField;

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public void publicMethod() {
        System.out.println("公有方法被调用");
    }

    private void privateMethod() {
        System.out.println("私有方法被调用");
    }

    public static void main(String[] args) throws Exception {
        // 创建ReflectionDemo_3对象
        ReflectionDemo_3 obj = new ReflectionDemo_3();

        // 使用setter方法注入私有字段的值
        obj.setPrivateField("修改后的私有字段值");

        // 获取类的 Class 对象
        Class<?> clazz = ReflectionDemo_3.class;

        // 获取类的名称
        System.out.println("类的名称：" + clazz.getName());

        // 获取类的字段信息
        System.out.println("类的字段信息：");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName() + ", 类型：" + field.getType());
        }

        // 获取类的方法信息
        System.out.println("类的方法信息：");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("方法名称：" + method.getName() + ", 返回类型：" + method.getReturnType());
        }

        // 使用反射调用公有方法
        Method publicMethod = clazz.getMethod("publicMethod");
        publicMethod.invoke(obj);

        // 使用反射调用私有方法
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);
    }
}
