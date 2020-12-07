package com.example.demo.thinking.in.java.chapter;

public class NotNew {
    public class Inner{}

    public static void main(String[] args) {
        NotNew notNew = new NotNew();
        //必须使用外部类对象来创建内部类对象
        Inner inner = notNew.new Inner();
    }
}
