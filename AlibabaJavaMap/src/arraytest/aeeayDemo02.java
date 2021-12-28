package arraytest;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName aeeayDemo02.java
 * @Description TODO
 * @createTime 2021年12月27日 14:42:00
 */
class ArrayUtila{
    public static int sum(int ... data){
        int sum = 0;
        for (int temp : data ){
            sum +=temp ;
        }
        return  sum;
    }
}

public class aeeayDemo02 {
    public static  void main(String args[]){
        System.out.println(ArrayUtila.sum(1,2,3,4,5,6,7));
        System.out.println(ArrayUtila.sum(new int[]{1,2,3,4,5,6,7,78}));
    }

}
