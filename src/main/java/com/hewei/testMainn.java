package com.hewei;

import java.io.File;
import java.io.Serializable;

public class testMainn implements Serializable {
    public static void main(String[] args) {
        int a = 666;
        File child = new File("child");
        int b=6;
        new testMainn().fun();
    }

    /**
     * 这是放方法的注释
     */
    public  void fun()
    {

    }
}
