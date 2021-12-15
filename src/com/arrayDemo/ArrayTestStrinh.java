package com.arrayDemo;

public class ArrayTestStrinh {
    public static void main(String[] args) {
//        定义数组长度为5 的整型类型
        String[] array1 = new String[10];
        array1[0] = "1123";
        array1[1] = "不许动";
        array1[3] = "我们都是木头人";

        array1[4] = "嘿嘿嘿";
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
//            sum = sum + array1[i];
        }
        System.out.println(sum);
    }
}
