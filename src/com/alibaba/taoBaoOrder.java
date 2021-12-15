package com.alibaba;

public class taoBaoOrder extends order {
        public String seller;
        public String buyer;
        public double[] pricelist;

    public void print(){
        for (int i = 0; i < pricelist.length; i++) {
            price = price+pricelist[i];
        System.out.println(buyer+"第"+i+"个订单的价格："+pricelist[i]);
        }
        System.out.println(buyer+"的订单总价："+price);
    }
}
