package javaGuide;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {


    //    获取TargetObject类的Class对象并且创建TargetObject类实例
    Class<?> tagectClass = Class.forName("javaGuide.TargetObject");

    TargetObject targetObject = (TargetObject) tagectClass.newInstance();

//    获取所有类中所有定义的方法
        Method[] methods = tagectClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
//        获取指定方法并调用  publicMethod
        Method publicMethod = tagectClass.getDeclaredMethod("publicMethod",String.class);

        publicMethod.invoke(targetObject,"hello java");
//        获取指定参数并对参数进行修改
        Field field =tagectClass.getDeclaredField("value");
//为了对类中的参数进行修改我们取消安全检查
        field.setAccessible(true);
        field.set(targetObject, "JavaGuide");

        /**
         * 调用 private 方法
         */
        Method privateMethod = tagectClass.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
