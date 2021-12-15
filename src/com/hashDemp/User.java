package com.hashDemp;

import javax.naming.Name;
import java.security.PublicKey;

public class User {
    public  String  ID;
    public String name;
    public String Passworf;
    public String  NickName;
    public String Mobile;
    public String address;

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", Passworf='" + Passworf + '\'' +
                ", NickName='" + NickName + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
