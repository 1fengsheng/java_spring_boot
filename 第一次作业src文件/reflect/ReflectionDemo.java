package reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    private String privateField = "私有字段的初始值";

    public void publicMethod() {
        System.out.println("公有方法被调用");
    }

    private void privateMethod() {
        System.out.println("私有方法被调用");
    }

    public static void main(String[] args) throws Exception {
        // 获取类的 Class 对象
        Class<?> clazz = ReflectionDemo.class;

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
        ReflectionDemo obj = new ReflectionDemo();
        publicMethod.invoke(obj);
    }
}
