package com.hashDemp;

import javax.swing.*;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
//        Hash哈希
        HashMap<Integer,String>  hashDingD = new HashMap<Integer, String>();
        hashDingD.put(1000,"Pony");
        hashDingD.put(10001,"Pon2112y");
        hashDingD.put(10003,"Ponysdfggsretre");
        hashDingD.put(10004,"Podsgfny");

        String nickName = hashDingD.get(1000);
        System.out.println(nickName);


//        根据手机号查询qq、微信、钉钉、支付宝、淘宝用户信息
        HashMap<String,User>  hashApp = new HashMap<String , User>();
        for (int i = 0; i < 10; i++) {

            User user1 = new User();
            user1.ID = "610322111111111111"+i;
            user1.name = "西出阳关"+i;
            user1.address = "山南边的的内嘎达+i"+i;
            user1.Mobile = "1233333333333"+i;
            hashApp.put(user1.Mobile,user1);
        }
        User user2 = hashApp.get("12333333333332");
        System.out.println(user2.address.toString());
        System.out.println(user2.toString());


    }
}
