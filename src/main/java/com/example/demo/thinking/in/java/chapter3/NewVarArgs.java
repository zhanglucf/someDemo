package com.example.demo.thinking.in.java.chapter3;

public class NewVarArgs {
    static void printArray(Object...obj){
        for (Object o : obj) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        printArray(1,3,4,"qq");
        printArray(0);
    }
}
