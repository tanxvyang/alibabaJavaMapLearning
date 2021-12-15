package com.alibabaFileDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
//    创建文件写入器
        String file = "1.txt";
        FileWriter fileWriter = new FileWriter(file) ;
        for (int i = 0; i < 100; i++) {
            fileWriter.write("阿里巴巴Java训练营"+i+"\n");
        }

        fileWriter.flush();
        fileWriter.close();

//        创建读取文件读取器
        FileReader fileReader = new FileReader(file);
        char[] buffer = new char[1024];
        while (fileReader.read(buffer)>0){
            System.out.println(buffer);
        }
        fileReader.close();
    }

}
