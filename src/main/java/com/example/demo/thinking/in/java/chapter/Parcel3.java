package com.example.demo.thinking.in.java.chapter;

public class Parcel3 {
   private class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    protected class Destination{
        private String label;
        Destination(String whereTo){label = whereTo;}
        String readLabel(){ return label;}
    }

}
class Test3{
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //cannnot access private  class
//        Parcel3.Contents contents = p.new Contents();
        Parcel3.Destination japan = p.new Destination("Japan");
        System.out.println(p);
    }
}