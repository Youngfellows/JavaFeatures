package com.aispeex;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // 引用类型数组
        String[] citys = new String[3];
        citys[0] = "武汉";
        citys[1] = "深圳";
        citys[2] = "广州";
        boolean isArray = citys.getClass().isArray();
        System.out.printf("object citys isArray: %s\n", isArray);
        String ret = citys.toString();
        System.out.printf("%s\n", ret);
        ret = Arrays.deepToString((Object[]) citys); //将数组转化为字符串
        System.out.printf("%s\n", ret);

        // 集合对象
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(18);
        ages.add(23);
        ages.add(19);
        isArray = ages.getClass().isArray();
        System.out.printf("object ages isArray: %s\n", isArray);
        ret = ages.toString();
        System.out.printf("%s\n", ret);

        // 集合对象
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("苹果");
        fruits.add("蓝莓");
        fruits.add("香蕉");
        isArray = fruits.getClass().isArray();
        System.out.printf("object fruits isArray: %s\n", isArray);
        ret = fruits.toString();
        System.out.printf("%s\n", ret);

        // 元素类型数组
        int[] weights = new int[3];
        weights[0] = 188;
        weights[1] = 202;
        weights[2] = 99;
        isArray = weights.getClass().isArray();
        System.out.printf("object weights isArray: %s\n", isArray);
        ret = Arrays.toString((int[]) weights);
        System.out.printf("%s\n", ret);

        float[] temperatures = new float[3];
        temperatures[0] = 18.5f;
        temperatures[1] = 22.0f;
        temperatures[2] = 25.5f;
        isArray = weights.getClass().isArray();
        System.out.printf("object temperatures isArray: %s\n", isArray);
        ret = Arrays.toString((float[]) temperatures);
        System.out.printf("%s\n", ret);

        // 测试工具类
        String message = "www.google.com";
        ret = Utils.toString(message);
        System.out.printf("%s\n", ret);

        ret = Utils.toString(citys);
        System.out.printf("%s\n", ret);

        ret = Utils.toString(ages);
        System.out.printf("%s\n", ret);

        ret = Utils.toString(fruits);
        System.out.printf("%s\n", ret);

        ret = Utils.toString(weights);
        System.out.printf("%s\n", ret);

        ret = Utils.toString(temperatures);
        System.out.printf("%s\n", ret);

        ret = Utils.getStackTraceString(new IllegalArgumentException("参数错误异常"));
        System.out.printf("%s\n", ret);

        System.out.printf("%s\n", Utils.equals("a", "a"));
        System.out.printf("%s\n", Utils.equals("as", "b"));
        System.out.printf("%s\n", Utils.equals(null, "b"));
        System.out.printf("%s\n", Utils.equals("a", null));
        System.out.printf("%s\n", Utils.equals(null, null));
        System.out.printf("%s\n", Utils.equals("33", "33a"));
        System.out.printf("%s\n", Utils.equals("apple", "apple"));
    }
}