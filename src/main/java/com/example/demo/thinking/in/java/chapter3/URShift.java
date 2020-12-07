package com.example.demo.thinking.in.java.chapter3;

import com.example.demo.thinking.in.java.chapter6.Fishing;

public class URShift {
    public static void main(String[] args) {
         char i = 33;
        System.out.println(Integer.toBinaryString(i));
        int ii = i >> 5;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }
}
