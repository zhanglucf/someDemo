package com.example.demo.thinking.in.java.chapter6;

public class OverridingPrivate2 extends OverridingPrivate {

    private void g(){
        System.out.println("overriding g2()");
    }

    public static void main(String[] args) {
        OverridingPrivate2 o2 = new OverridingPrivate2();
        o2.f();
        o2.g();
    }
}
