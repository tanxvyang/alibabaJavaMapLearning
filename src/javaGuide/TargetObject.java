package javaGuide;

public class TargetObject {
    private  String value;



    public TargetObject() {
        value = "JavaGuide";
    }
    public  void  publicMethod(String s){
        System.out.println("公开 方法"+s);
    }
    private void privateMethod(){
        System.out.println("value is "+value);
    }
}
