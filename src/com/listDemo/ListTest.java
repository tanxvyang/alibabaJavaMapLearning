package com.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        新建一个可以存储整数类型的list
        List<Integer> listNum = new ArrayList<Integer>();
        listNum.add(12);
        listNum.add(123);
        listNum.add(12234);
        listNum.add(1235);
        listNum.add(12345);
//
        int sum = 0;
        for (Integer num:listNum) {
            System.out.println(num);
            sum = sum+num;
        }
        System.out.println(sum);

    }
}
