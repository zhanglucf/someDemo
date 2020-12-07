package com.example.demo.thinking.in.java.chapter6;

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet poppet;

    public BlankFinal() {
       j = 1;
       poppet = new Poppet(1);
    }

//    public BlankFinal(int j, Poppet poppet) {
//        this.j = j;
//        this.poppet = poppet;
//    }
}
class Poppet{
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}
