package com.example.demo.thinking.in.java.chapter6;

public class Beetle extends Insect {

    private int k = printInt("Beetle k initialized");

    public Beetle(){
        System.out.println(k);
        System.out.println(j);
    }
    private static int x2 = printInt("static Beetle x2 initialized");

}

class Test{
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }
}

