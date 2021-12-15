package com.alibaba;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("frankxulei.txt") ;
        fileWriter.write("hello this is filewriter");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader("frankxulei.txt");
        char[] buffer = new char[1024];
        while (fileReader.read(buffer)>0){
            System.out.println(buffer);
        }
    }
}
