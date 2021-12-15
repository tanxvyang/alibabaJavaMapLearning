package com.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListTestString {
    public static void main(String[] args) {
//        新建一个可以存储整数类型的list
        List<String> listNum = new ArrayList<String>();
        listNum.add("12");
        listNum.add("123");
        listNum.add("12234");
        listNum.add("1235");
        listNum.add("12345");
//
        String sum = "";
        for (String num:listNum) {
            System.out.println(num);
            sum = sum+num;
        }
        System.out.println(sum);

    }
}
