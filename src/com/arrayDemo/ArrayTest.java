package com.arrayDemo;

public class ArrayTest {
    public static void main(String[] args) {
//        定义数组长度为5 的整型类型
        int[] array1 = new int[5];
        array1[0] = 1123;
        array1[1] = 1123;
        array1[3] = 124;
        array1[2] = 145;
        array1[4] = 1;
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            sum = sum + array1[i];
        }
        System.out.println(sum);
    }
}
