package com.aispeex;

public class StackTraceDemo {

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        StackTraceElement[] stackTrace = getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement);

            System.out.println("类className: " + stackTraceElement.getClassName());
            System.out.println("方法名称MethodName: " + stackTraceElement.getMethodName());
            System.out.println("文件名file: " + stackTraceElement.getFileName());
            System.out.println("方法所在的行号: " + stackTraceElement.getLineNumber());
            System.out.println();
            
        }
    }

    public static void methodC() {

    }

    public static void methodD() {

    }

    public static StackTraceElement[] getStackTrace() {
        return Thread.currentThread().getStackTrace();
    }
}
