package com.example.demo.thinking.in.java.chapter3;

public class PrimitiveOverloading {

    void f1(byte x){System.out.println("f1(byte)");}
    void f1(short x){System.out.println("f1(short)");}
    void f1(char x){System.out.println("f1(char)");}
    void f1(int x){System.out.println("f1(int)");}
    void f1(float x){System.out.println("f1(float)");}
    void f1(long x){System.out.println("f1(long)");}
//    void f1(double x){System.out.println("f1(double)");}

    void f2(short x){System.out.println("f2(short)");}
    void f2(char x){System.out.println("f2(char)");}
    void f2(int x){System.out.println("f2(int)");}
    void f2(float x){System.out.println("f2(float)");}
    void f2(long x){System.out.println("f2(long)");}
    void f2(double x){System.out.println("f2(double)");}

    void f3(char x){System.out.println("f3(char)");}
    void f3(int x){System.out.println("f3(int)");}
    void f3(float x){System.out.println("f3(float)");}
    void f3(long x){System.out.println("f3(long)");}
    void f3(double x){System.out.println("f3(double)");}

    void f4(int x){System.out.println("f4(int)");}
    void f4(float x){System.out.println("f4(float)");}
    void f4(long x){System.out.println("f4(long)");}
    void f4(double x){System.out.println("f4(double)");}


    void f5(float x){System.out.println("f5(float)");}
    void f5(long x){System.out.println("f5(long)");}
    void f5(double x){System.out.println("f5(double)");}


    void f6(long x){System.out.println("f6(long)");}
    void f6(double x){System.out.println("f6(double)");}
    void f7(double x){System.out.println("f7(double)");}

    public static void test1() {
        PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
        primitiveOverloading.f1(5);
        primitiveOverloading.f2(5);
        primitiveOverloading.f3(5);
        primitiveOverloading.f4(5);
        primitiveOverloading.f5(5);
        primitiveOverloading.f6(5);
        primitiveOverloading.f7(5);
    }


    public static void test2() {
        PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
        char x = 'a';
        primitiveOverloading.f1(x);
        primitiveOverloading.f2(x);
        primitiveOverloading.f3(x);
        primitiveOverloading.f4(x);
        primitiveOverloading.f5(x);
        primitiveOverloading.f6(x);
        primitiveOverloading.f7(x);
    }

    public static void test3() {
        PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
        short x = 5;
        primitiveOverloading.f1(x);
        primitiveOverloading.f2(x);
        primitiveOverloading.f3(x);
        primitiveOverloading.f4(x);
        primitiveOverloading.f5(x);
        primitiveOverloading.f6(x);
        primitiveOverloading.f7(x);
    }

    public static void test4() {
        PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
        long x = 5;
        primitiveOverloading.f1(x);
        primitiveOverloading.f2(x);
        primitiveOverloading.f3(x);
        primitiveOverloading.f4(x);
        primitiveOverloading.f5(x);
        primitiveOverloading.f6(x);
        primitiveOverloading.f7(x);
    }
    public static void test5() {
        PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
        double x = 5;
        primitiveOverloading.f1((int) x);

    }

    public static void main(String[] args) {
        test4();


    }


}
