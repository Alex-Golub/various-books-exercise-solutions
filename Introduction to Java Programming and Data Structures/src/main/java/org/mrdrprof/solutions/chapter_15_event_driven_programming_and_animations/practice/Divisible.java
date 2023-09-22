package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import java.lang.reflect.Method;

public class Divisible {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("".getClass());
        System.out.println(String.class.getClass());
        System.out.println(String.class.getSuperclass());
        System.out.println(String.class);

        String[] fqn = {
                "java.lang.String",
                "java.lang.StringBuffer",
                "java.lang.Math"
        };
        System.out.println("java.lang.Math".equals(findMethod("abs", fqn)));
    }

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String className : classNames) {
            Method[] methods = Class.forName(className).getMethods();
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    return className;
                }
            }
        }
        return null;
    }
}
