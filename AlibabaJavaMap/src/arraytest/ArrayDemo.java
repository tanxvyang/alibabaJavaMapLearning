package arraytest;

import javax.naming.ldap.SortResponseControl;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName ArrayDemo.java
 * @Description TODO
 * @createTime 2021年12月27日 09:44:00
 */
class ArrayUtil{
//    数组排序
    public static void  sort(int data[]){
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i]>data[i+1]){
                int temp = data[i];
                data[i] = data[i+1] ;
                data[i+1] = temp;
            }
        }
    }
//    数组输出
    public static void printArray(int[] data) {
        for (int i = 0; i <= data.length-1 ; i++) {
            System.out.print(data[i]+"、 ");
        }
        System.out.println();
    }

//    数组转置1
    public static void reversArray001(int [] data){
        int temp [] = new int[data.length];
        int foot = temp.length - 1;
        for (int i = 0; i < data.length ; i++) {
            temp[foot --] = data[i];
        }
        data = temp ;
        printArray(data);
    }
//    数组转置2
    public static void reversArray002(int [] data){
        int center = data.length / 2;//转换次数
        int head = 0;//操作下标
        int tail = data.length - 1;//操作下标
        for (int i = 0; i < center ; i++) {
            int temp = data[head];
            data[head] = data [tail];
            data[tail] = temp;
            head ++ ;
            tail -- ;
        }
    }
//代码拷贝
    public static void arrayCopy(int [] data,int sindex,int dsc[] , int dindex,int len){
        for (int i = 0; i < len; i++) {
            dsc[dindex ++] = data[sindex ++];
        }
    }

}

public class ArrayDemo {
    public static void main (String args[]){
        int data [] = new int[]{1,2,13,3,3,3,37,6,1};
        int data1 [] = new int[]{8,9,10,0,4,3,2,7,6,1};
//        数组排序
//        ArrayUtil.sort(data);
//        ArrayUtil.printArray(data);
//        数组转置
//        ArrayUtil.reversArray001(data);

//        ArrayUtil.reversArray002(data);
        ArrayUtil.arrayCopy(data,3,data1,3,3);
        ArrayUtil.printArray(data1);




    }



}
