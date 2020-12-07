package com.example.demo.thinking.in.java.chapter6;

import java.util.Random;

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int value_ONE = 9;
    {
        System.out.println("{}");
    }
    private static final int value_TWO = 99;
    public static final int value_THREE = 39;
    static {
        System.out.println("静态代码块1");
    }
    private final int i4 = getInt();
    static final int INT_5 = getIntST();


    int getInt() {
        System.out.println("非静态编译器常量 i4 初始化");
        return 1;
    }

    static int getIntST() {
        System.out.println(INT_5);
        System.out.println("静态编译器常量 INT_5 初始化");
        return 5;
    }

    static int getIntST2() {
        System.out.println(INT_6);
        System.out.println("静态编译器常量 INT_6 初始化");
        return 6;
    }




    static final int INT_6 = getIntST2();

    static {
        System.out.println("静态代码块2");
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData("");
        System.out.println(finalData.i4);
    }

}
