package com.example.demo.thinking.in.java.chapter3;

/**
 * 使用java操作符
 */
public class Section2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        f();
        f2();
    }

    /**
     * 别名问题演示1
     */
    private static void f() {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.leave = 1;
        tank2.leave = 2;

        System.out.println("tank1.leave1:" + tank1.leave + " tank1.leave2:" + tank2.leave);

        tank1 = tank2;
        System.out.println("tank1.leave1:" + tank1.leave + " tank1.leave2:" + tank2.leave);

        tank1.leave =3;
        System.out.println("tank1.leave1:" + tank1.leave + " tank1.leave2:" + tank2.leave);
    }

    /**
     * 别名问题演示2
     */
    private static void f2(){
        Tank tank = new Tank();
        tank.leave=1;
        System.out.println("tank.leave:"+tank.leave);
        f22(tank);
        System.out.println("tank.leave:"+tank.leave);

    }
    private static void f22(Tank tank){
        tank.leave=1000;
    }


}



class Tank {
    int leave;
}
