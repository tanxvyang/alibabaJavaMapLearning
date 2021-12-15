package com.alibaba;

public class testOrder {
    public static void main(String[] args) {
//        测试
        order order1 = new order();
        order1.title="iphone 12";
        order1.price = 99999;
        order1.address = "三里河村";
        order1.print();

        taoBaoOrder testOrder = new taoBaoOrder();
        testOrder.price = 232323;
        testOrder.title = "order111";
        testOrder.buyer = "森森";
        testOrder.address = "adafdafdadfadsf";
        testOrder.seller = "天猫旗舰店";
        testOrder.pricelist = new double[]{89,12,1111133333} ;
        order1.print();
        testOrder.print();

    }
}
