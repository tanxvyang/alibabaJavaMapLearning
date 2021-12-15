package com.alibaba;

public class ifandfor {
    public static void main(String[] args) {
//        if判断语句test

        int number =  10090000;
        if (number > 100000){
            System.out.println("超级富豪程序员u员");
        }else if (number>10000){
            System.out.println("富豪程序员u员");

        }else if (number>1000){
            System.out.println("高级程序员u员");

        }else if (number>100){
            System.out.println("中级程序员u员");

        }else if (number>10){
            System.out.println("初级程序员u员");

        } else {
            System.out.println("打工人.");
        }
    }

}
