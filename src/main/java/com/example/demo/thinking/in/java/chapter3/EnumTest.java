package com.example.demo.thinking.in.java.chapter3;

public class EnumTest {

    private WeekEnum weekEnum;

    public EnumTest(WeekEnum weekEnum) {
        this.weekEnum = weekEnum;
    }

    private void desc(){
        switch (weekEnum){
            case Monday:
                System.out.println("今天是周一");
                break;
            case Tuesday:
                System.out.println("今天是周二");
                break;
            case Wednesday:
                System.out.println("今天是周三");
                break;
            case Thursday:
                System.out.println("今天是周四");
                break;
            case Friday:
                System.out.println("今天是周五");
                break;
            case Saturday:
                System.out.println("今天是周六");
                break;
            case Sunday:
                System.out.println("今天是周日");
                break;
             default:
                 System.out.println("不知道今天是周几");
        }
    }
    public static void main(String[] args) {
        new EnumTest(WeekEnum.Saturday).desc();
    }
}
