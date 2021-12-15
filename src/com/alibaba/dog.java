package com.alibaba;

public class dog {
//    变量
    private int age;
    private  String name;
    private String sex;
//      行为
    public int add( int a, int b){
        return a+b;
    }

    public dog(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
