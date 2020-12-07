package com.example.demo.thinking.in.java.chapter3;

import java.util.Random;

public class MatchOps {

    /**
     * 算术操作符
     * 算术操作符可以紧接等号，表示运算后赋值操作
     *  float u, v, w;
     *  u += v -> u = u + v
     *  u -=v -> u = u -v
     *  u /=v -> u = u/v
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j = " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k = " + k);

        i = j + k;
        System.out.println("j + k =" + i);

        System.out.println("j - k =" + (j - k));

        System.out.println("j / k = " + (j / k));

        System.out.println("j % k =" + (j % k));

        System.out.println("k % j =" + (k % j));

        System.out.println("j * k =" + (j * k));

        float u, v, w;

        v = rand.nextFloat();
        System.out.println("v = " + v);
        w = rand.nextFloat();
        System.out.println("w = " + w);
        u = v + w;
        System.out.println("v:" + v + "w:" + w + " u = v + w -> u=" + u);
        u = v - w;
        System.out.println("v:" + v + "w:" + w + " u = v - w -> u=" + u);
        u = v * w;
        System.out.println("v:" + v + "w:" + w + " u = v * w -> u=" + u);
        u = v / w;
        System.out.println("v:" + v + "w:" + w + " u = v / w -> u=" + u);
        System.out.print("v:" + v + "u:" + u );
        u += v;
        System.out.println("after u += v -> u=" + u);
        System.out.print("v:" + v + "u:" + u );
        u -= v;
        System.out.println("after u -= v -> u=" + u);
        System.out.print("v:" + v + "u:" + u );
        u /= v;
        System.out.println("after  u /= v -> u=" + u);
    }
}
